package org.profitsoft.task3.figures;

public class Cylinder implements Figure {
  private double radius;
  private double height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  @Override
  public double getVolume() {
    return Math.PI * radius * 2 * height;
  }
}
