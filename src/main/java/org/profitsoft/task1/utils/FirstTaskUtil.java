package org.profitsoft.task1.utils;

import java.util.Arrays;
import java.util.Objects;


public class FirstTaskUtil {

  private FirstTaskUtil() {
  }

  /**
   * Method take an array, sort it and return new one only with positive numbers
   *
   * @param arr of integers
   * @return new sorted arr with positive integers (number >= 0)
   */
  public static int[] sortPositiveNumbersInArray(int[] arr) {
    Objects.requireNonNull(arr, "Invalid null value");
    return Arrays.stream(arr).sorted().filter(num -> num >= 0).toArray();
  }
}
