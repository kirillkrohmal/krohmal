package ru.job4j.ListMap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.function.IntBinaryOperator;

/**
 * Создать класс User с полями id, name, city.
 * Cоздать клаcc UserConvert.
 * В классе UserConvert написать метод public HashMap<Integer, User> process(List<User> list) {},
 * который принимает в себя список пользователей и конвертирует его в Map
 * с ключом Integer id и соответствующим ему User.
 */
public class ListMap {
    static class User {
        private Integer id;
        private User name;
        private User city;

        public User(String petr) {

        }

        public User(Integer id, User name, User city) {
            this.id = id;
            this.name = name;
            this.city = city;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public User getName() {
            return name;
        }

        public void setName(User name) {
            this.name = name;
        }

        public User getCity() {
            return city;
        }

        public void setCity(User city) {
            this.city = city;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (id != null ? !id.equals(user.id) : user.id != null) return false;
            if (name != null ? !name.equals(user.name) : user.name != null) return false;
            return city != null ? city.equals(user.city) : user.city == null;
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (city != null ? city.hashCode() : 0);
            return result;
        }
    }

    static class UserConvert {
        public HashMap<Integer, User> process(List<User> list) {
            HashMap<Integer, User> users = new HashMap<>();


            for (User i : list) {
                users.put(i.getId(), i.getName());
            }
            return users;
        }
    }

    public static void main(String[] args) {
        UserConvert userConvert = new UserConvert();
        System.out.println(userConvert.toString());
    }
}
