package org.profitsoft.task1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.profitsoft.task1.utils.FirstTaskUtil;

public class FirstTaskUtilTest {

  @Test
  @Order(1)
  public void checkNullPointerException() {
    assertThrows(NullPointerException.class, () -> {
      FirstTaskUtil.sortPositiveNumbersInArray(null);
    });
  }

  @Test
  @Order(2)
  public void checkWithNegativeArray() {
    int[] arr = {-1, -2, -8, -10, -15, -6};
    assertEquals(0,FirstTaskUtil.sortPositiveNumbersInArray(arr).length);
  }

  @Test
  @Order(3)
  public void checkWithPositiveArray() {
    int[] arr = {-1, -2, 1, 3, 2, 0, 4, -5, 5};
    assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(FirstTaskUtil.sortPositiveNumbersInArray(arr)));
  }
}
