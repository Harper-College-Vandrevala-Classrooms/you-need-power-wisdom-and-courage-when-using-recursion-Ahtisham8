package com.csc;

public class TriangleNumberCalculator {
  // Your code goes here!

  public static void main(String[] args) {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();
    System.out.println(calculator.subtract(1, 0));
  }

  public int value(int n)
  {

    if (n < 1) {
      return n;
    }

    int triNum = n + value(n-1);
    return triNum;
  }

  public int add(int n, int m)
  {

    if (n < 1) {
      return n;
    }

    int sum = value(n) + value(m);

    return sum;
  }

  public int subtract(int n, int m)
  {
    if (n < 1) {
      return n;
    }

    int subtracted = value(n) - value(m);

    return subtracted;
  }
}
