2. Сканиварование проекта.

В предыдущем уроке мы познакомились со SpringDI.

Когда мы создавали контекст, мы все равно прописывали зависимые классы. Это не удобно.

SpringDI позволяет просканировать проект на те классы, которые должны быть в контексте.

Давайте введем понятие Spring bean. Это класс, который зарегистрирован в Spring Context.

Чтобы Spring понял, какие классы нужно зарегистрировать в Context нужно эти классы пометить аннотацией @Component.

Откройте класс Store.

import org.springframework.stereotype.Component;

@Component
public class Store {
Аналогично сделаем с классом StartUI

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }
Поправим загрузку Context.

package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
Теперь Spring сканирует папки ru.job4j.di. Если класс отмечен аннотацией @Component, то он регистрирует этот класс в контексте.

С помощью сканирование мы упростили регистрацию.

Задание.

1. Доработайте предыдущее задание с классами StartUI, Store, ConsoleInput.

2. Добавьте сканирование проекта.

3. Залейте код в репозиторий. Оставьте ссылку на коммит. Переведите ответственного на Петра Арсентьева.


