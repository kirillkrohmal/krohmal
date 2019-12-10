package ru.job4j.integrationsqltest;

import org.junit.Ignore;
import ru.job4j.integrationsql.ConnectionRollback;
import ru.job4j.integrationsql.IntegrationSQL;
import ru.job4j.integrationsql.Item;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class IntegrationSQLTest {
    public Connection init() {
        try (InputStream in = IntegrationSQL.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }


    @Ignore
    public void createItem() throws Exception {
        try (IntegrationSQL tracker = new IntegrationSQL(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name", "desc"));
            //Item item = new Item( "name", "desc");

            assertThat(tracker.findByName("name").length, is(1));
        }
    }
}
