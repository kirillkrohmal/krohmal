package ru.job4j.storesqltest;

import org.junit.Test;
import ru.job4j.storesql.Config;
import ru.job4j.storesql.StoreSQL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StoreSQLTest {
    @Test
    public void generateN() throws Exception {
        Config config = new Config();
        try (StoreSQL storeSQL = new StoreSQL(config)) {
            config.init();
            int size = 138341;
            storeSQL.generate(size);
            assertThat(storeSQL.findAll(), is(size));
        }
    }
}
