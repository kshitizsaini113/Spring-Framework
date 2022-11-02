package com.springcore.reference;

public class A {
    private int x;
    private B dependentObject;

    public A() {
    }

    public A(int x, B dependentObject) {
        this.x = x;
        this.dependentObject = dependentObject;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getDependentObject() {
        return dependentObject;
    }

    public void setDependentObject(B dependentObject) {
        this.dependentObject = dependentObject;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", dependentObject=" + dependentObject +
                '}';
    }
}
