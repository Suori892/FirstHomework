package org.profitsoft.task3.figures;

public class Cube implements Figure {
  private double side;

  public Cube(double side) {
    this.side = side;
  }

  @Override
  public double getVolume() {
    return Math.pow(side, 3);
  }
}
