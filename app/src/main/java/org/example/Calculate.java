package org.example;

public class Calculate {

  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sumFromOneTo(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  public double averageFromOneTo(int n) {
    return sumFromOneTo(n) / (double) n;
  }

  public int sumOddFromOneTo(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i += 2) {
      sum += i;
    }
    return sum;
  }

  public int sumEvenFromOneTo(int n) {
    int sum = 0;
    for (int i = 2; i <= n; i += 2) {
      sum += i;
    }
    return sum;
  }
}
