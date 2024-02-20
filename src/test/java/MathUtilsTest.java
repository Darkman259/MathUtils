import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest
public MathUtils mathUtils;
{

@Before 
 public void setUp ()
  {
mathUtils = new MathUtils (); 
} 
 
@After 
 public void tearDown ()
  {
mathUtils = null;
} 
 
@Test 
 public void testAdd ()
  {
Assert.assertEquals (5, mathUtils.add (2, 3));
Assert.assertEquals (10, mathUtils.add (5, 5));
Assert.assertEquals (-1, mathUtils.add (-1, 0));
} 
 
@Test 
 public void testSubtract ()
  {
Assert.assertEquals (5, mathUtils.subtract (10, 5));
Assert.assertEquals (-5, mathUtils.subtract (5, 10));
Assert.assertEquals (0, mathUtils.subtract (5, 5));
} 

@Test 
 public void testMultiply ()
  {
Assert.assertEquals (10, mathUtils.multiply (2, 5));
Assert.assertEquals (-15, mathUtils.multiply (3, -5));
Assert.assertEquals (0, mathUtils.multiply (0, 5));
} 

@Test 
 public void testDivide ()
  {
Assert.assertEquals (2.0, mathUtils.divide (10, 5), 0.001);
Assert.assertEquals (-1.0, mathUtils.divide (10, 0), 0.001);
Assert.assertEquals (0.0, mathUtils.divide (0, 5), 0.001);
} 
} 
