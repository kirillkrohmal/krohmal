package ru.job4j.SolutionTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ru.job4j.Solution.Solution;

/**
 * Created by Comp on 10.10.2018.
 */
public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
}

