import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlaceLength0() {
    int[] input1 = {};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {}, input1);
  }

  @Test
  public void testReverseInPlaceLength1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseInPlaceLength2() {
    int[] input1 = { 3, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 2, 3 }, input1);
  }

  @Test
  public void testReverseInPlaceLength3() {
    int[] input1 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 1, 2, 3 }, input1);
  }

  @Test
  public void testReversedLength0() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLength1() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[] { 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLength2() {
    int[] input1 = { 3, 2 };
    assertArrayEquals(new int[] { 2, 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLength3() {
    int[] input1 = { 3, 2, 1 };
    assertArrayEquals(new int[] { 1, 2, 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestLength0() {
    double[] input1 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWithoutLowestLength1() {
    double[] input1 = { 3 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWithoutLowestLength2() {
    double[] input1 = { 3, 2 };
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWithoutLowestLength3() {
    double[] input1 = { 3, 2, 1 };
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWithoutLowestRepeating() {
    double[] input1 = { 4, 3, 1, 1 };
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWithoutLowestRepeating2() {
    double[] input1 = { 4, 3, 2, 1, 1, 1, 1 };
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}