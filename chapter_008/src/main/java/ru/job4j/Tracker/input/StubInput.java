package Tracker.input;

/**
 * Created by Comp on 12.04.2019.
 */
public class StubInput implements Input{
    private String[] answers;
    private int position = 1;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }

    @Override
    public int ask(String question, int[] range) {
        throw new UnsupportedOperationException("UnsupportedException");
    }
}
