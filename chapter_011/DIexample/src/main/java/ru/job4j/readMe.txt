 Что такое DI?

В этом уроке мы разберем причину появления Spring.

Вернемся к проекту Tracker.


Класс StartUI зависит от классов Input, Item, Tracker. Чтобы создать объект StartUI, нужно создать объекты Tracker, Input.

В крупных проектах могут быть классы, которые имеют много зависимостей.

Чтобы упростить создание таких объектов, программисты придумали концепцию "внедрение зависимостей" с английского DI - dependency injection.

Идея DI.

1. Есть хранилище объектов. В нем мы будем регистрировать классы, объекты которых хотим иметь в проекте.

В нашем примере мы зарегистрируем там Tracker, StartUI, ConsoleInput.

2. Хранилище в рамках DI называется Context, то есть объекты относящиеся к предметной области нашего проекта.

3. После регистрации классов Context начинает инициализацию объектов. Он стоит дерево зависимостей. Сначала он создает объекты без зависимостей.

А потом создаем объекты с зависимостями.

4. После инициализации программист может получить нужный объект из Context.

Давайте мы сделаем свою реализацию DI.

Для реализации DI используется два подхода: мета программирование, рефлексия.

В этом примере мы будем использовать рефлексию. Рефлексия позволяет узнать какие элементы имеет класс в процессе выполнения программы.

Создадим класс ru.job4j.di.Store

package ru.job4j.di;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<String> data = new ArrayList<String>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}

Создадим класс ru.job4j.di.StartUI, который зависит от класса ru.job4j.di.Store.

package ru.job4j.di;

public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
Создадим класс ru.job4j.di.Context. Мы будем регистрировать классы в нем, а он будет отдавать нам проинициализированные объекты.

package ru.job4j.di;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Context {
    private Map<String, Object> els = new HashMap<String, Object>();

    public void reg(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        if (constructors.length > 1) {
            throw new IllegalStateException("Class has multiple constructors : " + cl.getCanonicalName());
        }

        Constructor con = constructors[0];
        List<Object> args = new ArrayList<Object>();
        for (Class arg : con.getParameterTypes()) {
            if (!els.containsKey(arg.getCanonicalName())) {
                throw new IllegalStateException("Object doesn't found in context : " + arg.getCanonicalName());
            }
            args.add(els.get(arg.getCanonicalName()));
        }
        tr,y {
            els.put(cl.getCanonicalName(), con.newInstance(args.toArray()));
        } catch (Exception e) {
            throw new IllegalStateException("Coun't create an instance of : " + cl.getCanonicalName(), e);
        }
    }

    public <T> T get(Class<T> inst) {
        return (T) els.get(inst.getCanonicalName());
    }
}

Разберем этот класс.

1. Карта с объектами. В ней мы будем хранить проинициализированные объекты.

    private Map<String, Object> els = new HashMap<String, Object>();
2. Метод get возвращает проинициализированный объект.

 public <T> T get(Class<T> inst) {
Через рефлексию можно получить имя класса.

inst.getCanonicalName()
3. Метод регистрации классов.

public void reg(Class cl) {
Сначала нужно получить все конструкторы класса.
Если их больше 1, то мы не знаем как загружать этот класс и кидаем исключение.

        Constructor[] constructors = cl.getDeclaredConstructors();
        if (constructors.length > 1) {
            throw new IllegalStateException("Class has multiple constructors : " + cl.getCanonicalName());
        }

Когда мы нашли конструктор, мы собираем аргументы этого конструктора и ищем уже зарегистрированные объекты, чтобы внедрить их в конструтор.

        Constructor con = constructors[0];
        List<Object> args = new ArrayList<Object>();
        for (Class arg : con.getParameterTypes()) {
            if (!els.containsKey(arg.getCanonicalName())) {
                throw ,new IllegalStateException("Object doesn't found in context : " + arg.getCanonicalName());
            }
            args.add(els.get(arg.getCanonicalName()));
        }

Последний этап - это создание объекта и добавление его в карту.

els.put(cl.getCanonicalName(), con.newInstance(args.toArray()));

Создадим класс ru.job4j.di.Main. В нем попробуем использовать наш DI.

package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}

Здесь видно, что мы сами не создаем объекты классов Store StartUI за нас это делает Context.

Задание.

1. Добавьте в класс StartUI зависимость от класса ConsoleInput.

2. С помощью Context проинициализируйте StartUI.

3. Загрузите код в репозиторий. Оставьте ссылку на коммит. Переведите ответственного на Петра Арсентьева.


