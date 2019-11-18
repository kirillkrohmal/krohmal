package ru.job4j.StoreSQLTest;

import org.junit.Test;
import ru.job4j.StoreSQL.Config;
import ru.job4j.StoreSQL.StoreSQL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StoreSQLTest {
    @Test
    public void generateN() throws Exception {
        Config config = new Config();
        StoreSQL storeSQL = new StoreSQL(config.init());
        storeSQL.generate(1000000000);
        assertThat(storeSQL.generate(1000000000), is(1));

    }
}
