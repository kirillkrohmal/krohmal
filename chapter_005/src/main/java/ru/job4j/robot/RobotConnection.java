package ru.job4j.robot;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}
