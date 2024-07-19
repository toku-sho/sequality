package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Calculate calc = new Calculate();
    System.out.println(calc.sum(2, 3));
  }
}
