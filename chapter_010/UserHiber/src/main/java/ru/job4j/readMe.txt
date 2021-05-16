Добавьте зависимость hibernate.
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.2.Final</version>
</dependency>

Создайте модель User с полями int id, String name, Calendar expired;

Создайте класс HibernateRun с методом main. В нем нужно выполнить следующее поведения.

Через Hibernate в базу данных нужно выполнить следующие операции.
Операции нужно выполнять последовательно.
В качестве базы данных использовать PostgreSQL.

create a user
find a user
update a user
find a user
delete a user
find all users

Зайлейте код.
