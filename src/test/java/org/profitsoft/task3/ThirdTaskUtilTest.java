package org.profitsoft.task3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.profitsoft.task3.util.ThirdTaskUtil;

public class ThirdTaskUtilTest {

  @Test
  @Order(1)
  public void checkNullPointerException() {
    assertThrows(NullPointerException.class, () -> {
      ThirdTaskUtil.sortFigureByVolume(null);
    });
  }
}
