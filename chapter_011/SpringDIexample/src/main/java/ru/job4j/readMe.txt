1. Spring DI. Запуск.

Spring состоит из модулей. Но в основе всех модулей режим базовый модуль - Spring DI.

Принцип его работы был описан в предыдущем уроке. В этом уроке мы сделаем туже задачу,
что и в предыдущем уроке, но через Spring DI.

Вначале нужно подключить к проекту зависимости.

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.2.4.RELEASE</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>5.2.4.RELEASE</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.2.4.RELEASE</version>
</dependency>
Создадим класс ru.job4j.di.SpringDI.

package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}

Код получился одинаковым. Мы регистрируем классы, а контекст отдает объекты.

Задание.

1. Подключите  Spring к проекту.

2. Создайте класс SpringDI. Перепишите предыдущее задание на Spring DI.

3. Залейте код в репозиторий. Оставьте ссылку на коммит. Переведите ответственного на Петра Арсентьева.


