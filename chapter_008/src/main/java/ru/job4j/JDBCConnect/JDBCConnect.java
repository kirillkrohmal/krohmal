package ru.job4j.JDBCConnect;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by Comp on 15.04.2019.
 */
public class JDBCConnect {
    public static void main(String[] args) {
        Logger LOG = getLogger(JDBCConnect.class.getName());

        LOG.trace("trace message");
        LOG.debug("debug message");
        LOG.info("info message");
        LOG.warn("warn message");
        LOG.error("error message");
    }
}
