package com.jmeter.plugin.utils;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CLibrary  extends Library {

    CLibrary INSTANCE = (CLibrary) Native.load("Dll3", CLibrary.class);

    public int test();

    public int test2();

    public int add(int a, int b);

    public int minus(int a, int b);

    public int multiply(int a, int b);

    public double divide(int a, int b);


    public static void main(String[] args) {


        int i = CLibrary.INSTANCE.test();
        System.out.println("i:"+i);

        int i1 = CLibrary.INSTANCE.test2();
        System.out.println(i1);
        int sum = CLibrary.INSTANCE.add(1,2);
        System.out.println("sum:"+sum);
        int diff = CLibrary.INSTANCE.minus(5,3);
        System.out.println("diff:"+diff);

    }

}



