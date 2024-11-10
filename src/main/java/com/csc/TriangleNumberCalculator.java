package com.csc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TriangleNumberCalculator {
  // Your code goes here!

  public static void main(String[] args) {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();
    System.out.println(calculator.sequence(10));
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

  public int multiply(int n, int m)
  {
    if (n < 1) {
      return n;
    }

    int product = value(n) * value(m);

    return product;
  }

  public String sequence(int n)
  {
    String output = "";
    for(int i = 0; i <= n; i++)
    {
      output += value(i) + ", ";
    }

    output = output.replaceAll(", $", "");
    
    return output;
  }
}
