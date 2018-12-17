package ru.job4j.CrudServlet;

import java.util.List;
import java.util.Map;

/**
 * Created by Comp on 19.10.2018.
 */

public interface Store {
   void add(User user);

   void update(User user);

   void delete(User user);

   User findById(User user);

   Map findByAll();


}
