import org.example.Main;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class TestCal {
    private static final double DELTA;

    static {
        DELTA = 1e-12;
    }

    Main calculator = new Main();

    @Before
    public void before_test() {
        System.out.println();
        System.out.println("Starting test cases");
    }

    @Test
    public void square_root_true_positive()
    {
        System.out.println("Building square root true positive test cases");
        assertEquals("Square root function is not working properly",5,calculator.square_root(25),DELTA);
        assertEquals("Square root function is not working properly",1,calculator.square_root(1),DELTA);
        assertEquals("Square root function is not working properly",0,calculator.square_root(0),DELTA);
    }

    @Test
    public void square_root_false_positive()
    {
        System.out.println("Building square root false positive test cases");
        assertNotEquals("Square root function working properly",2,calculator.square_root(25),DELTA);
        assertNotEquals("Square root function working properly",0,calculator.square_root(1),DELTA);
        assertNotEquals("Square root function working properly",5,calculator.square_root(0),DELTA);
    }

    @Test
    public void factorial_true_positives()
    {
        System.out.println("Building factorial true positive test cases");
        assertEquals("Factorial function is not working properly",40320,calculator.factorial(8),DELTA);
        assertEquals("Factorial function is not working properly",6,calculator.factorial(3),DELTA);
        assertEquals("Factorial function is not working properly",1,calculator.factorial(0),DELTA);
    }

    @Test
    public void factorial_false_positives()
    {
        System.out.println("Building factorial false positive test cases");
        assertNotEquals("Factorial function is working properly",56,calculator.factorial(6),DELTA);
        assertNotEquals("Factorial function is working properly",9,calculator.factorial(5),DELTA);
        assertNotEquals("Factorial function is working properly",0,calculator.factorial(0),DELTA);
    }

    @Test
    public void natural_log_true_positives()
    {
        System.out.println("Building natural logarithm true positive test cases");
        assertEquals("Natural logarithm function is not working properly",0,calculator.natural_logarithm(1),DELTA);
    }

    @Test
    public void natural_log_false_positives()
    {
        System.out.println("Building natural logarithm false positive test cases");
        assertNotEquals("Natural logarithm function is working properly",6,calculator.natural_logarithm(15),DELTA);
        assertNotEquals("Natural logarithm function is working properly",9,calculator.natural_logarithm(29),DELTA);
        assertNotEquals("Natural logarithm function is working properly",1,calculator.natural_logarithm(1),DELTA);
    }

    @Test
    public void power_true_positives()
    {
        System.out.println("Building power true positive test cases");
        assertEquals("Power function is not working properly",32,calculator.power(2,5),DELTA);
        assertEquals("Power function is not working properly",1,calculator.power(9,0),DELTA);
        assertEquals("Power function is not working properly",9,calculator.power(3,2),DELTA);
    }

    @Test
    public void power_false_positives()
    {
        System.out.println("Building power false positive test cases");
        assertNotEquals("Power function is working properly",9,calculator.power(2,5),DELTA);
        assertNotEquals("Power function is working properly",0,calculator.power(9,0),DELTA);
        assertNotEquals("Power function is working properly",6,calculator.power(3,2),DELTA);
    }


    @After
    public void after_test() {
        System.out.println("Ending test cases");
        System.out.println();
    }

}
