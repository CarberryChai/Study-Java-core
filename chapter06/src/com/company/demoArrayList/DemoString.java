package com.company.demoArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoString {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(-1);
    arrayList.add(3);
    arrayList.add(3);
    arrayList.add(-5);
    arrayList.add(7);
    arrayList.add(4);
    arrayList.add(-9);
    arrayList.add(-7);
    System.out.println(arrayList);
    Collections.reverse(arrayList);
    System.out.println(arrayList);
    System.out.println(Collections.max(arrayList));
  }
}
