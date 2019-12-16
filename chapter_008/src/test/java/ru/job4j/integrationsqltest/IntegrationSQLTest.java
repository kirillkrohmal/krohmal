package ru.job4j.integrationsqltest;

import org.junit.Ignore;
import org.junit.Test;
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

    @Test
    public void replaceItem() throws Exception {
        try (IntegrationSQL tracker = new IntegrationSQL(ConnectionRollback.create(this.init()))) {
            Item add =  tracker.add(new Item("name1", "desc1"));
            tracker.replace(add.getId(), new Item("name", "desc"));
            Item item = new Item("name", "desc");

            assertThat(tracker.findById(add.getId()), is(item));
        }
    }

    @Test
    public void deleteItem() throws Exception {
        try (IntegrationSQL tracker = new IntegrationSQL(ConnectionRollback.create(this.init()))) {
            Item add = tracker.add(new Item("name", "desc"));
            tracker.delete("1");

            Item item = null;

            assertThat(tracker.findById(add.getId()), is(item));
        }
    }

    @Test
    public void updateItem() throws Exception {
        try (IntegrationSQL tracker = new IntegrationSQL(ConnectionRollback.create(this.init()))) {
            Item add = tracker.add(new Item("name", "desc"));
            tracker.update(new Item("test2", "test2"));
            Item item = new Item("test2", "test2");

            assertThat(tracker.findByName(add.getName()), is(item));
        }
    }

    @Test
    public void findAllItem() throws Exception {
        try (IntegrationSQL tracker = new IntegrationSQL(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name", "desc"));
            Item item = new Item("name", "desc");

            assertThat(tracker.findAll(), is(item));
        }
    }
}
