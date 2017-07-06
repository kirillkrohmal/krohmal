package ru.job4j.TestTask.Exception;

/**
 * Created by Comp on 03.07.2017.
 */
public class FigureNotFoundException extends RuntimeException {
    public FigureNotFoundException() {
    }

    public FigureNotFoundException(String message) {
        super(message);
    }

    public FigureNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FigureNotFoundException(Throwable cause) {
        super(cause);
    }

    public FigureNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
