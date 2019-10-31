package ru.job4j.TrackerSQL;

import ru.job4j.TrackerSQL.Item;

import java.sql.SQLException;
import java.util.zip.DataFormatException;

/**
 * Created by Comp on 07.10.2019.
 */
interface ITracker {
    Item add(Item item) throws DataFormatException, SQLException;

    void replace(String id, ru.job4j.Tracker.Item item);

    void delete(String id);

    Item[] findAll();

    Item[] findByName(String key);

    Item findById(String id);
}
