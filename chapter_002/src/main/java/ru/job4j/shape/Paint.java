package ru.job4j.shape;

/**
 * Created by Comp on 22.06.2017.
 */
public class Paint {
    /**
     * Метод draw должен печатать псевдокартинку на консоль.
     */
    private Shape figure;

    public Paint(Shape figure) {
        this.figure = figure;
    }

    public String draw(Shape figure) {
        return figure.pic(figure);
    }
}
