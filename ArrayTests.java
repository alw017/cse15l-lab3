import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
        int[] input2 = {0, 1, 2, 3};
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[]{3, 2, 1, 0}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = {0, 1, 2};
    assertArrayEquals(new int[]{2, 1, 0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvgWithoutLowest() {
    double[] input1 = {2};
    assertEquals(0d, ArrayExamples.averageWithoutLowest(input1),0.001);
    assertEquals(1d, ArrayExamples.averageWithoutLowest(new double[]{-1, -2, 3}), 0.001);
  }
}
