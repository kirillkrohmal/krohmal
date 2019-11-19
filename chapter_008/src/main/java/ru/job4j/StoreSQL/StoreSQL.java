package ru.job4j.StoreSQL;

import java.sql.*;
import java.util.Collections;
import java.util.List;

public class StoreSQL implements AutoCloseable {
    private Config config;
    private Connection connect = config.init();

    public StoreSQL(Config config) {
        this.config = config;
    }

    public void generate(int size) {
        for (int i = 0; i < size; i++) {
            String s1 = "INSERT INTO test(i) VALUES (?)";

            try (PreparedStatement statement = connect.prepareStatement(s1);) {
                statement.setString(1, s1);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public String findAll() {
        String s1 = "SELECT size FROM test";

        try (PreparedStatement statement = connect.prepareStatement(s1);) {
            statement.setString(1, s1);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return s1;
    }

    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Entry> load() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void close() throws Exception {
        if (connect != null) {
            connect.close();
        }
    }

    public static void main(String[] args) {
        createNewDatabase("test.db");
    }
}
