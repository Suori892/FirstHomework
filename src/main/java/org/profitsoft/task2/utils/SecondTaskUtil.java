package org.profitsoft.task2.utils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SecondTaskUtil {

  private SecondTaskUtil() {
  }

  /**
   * Method take a list of strings and return hashmap with five most used hashtags
   *
   *@param list of strings
   * @return map with key(hashtags) and value(number of uses)
   */

  public static Map<String, Integer> topFiveMostUsedHashtags(List<String> list) {
    Objects.requireNonNull(list, "Invalid null value");
    Map<String, Integer> map = new TreeMap<>();
    list.stream().map(string -> string.replaceAll("\\b(?<!#)[a-zA-Z,.:]+", ""))
        .forEach(string -> Arrays.stream(string.split(" ")).distinct().forEach((String tag) -> {
          if (tag.isBlank() || tag.isEmpty()) {
            return;
          }
          map.computeIfPresent(tag, (key, value) -> value += 1);
          map.putIfAbsent(tag, 1);
        }));

    return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .limit(5).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (i1, i2) -> i1,
            LinkedHashMap::new));
  }
}
