package com.company.demoArrayList;

import java.util.ArrayList;
import java.util.Random;

/** 给定20个随机数，返回一个为偶数的ArrayList */
public class DemoArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> filterList = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      int num = random.nextInt(100) + 1; // [1, 100]内的随机数
      list.add(num);
    }
    System.out.println(list);
    list.forEach(
        n -> {
          if (isOdd(n)) filterList.add(n);
        });
    System.out.println(filterList.size());
    System.out.println(filterList);
    list.removeIf(DemoArrayList::isOdd);
    System.out.println(list);
  }
  // 判断一个整数是偶数
  public static boolean isOdd(int num) {
    return num % 2 == 0;
  }
}
