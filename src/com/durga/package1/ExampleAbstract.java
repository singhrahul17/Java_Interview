package com.durga.package1;

public abstract class ExampleAbstract {

    public abstract void m1();
    public abstract void m2();

    public void m3() {
        System.out.println("abstract parent implementation of m3");
    }
}

abstract class Child extends ExampleAbstract {

    public void m1() {
        System.out.println("Child implementation of m1");
    }
    public static void main(String[] args) {
        ExampleAbstract subChild = new SubChild();
        subChild.m1();
        subChild.m2();
        subChild.m3();
    }
}

class SubChild extends Child {

    public void m2() {
        System.out.println("subchild implementation of m2");
    }
}