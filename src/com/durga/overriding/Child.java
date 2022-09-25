package com.durga.overriding;

public class Child extends Parent {

    public void c1() {
        System.out.println("Child method c1");
    }

    @Override
    public void p2() {
        System.out.println("Child overriding of parent method p2");
    }
}
