package com.qbs;

public class test {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.print(o1 instanceof Double);
        System.out.print(" ");
        System.out.print(o2);
    }

}
