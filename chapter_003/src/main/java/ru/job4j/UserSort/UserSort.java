package ru.job4j.UserSort;


import java.util.*;
import java.util.List;

/**
 * Необходимо создать модель User с полями name, age.
 * Класс User должен реализовать интерфейс Comparable.
 * В классе SortUser написать метод public Set<User> sort (List<User>),
 * который будет возвращать TreeSet пользователей, отсортированных по возрасту в порядке возрастания.
 */
public class UserSort {
    public class User implements Comparable<User> {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
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


        @Override
        public int compareTo(User o) {
            User user = (User) o;

            int result = age - user.age;
            if (result != 0) {
                return (int) result / Math.abs(result);
            }

            return 0;
        }
    }

    public class SortUser {
        public Set<User> sort(List<User> list) {
            TreeSet<User> sort = new TreeSet<>();
            sort.addAll(Arrays.asList(
                    new User("Gena", 25),
                    new User("Denis", 35),
                    new User("Hulio", 18)
            ));
            System.out.println(sort);
            return sort;
        }
    }


    public static void main(String[] args) {
        //User userSort = new User("asda", 5);
        //User userSort2 = new User("as", 52);
        //SortUser sort = new SortUser();
        //sort.sort();

    }
}
