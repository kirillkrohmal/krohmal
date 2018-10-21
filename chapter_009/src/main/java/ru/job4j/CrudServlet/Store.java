package ru.job4j.CrudServlet;

import java.util.List;

/**
 * Created by Comp on 19.10.2018.
 */

public interface Store {

   void add(User user);

   void update(User user);

   void delete(User user);

   List<User> findAll();

   User findById();

   User findByLogin();

}
