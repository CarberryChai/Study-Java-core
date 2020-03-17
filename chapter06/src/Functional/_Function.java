package Functional;

import java.util.function.Function;

public class _Function {
  public static void main(String[] args) {
    int inc1 = increase1(1);
    System.out.println(inc1);
    int inc2 = increase2.apply(1);
    System.out.println(inc2);
    int multiply = multiply10.apply(inc2);
    System.out.println(multiply);
    Function<Integer, Integer> add1Multipy10 = increase2.andThen(multiply10);
    System.out.println(add1Multipy10.apply(1));
  }

  static Function<Integer, Integer> multiply10 = num -> num * 10;
  static Function<Integer, Integer> increase2 = num -> num + 1;

  static int increase1(int num) {
    return num + 1;
  }
}
