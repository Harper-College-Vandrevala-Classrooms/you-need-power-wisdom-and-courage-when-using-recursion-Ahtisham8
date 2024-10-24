package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  // Your tests go here
  @Test
  void testValueForFour()
  {
    assertEquals(10, calculator.value(4));
  }
  @Test
  void testValueForZero()
  {
    assertEquals(0, calculator.value(0));
  }
  @Test
  void testValueForOne()
  {
    assertEquals(1, calculator.value(1));
  }
  @Test
  void testValueForTwo()
  {
    assertEquals(3, calculator.value(2));
  }
  @Test
  void testValueForFive()
  {
    assertEquals(15, calculator.value(5));
  }
  @Test
  void testValueForTen()
  {
    assertEquals(55, calculator.value(10));
  }
  @Test
  void testAddOneAndOne()
  {
    assertEquals(2, calculator.add(1, 1));
  }
  @Test
  void testAddZeroAndZero()
  {
    assertEquals(0, calculator.add(0, 0));
  }
  @Test
  void testAddTwoAndThree()
  {
    assertEquals(9, calculator.add(2, 3));
  }
  @Test
  void testAddFourAndTwo()
  {
    assertEquals(13, calculator.add(4, 2));
  }
  @Test
  void testSubOneAndOne()
  {
    assertEquals(0, calculator.subtract(1, 1));
  }
  @Test
  void testSubTwoAndThree()
  {
    assertEquals(-3, calculator.subtract(2, 3));
  }
  @Test
  void testSubFourAndTwo()
  {
    assertEquals(7, calculator.subtract(4, 2));
  }
  @Test
  void testSubZeroAndZero()
  {
    assertEquals(0, calculator.subtract(0, 0));
  }
}
