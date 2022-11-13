package org.profitsoft.task3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.profitsoft.task1.utils.FirstTaskUtil;
import org.profitsoft.task3.figures.Cube;
import org.profitsoft.task3.figures.Cylinder;
import org.profitsoft.task3.figures.Figure;
import org.profitsoft.task3.figures.Sphere;
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
