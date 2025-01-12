
public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for (int i = 0; i < arr.length / 2; i += 1) {
      int swapWithIndex = arr.length - i - 1; // The index of the value to swap with
      int originalValue = arr[i]; // Preserve the original value
      arr[i] = arr[swapWithIndex];
      arr[swapWithIndex] = originalValue;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for (int i = 0; i < arr.length; i += 1) {
      newArray[arr.length - i - 1] = arr[i];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if (arr.length < 2) {
      return 0.0;
    }
    double lowest = arr[0];
    for (double num : arr) {
      if (num < lowest) {
        lowest = num;
      }
    }
    double sum = 0;
    int numLowest = 0; // Tracks the # of lowest items in the array (i.e. number of items not in the
                       // sum)
    for (double num : arr) {
      if (num != lowest) {
        sum += num;
      } else {
        numLowest++;
      }
    }
    return sum / (arr.length - numLowest);
  }

}
