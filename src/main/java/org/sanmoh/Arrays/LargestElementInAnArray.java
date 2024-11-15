package org.sanmoh.Arrays;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Largest Element in an Array
 *
 * <h2>Problem Statement
 *
 * <p>Given an array arr[] of size n, the task is to find the largest element in the given array.
 *
 * <pre>
 *    array = [10, 20, 4]
 *
 * <h3>Sample Output
 *
 * <pre>
 *    20
 */
public class LargestElementInAnArray {
  /**
   * Finds the largest element in the given array using a brute-force approach.
   *
   * @param array the array of integers in which the largest element is to be found
   * @return the largest element in the provided array
   */
  @Contract(pure = true)
  public static Integer BruteForce(Integer @NotNull [] array) {
    // Initialize the largest element as the first element of the array
    Integer largest = array[0];
    // Iterate through the array and update the largest element if a larger element is found
    for (Integer integer : array) if (integer > largest) largest = integer;
    // Return the largest element
    return largest;
  }
}
