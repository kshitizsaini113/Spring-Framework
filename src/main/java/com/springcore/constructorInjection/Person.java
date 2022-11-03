package com.springcore.constructorInjection;

import java.util.List;

public class Person {
    private String personName;
    private int personId;
    private Certi certi;
    private List<Integer> l1;

    public Person() {
    }

    public Person(List<Integer> l1) {
        this.l1 = l1;
    }

    public Person(String personName, int personId, Certi certi) {
        this.personName = personName;
        this.personId = personId;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                ", l1=" + l1 +
                '}';
    }
}
