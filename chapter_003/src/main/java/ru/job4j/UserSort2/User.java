package ru.job4j.UserSort2;


/**
 * В классе SortUser из 1-го задания необходимо написать два метода:
 * 1) public List<User> sortNameLength (List<User>) - в этом методе необходимо
 * определить Comparator для метода Collections.sort и отсортировать List<User> по длине имени.
 * 2) public List<User> sortByAllFields (List<User>) - в этом методе необходимо определить
 * Comparator для метода Collections.sort и отсортировать List<User> по 2-м полям, сначала
 * проверка по имени, потом по возрасту.
 */
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int length() {
        return name.length();
    }
}


