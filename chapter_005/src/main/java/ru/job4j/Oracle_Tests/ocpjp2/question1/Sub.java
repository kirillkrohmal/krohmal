package ru.job4j.Oracle_Tests.ocpjp2.question1;

/**
 * Что будет выведено на консоль?
 * 1. Habr Tort
 * 2. Habr Habr
 * 3. Tort Habr
 * 4. Tort Tort
 * 5. ошибка компиляции
 */
public class Sub extends Super {
    public String name = "Habr";

    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.name + " " + s.getName());
    }
}

/**
 * Данный код выведет Tort Tort. Вроде как должен работать полиморфизм, и, как известно, выбор осуществляется по типу объекта,
 * на который ссылается ссылка, а не по типу самой ссылки. Но в джаве есть переопределенные методы. И всё.
 * Переопределенных полей либо конструкторов просто не существует.
 * То есть реализация метода всегда выбирается в зависимости от объекта, на который мы ссылаемся.
 * Поля класса, наоборот, выбираются исходя из типа ссылки, и переопределение тут не работает. Поэтому мы и получаем такой
 * результат.
 */
