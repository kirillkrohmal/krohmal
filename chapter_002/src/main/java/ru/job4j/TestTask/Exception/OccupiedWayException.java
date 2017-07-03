package ru.job4j.TestTask.Exception;

/**
 * Created by Comp on 03.07.2017.
 */
public class OccupiedWayException extends Exception {
    public OccupiedWayException() {
    }

    public OccupiedWayException(String message) {
        super(message);
    }

    public OccupiedWayException(String message, Throwable cause) {
        super(message, cause);
    }

    public OccupiedWayException(Throwable cause) {
        super(cause);
    }

    public OccupiedWayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
