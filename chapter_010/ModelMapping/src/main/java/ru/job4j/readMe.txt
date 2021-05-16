Давайте вспомним, какие у нас бывают связи в SQL.

- one-to-one
- many-to-one
- one-to-many
- many-to-many

1. One-to или to-one.

Связь one-to или to-one осуществляется за счет добавление вторичного ключа в основную таблицу.

Например, у нас есть таблица car и таблица engine. Связь между ними one-to-one.

create table engine (
  id serial primary key
);

create table car (
  id serial primary key,
  engine_id int not null unique references engine(id)
);
Здесь мы добавили ограничение на колонку engine_id за счет ссылки на таблицу engine и ограничение на уникальность.

Чтобы сделать связь one-to-many или many-to-one, нам нужно убрать ограничение на уникальность.

В Hibernate связь прописывается через тег many-to-one в xml

<many-to-one name="engine" class="Engine" column="engine_id"/>
или через аннотацию @ManyToOne

@ManyToOne
@JoinColumn(name = "engine_id", foreignKey = @ForeignKey(name = "ENGINE_ID_FK") )
private Engine engine;
Hibernate целиком загружает связанный объект.

2. Many-to-many.

Связь many-to-many осуществляется за счет вспомогательной таблицы.

Например, y машины есть список всех владельцев и у владельцев есть список машин.

create table driver (
  id serial primary key
);

create table car (
  id serial primary key,
  engine_id int not null unique references engine(id)
);

create table history_owner (
   id serial primary key,
   driver_id int not null references driver(id),
   car_id int not null references car(id)
);
Здесь используется дополнительная таблица history_owner. По ней можно получить список всех машин водителя, а так же получить список всех владельцев по машине.

Xml
<set name="owners" table="history_owner" inverse="true" lazy="true" fetch="select">
  <key>
    <column name="driver_id" not-null="true" />
  </key>
  <many-to-many entity-name="Car">
    <column name="car_id" not-null="true" />
  </many-to-many>
</set>
Аннотация.
@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinTable(name = "history_owner", joinColumns = {
  @JoinColumn(name = "driver_id", nullable = false, updatable = false) },
 inverseJoinColumns = { @JoinColumn(name = "car_id",
 nullable = false, updatable = false) })
public Set<Driver> getDrivers() {
   return drivers;
}

Дополнительная литература.

https://docs.jboss.org/hibernate/orm/5.4/userguide/html_single/Hibernate_User_Guide.html#mapping-types

Задание.

Здесь нужно сделать два варианта моделей. Создайте 4 таблицы: car, engine, driver, history_owner.

1. на xml
2. на аннотациях.
3. Написать тесты создания, редактирование и удаление.
