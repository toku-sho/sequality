package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.01);
  }

  @Test
  public void testSumFromOneTo() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumFromOneTo(10));
  }

  @Test
  public void testAverageFromOneTo() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.averageFromOneTo(10), 0.01);
  }

  @Test
  public void testSumOddFromOneTo() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOddFromOneTo(10));
  }

  @Test
  public void testSumEvenFromOneTo() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumEvenFromOneTo(10));
  }
}
