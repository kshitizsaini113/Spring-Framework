package com.springcore.constructorInjection;

public class Person {
    private String personName;
    private int personId;
    private Certi certi;

    public Person() {
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
                '}';
    }
}
