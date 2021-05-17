

Класс StartUI зависит от класса Store. Spring определяет зависимость через конструктор.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }


Такой подход является предпочтительным, я покажу причину этого при тестировании.

@Autowired.

Другой подход это использовать аннотация @Autowired.

Перепишем код на него.

package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private Store store;

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
Я пометил поле аннотацией @Autowired и убрал конструктор. Spring анализирует класс через рефлексию и проставляет нужные поля, если они отмечены @Autowired.

Внедрение через set.

Другой способ внедрение зависимости через set методы.

package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;

    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }


Итого у нас вышло 3 способа внедрение зависимости.

1. Через конструктор. Правильный способ.

2. Через поле и аннотацию @Autowired. Нежелательный способ.

3. Через метод set и аннотацию @Autowired. Нежелательный способ.

Задание.

1. Перепишите класс ru.job4j.di.StartUI. Внедрение зависимостей сделайте через поле и @Autowired.

2. Залейте код в репозиторий. Оставьте ссылку на коммит. Переведите ответственного на Петра Арсентьева.


