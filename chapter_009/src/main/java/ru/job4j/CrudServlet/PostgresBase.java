package ru.job4j.CrudServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by Comp on 06.11.2017.
 */
public class PostgresBase {
    private static final Logger log = LoggerFactory.getLogger(PostgresBase.class);

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        String dbUrl = "jdbc:postgresql://localhost:5432/java_a_from_z";
        String user = "postgres";
        String password = "";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        // Загружаем драйвер (регистрирует себя)
        Connection c = null;

        try {
            c = DriverManager.getConnection(dbUrl, user, password);
            PreparedStatement ps = c.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(String.format("%s %s %s %s", rs.getString("login"), rs.getString("password"), rs.getTimestamp("create_date")));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            //log.error(e.getMessage(), e);
        } finally {
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    //log.error(e.getMessage(), e);
                }
            }
        }
    }
}
