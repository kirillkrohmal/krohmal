0. Конфигурация Hibernate


Hibernate позволяет модели данных записывать в базу данных. 

В предыдущих уроках для записи в базу данных мы использовали JDBC. Hibernate упрощает работу с базой.

Хотя внутри Hibernate так же использует JDBC.

Откройте проект job4j_tracker.

ООП и модели появились в этом проекте в первый раз. Будем на нем тренироваться. 

Зависимости.

Откройте pom.xml и добавьте в него зависимости hibernate.

<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.15.Final</version>
</dependency>
В нашем проекте уже есть JDBC.

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.2.12</version>
</dependency>
Hibernate будет использовать этот драйвер для работы с базой.

 

Модель данных.

У нас есть модель данных ru.job4j.tracker.item.

package ru.job4j.tracker;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
Чтобы Hibernate мог с ней работать модуль нужно пометить аннотациями

@Entity
@Table(name = "items")
Entity указывает, что это модель, которую можно сохранить в базу. Table указывает на таблицу.

Таблица в базе описывается схемой.

create table items (
  id serial primary key;
  name varchar(2000)
);
В модели нужно указать, какое поле является первичным ключом.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
Про аннотацию Generated мы поговорим в следующем уроке.

 

Конфигурация Hibernatе - hibernate.cfg.xml.

В предыдущей версии проекта трекер мы использовали файл app.properties.

Hibernate использует свой файл настроек. Создайте пустой файл hibernate.cfg.xml в папке resources.



Заполните его следующим текстом.

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.url">jdbc:postgresql://127.0.0.1:5432/tracker</property>
        <property name="hibernate.connection.username">postgres</property>
        <property name="hibernate.connection.password">password</property>
        <property name="hibernate.connection.pool_size">1</property>
        <property name="hibernate.current_session_context_class">thread</property>
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQL10Dialect</property>

        <mapping class="ru.job4j.tracker.Item" />
    </session-factory>
</hibernate-configuration>
В настройках проверьте поля url, username и password. В вашем окружении они могут отличаться.

Настройки pool, session_context мы обсудим в дальнейших уроках.

 

Объекты SessionFactory и Session.

SessionFactory - это объект конфигуратор. Он создается один раз на все приложение. В нем происходит создания пулов, загрузка кешей, проверка моделей. 

Создание этого объекта трудозатратное. 

SessionFactory имеет метод openSession, который отдает объект Session. Объект Session позволяет записать, удалить и прочитать данные из базы.

Этот объект создается быстро.

Создадим класс HibernateRun в котором покажем операции создания, редактирования, удаления и чтения модели Item.

package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class HibernateRun {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try {
            SessionFactory sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Item item = create(new Item("Learn Hibernate"), sf);
            System.out.println(item);
            item.setName("Learn Hibernate 5.");
            update(item, sf);
            System.out.println(item);
            Item rsl = findById(item.getId(), sf);
            System.out.println(rsl);
            delete(rsl.getId(), sf);
            List<Item> list = findAll(sf);
            for (Item it : list) {
                System.out.println(it);
            }
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public static Item create(Item item, SessionFactory sf) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
        session.close();
        return item;
    }

    public static void update(Item item, SessionFactory sf) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.update(item);
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(Integer id, SessionFactory sf) {
        Session session = sf.openSession();
        session.beginTransaction();
        Item item = new Item(null);
        item.setId(id);
        session.delete(item);
        session.getTransaction().commit();
        session.close();
    }

    public static List<Item> findAll(SessionFactory sf) {
        Session session = sf.openSession();
        session.beginTransaction();
        List result = session.createQuery("from ru.job4j.tracker.Item").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public static Item findById(Integer id, SessionFactory sf) {
        Session session = sf.openSession();
        session.beginTransaction();
        Item result = session.get(Item.class, id);
        session.getTransaction().commit();
        session.close();
        return result;
    }
}
1. Создание объекта SessionFactory.

final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
        .configure().build();
Этот объект создается через фабрику. Метод configure читает файл hibernate.cfg.xml и выполняет инициализация пула и кешей.

2. Методы create, update, delete работает с объектом Session.

Session session = sf.openSession();
Любое действие с базой происходит в транзакции. 


3. Методы поиска - find. 

List result = session.createQuery("from ru.job4j.tracker.Item").list();
Обратите внимание Hibernate собирает объект сам. Мы не прописываем, какие поля нужно достать.

Кода по сравнению с чистым JDBC стало меньше.

 

Задание.

1. Подключите к проекту job4j_tracker фреймвокр Hibernate.

2. Создайте класс ru.job4j.tracker.HibernateRun. Скопируйте код приведенный в задаче. Запустите его и проверьте его работу.

3. Загрузите код в репозиторий. Оставьте ссылку на коммит.

4. Переведите ответственного на Петра Арсентьева.