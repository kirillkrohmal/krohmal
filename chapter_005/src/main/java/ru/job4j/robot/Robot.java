package ru.job4j.robot;

public class Robot {

    public static void myRobot(RobotConnectionManager connectionManager, int x, int y) throws Exception {
        boolean b = false;
        for (int i = 0; i < 3 && !b; i++) {

            try(RobotConnection connection = connectionManager.getConnection()) {
                connection.moveRobotTo(x,y);
                b = true;
            } catch (Exception e) {

            } 

        }

        if (!b) {
            throw new Exception();
        }
    }
}
