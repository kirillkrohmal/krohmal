package Tracker;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * Created by Comp on 12.06.2017.
 */
public class TrackerSQL implements ITracker, AutoCloseable {
    private final int STORAGE_SIZE = 200;
    private List<Item> userActionList = new ArrayList<>(STORAGE_SIZE);
    private int size = 0;

    String generateId() {
        return String.valueOf(new Random().nextInt(userActionList.size()) + 100);
    }

    public Item add (Item item) {
        if (size == STORAGE_SIZE - 1) {
            System.out.println("Недостаточно памяти. Вводить заявки больше нельзя");
        }

        userActionList.add(size++, item);
        return item;
    }

    public void delete (String id) {
        for (int i = 0; i < userActionList.size(); i++) {
            if (userActionList.get(i) != null && userActionList.get(i).getId().equals(id)) {
                userActionList.set(i, null);
                userActionList.set(i, userActionList.get(size - 1));
                userActionList.set(size - 1, null);
                size--;
                return;
            }
        }
    }

    public void update (Item newItem) {
        for (int i = 0; i < userActionList.size(); i++) {
            if (userActionList.get(i).getId().equals(newItem.getId())) {
                userActionList.add(i, newItem);
                break;
            }
        }
    }

    public Item findByName (String name) {
        Item result = null;

        for (Item item : userActionList) {
            if (item.getName().equals(name) && userActionList != null) {
                result = item;
            }
        }

        return result;
    }

    public Item findById (String id) {
        Item result = null;

        for (Item item : userActionList) {
            if (item.getId().equals(id) && userActionList != null) {
                result = item;
            }
        }

        return result;
    }

    public List<Item> findAll () {
        List<Item> items = new ArrayList<Item>();

        for (int i = 0; i < size; i++) {
            items.add(i, userActionList.get(i));
        }

        return items;
    }

    public void exit () {
        System.exit(0);
    }


    @Override
    public void close() throws Exception {

    }

    private Connection connection;

    public boolean init() {
        try (InputStream in = TrackerSQL.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("com.postgresql.jdbc.Driver"));
            this.connection = DriverManager.getConnection(
                    config.getProperty("jdbc:postgresql://localhost:5432/postgres"),
                    config.getProperty("postgres"),
                    config.getProperty("root")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        return this.connection != null;
    }

}
