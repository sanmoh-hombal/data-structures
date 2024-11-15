package org.sanmoh.Arrays;

import java.util.Objects;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Linear Search
 *
 * <h2>Problem Statement
 *
 * <p>Given an array, arr of n integers, and an integer element x, find whether element x is present
 * in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn’t
 * exist.
 *
 * <pre>
 *    array = [1, 2, 3, 4]
 *    targetSum = 2
 *
 * <h3>Sample Output
 *
 * <pre>
 *    true
 */
public class LinearSearch {
  /**
   * Searches for a specific key in the given integer array.
   *
   * @param array The array of integers to be searched.
   * @param key The integer value to be searched for in the array.
   * @return Boolean.TRUE if the key is found in the array, otherwise Boolean.FALSE.
   */
  @Contract(pure = true)
  public static Boolean Search(Integer @NotNull [] array, Integer key) {
    // Iterate through the array
    for (Integer integer : array)
      // If the element is found, return true
      if (Objects.equals(integer, key)) return Boolean.TRUE;

    // If the element is not found, return false
    return Boolean.FALSE;
  }
}
