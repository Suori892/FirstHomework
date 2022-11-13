package org.profitsoft.task2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.profitsoft.task2.utils.SecondTaskUtil;

public class SecondTaskUtilTest {
  @Test
  @Order(1)
  public void checkNullPointerException() {
    assertThrows(NullPointerException.class, () -> {
      SecondTaskUtil.topFiveMostUsedHashtags(null);
    });
  }

  @Test
  @Order(2)
  public void checkEmptyArgument() {
    assertEquals(new TreeMap<>(), SecondTaskUtil.topFiveMostUsedHashtags(new ArrayList<>()));
  }

  @Test
  @Order(3)
  public void checkDuplicates() {
    List<String> list = new ArrayList<>();
    Map<String, Integer> result = new TreeMap<>();
    list.add("Finally I found this #book. I have been looking for this #book since last month.");
    result.put("#book", 1);
    assertEquals(result, SecondTaskUtil.topFiveMostUsedHashtags(list));
  }

  @Test
  @Order(4)
  public void checkNormalText() {
    List<String> list = new ArrayList<>();
    Map<String, Integer> result = new TreeMap<>();
    Collections.addAll(list, "I like this #book", "This #car is amazing",
        "I remember that #trip", "It is my favourite #book", "I saw this #car yesterday");
    result.put("#book", 2);
    result.put("#car", 2);
    result.put("#trip", 1);
    assertEquals(result, SecondTaskUtil.topFiveMostUsedHashtags(list));
  }
}
