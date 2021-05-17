
Что будет если два раза получить из контекста bean?



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        Store store = context.getBean(Store.class);
        store.add("Petr Arsentev");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);
    }
}


Spring по умолчанию создает объекты в режиме singleton, то есть один объект на виртуальную машину.

В bean можно задать режим создания объекта. Spring поддерживаем 6 режимов.

Режим prototype будет создавать новый объект, каждый раз, когда мы просим его от контекста.

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Store {
В этом случае на консоли не будет выведен текст, потому что объект Store будет вызван всегда новый.

В своей практики я ни разу не использовать эти режимы. Мы их касаемся для собеседования.

Перечистим все режимы.

1. singleton - объект создает один раз на всю виртуальную машину.

2. prototype - каждый раз создается новый объект.

3. session - объект существует, пока существует сессия пользователя.

4. request - объект существует, пока существует запрос.

5. application - объект существует, пока существует ServletContext.

6. websocket - объект существует, пока есть активная сессия для web-сокета.

Задание.

1. Переделайте объекты StartUI и Store на режим prototype.

2. Загрузите код в репозиторий. Оставьте ссылку на коммит. Переведите ответственного