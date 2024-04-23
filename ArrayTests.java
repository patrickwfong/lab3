import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 5, 9, 3, 2, 6 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 6, 2, 3, 9, 5 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 5, 9, 3, 2, 6 };
    ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{ 6, 2, 3, 9, 5 }, ArrayExamples.reversed(input2));
  }
}
