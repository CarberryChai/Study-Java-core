package com.company.demoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoString {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
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
    // System.out.println(arrayList);
    Iterator<Integer> iterator = arrayList.iterator();
    // 迭代器迭代
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println(Collections.max(arrayList));
  }
}
