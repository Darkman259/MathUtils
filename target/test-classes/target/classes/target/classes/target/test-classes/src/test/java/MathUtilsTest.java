import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


//basic test class for mathutil
public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, mathUtils.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(6, 0), 0.0001);
    }
}