package ru.job4j.UserSort;


import java.util.*;
import java.util.List;

/**
 * В классе SortUser из 1-го задания необходимо написать два метода:
 * 1) public List<User> sortNameLength (List<User>) - в этом методе необходимо
 * определить Comparator для метода Collections.sort и отсортировать List<User> по длине имени.
 * 2) public List<User> sortByAllFields (List<User>) - в этом методе необходимо определить
 * Comparator для метода Collections.sort и отсортировать List<User> по 2-м полям, сначала
 * проверка по имени, потом по возрасту.
 */
public class UserSort2 {
    public class User implements Comparator<User> {
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
        public int compare(User o1, User o2) {
            return 0;
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

        public List<User> sortNameLength(List<User> list) {

            list = new ArrayList<>();
            list.addAll(Arrays.asList(
                    new User("Геннадий", 25),
                    new User("Денис", 35),
                    new User("Хулио", 18)
            ));

            new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return o1.name.compareTo(o2.name);
                }

                @Override
                public boolean equals(Object obj) {
                    return false;
                }
            };

            return null;
        }

        public List<User> sortByAllFields(List<User> list) {
            list = new ArrayList<>();
            list.addAll(Arrays.asList(
                    new User("Геннадий", 25),
                    new User("Денис", 35),
                    new User("Хулио", 18)
            ));

            new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return o1.name.compareTo(o2.name);
                }

                @Override
                public boolean equals(Object obj) {
                    return false;
                }
            };

            return list;
        }
    }


    public static void main(String[] args) {
        //User userSort = new User("asda", 5);
        //User userSort2 = new User("as", 52);
        //SortUser sort = new SortUser();
        //sort.sort();
    }
}
