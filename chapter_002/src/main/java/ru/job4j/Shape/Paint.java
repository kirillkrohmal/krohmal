package ru.job4j.Shape;

/**
 * Created by Comp on 22.06.2017.
 */
public class Paint {
    /**
     * Метод draw должен печатать псевдокартинку на консоль.
     */
    private Shape shape;

    public Paint(Shape shape) {
        this.shape = shape;
    }

    public String draw(String figure) {
        return shape.pic(figure);
    }
}
