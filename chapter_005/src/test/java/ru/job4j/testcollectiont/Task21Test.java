package ru.job4j.testcollectiont;


import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Task21Test {
        @Test
        public void whenHourglassWidthEquals3() {
            ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            System.setIn(in);
            Task21.main(null);
            String expected =
                    "*****" + System.lineSeparator() +
                            " * *" + System.lineSeparator() +
                            "  *" + System.lineSeparator() +
                            " * *" + System.lineSeparator() +
                            "*****";
            assertThat(out.toString(), is(expected));
        }

    @Test
    public void whenHourglassWidthEquals8() {
        ByteArrayInputStream in = new ByteArrayInputStream("8".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task21.main(null);
        String expected =
                "********" + System.lineSeparator() +
                        " *    *" + System.lineSeparator() +
                        "  *  *" + System.lineSeparator() +
                        "   **" + System.lineSeparator() +
                        "   **" + System.lineSeparator() +
                        "  *  *" + System.lineSeparator() +
                        " *    *" + System.lineSeparator() +
                        "********";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenHourglassWidthEquals9() {
        ByteArrayInputStream in = new ByteArrayInputStream("9".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task21.main(null);
        String expected =
                "*********" + System.lineSeparator() +
                        " *     *" + System.lineSeparator() +
                        "  *   *" + System.lineSeparator() +
                        "   * *" + System.lineSeparator() +
                        "    *" + System.lineSeparator() +
                        "   * *" + System.lineSeparator() +
                        "  *   *" + System.lineSeparator() +
                        " *     *" + System.lineSeparator() +
                        "*********";
        assertThat(out.toString(), is(expected));
    }
}

