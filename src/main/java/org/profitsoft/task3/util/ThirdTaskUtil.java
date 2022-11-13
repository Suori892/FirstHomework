package org.profitsoft.task3.util;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.profitsoft.task3.figures.Figure;

public class ThirdTaskUtil {
  private ThirdTaskUtil() {
  }

  public static List<Figure> sortFigureByVolume(List<Figure> list) {
    Objects.requireNonNull(list, "Invalid null value");
    return list.stream().sorted(Comparator.comparing(Figure::getVolume)).toList();
  }
}
