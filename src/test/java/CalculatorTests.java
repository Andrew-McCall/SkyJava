import org.junit.*;
import org.sky.Calculator;

public class CalculatorTests {

    private double x = 10.552;
    private double y = 45.6342;
    private static Calculator calculator;

    @BeforeClass
    public static void Setup(){
        System.out.println("Setup");
        calculator = new Calculator();
    }

    @Before // Each Test
    public void BeforeEachTest(){
        x++;
        y++;
    }

    @AfterClass
    public static void Shutdown(){
        System.out.println("Shutdown");
        calculator = null;
    }

    @After
    public void AfterEachTest(){
        x++;
        y++;
    }

    @Test
    public void Division(){
        Assert.assertEquals(y/x, calculator.Division(y,x), 0.00001);
        Assert.assertEquals(x/y, calculator.Division(x,y), 0.00001);
    }

    @Test
    public void NoProperties(){
        double x = 10.742;
        double y = 20.532;

        Calculator c = new Calculator();

        Assert.assertEquals(x+(y+x)-x, c.Addition(x,y), 0.00001);
        /// Delta fixes floating point inaccuracies
        // Expected :31.274000000000004
        // Actual   :31.274
    }

}
