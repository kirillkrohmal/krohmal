package ru.job4j.TrackerSQL;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Comp on 12.06.2017.
 */
public class TrackerSQL implements ITracker, AutoCloseable {
    @Override
    public Item add(Item item) throws SQLException {
        int nextId = 100;
        try (Connection connection = init()) {
            if (nextId != 0) {
                String s = "INSERT INTO trackersql(id, key, name, creat, description) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(s);
                statement.setLong(1, nextId);
                statement.setString(2, item.getKey());
                statement.setString(3, item.getName());
                statement.setLong(4, item.getCreat());
                statement.setString(5, item.getDescription());

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public void replace(String id, Item item) {

    }

    @Override
    public void delete(String id) {
        try (Connection connection = init()) {
            String s = "DELETE FROM trackersql WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setString(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Item newItem) {
        Long nextId = null;

        try (Connection connection = init()) {
            if (nextId != null) {
                String s = "UPDATE trackersql SET key = ?, name = ?, creat = ?, description = ?) WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(s);
                statement.setLong(1, nextId);
                statement.setString(2, newItem.getKey());
                statement.setString(3, newItem.getName());
                statement.setLong(4, newItem.getCreat());
                statement.setString(5, newItem.getDescription());

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Item[] findByName(String name) {
        Item[] result = null;

        try (Connection connection = init()) {
            String s = "SELECT name FROM trackersql WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public Item findById(String id) {
        Item result = null;

        try (Connection connection = init()) {
            String s = "SELECT id, key, name, creat, description FROM trackersql WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public Item[] findAll() {
        Item[] items = new Item[0];
        Long nextId = null;

        try (Connection connection = init()) {
            if (nextId != null) {
                String s = "SELECT * FROM trackersql";
                PreparedStatement statement = connection.prepareStatement(s);

                statement.executeUpdate();

                return items;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    public void exit() {
        System.exit(0);
    }

    public static Connection init() throws SQLException {
        Properties config = new Properties();

        try (InputStream in = TrackerSQL.class.getClassLoader().getResourceAsStream("app.properties")) {
            config.load(in);
            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        String url = config.getProperty("url");
        String username = config.getProperty("username");
        String password = config.getProperty("password");

        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection conn = init()) {
            System.out.println("Connection to Postgres SQL succesfull!");
        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }

        TrackerSQL sql = new TrackerSQL();
    }

    @Override
    public void close() throws Exception {

    }
}
