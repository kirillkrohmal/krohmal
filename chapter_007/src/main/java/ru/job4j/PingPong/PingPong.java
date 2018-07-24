package ru.job4j.PingPong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Comp on 04.05.2018.
 */
public class PingPong extends Application {
    private static final String JOB4J = "Пинг-понг www.job4j.ru";
    private Thread thread01;
    private Thread thread02;

    @Override
    public void start(Stage stage) throws InterruptedException {
        int limitX = 300;
        int limitY = 300;
        Group group = new Group();
        Rectangle rect = new Rectangle(50, 100, 10, 10);

        group.getChildren().add(rect);
        new Thread(new RectangleMove(rect)).join();
        new Thread(new RectangleMove2(rect)).join();
        stage.setScene(new Scene(group, limitX, limitY));
        stage.setTitle(JOB4J);
        stage.setResizable(false);
        stage.show();
    }
}



