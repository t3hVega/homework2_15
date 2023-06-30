package com.homework215.homework215;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        IntegerList integerList1 = new IntegerList(3);
        integerList1.add(1);
        integerList1.add(1, 2);
        integerList1.add(1, 3);


        IntegerList integerList2 = new IntegerList(3);
        integerList2.add(1);
        integerList2.add(1, 2);
        integerList2.add(1, 3);




        System.out.println(integerList1.equals(integerList2));
        integerList1.remove(2);
        System.out.println(integerList1.size());
        System.out.println(Arrays.toString(integerList1.toArray()));
    }
}