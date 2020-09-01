import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class JunitTestingWalkthrough {
//This is where all of our testing will live

    //The @Before annotation is a great spot to instantiate variables and objects that will be used multiple times in our tests

    ArrayList<Integer>grades;

    @Before

    public void setUp(){
        this.grades = new ArrayList<>();
        this.grades.add(99);
    }

    @Test
    public void testIfGradesInitialized(){
        assertNotNull(this.grades);
    }
    @Test
    public void testIfCanAddGrades(){
        assertEquals(1,this.grades.size());
        this.grades.add(100);
        assertEquals(2, this.grades.size()); // was the ArrayList added to?
        assertSame(99, this.grades.get(0)); // are the expected values in the ArrayList?
        assertSame(100, this.grades.get(1)); // are the expected values in the ArrayList?
    }

    @Test
    public void testIfEqual(){
    // check if two values are equal to each other
        String casey = "Casey";
        String yesac = "Casey";

//        assertEquals(casey, yesac);
//        assertNotEquals(casey, yesac);

        //Test if double/floating point numbers are the same, with a range
        double serialNo = 234.314;
        double mpn = 234.310;
        assertEquals(serialNo, mpn, .009);
        //Ensuring the two numbers are the same down to the cent, but not thousandth of a cent
    }
    @Test
    public void testIfSame(){
        Object casey = new Object();
        Object david = new Object();
        Object tristan = david;

        assertNotSame(casey, david);
        assertSame(david, tristan);
    }
    @Test
    public void testIfArraySame(){
        char[] expected = {'J','u', 'n', 'i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForBoolean(){
        boolean oreoTime = true;

        assertTrue(oreoTime);
        assertTrue("25 oreos is more than 10", 25 > 10);
        assertTrue("10 is not greater than 38", 10 > 38);
    }
}
