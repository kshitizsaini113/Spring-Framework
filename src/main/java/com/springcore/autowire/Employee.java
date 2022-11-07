package com.springcore.autowire;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        System.out.println("Cunstructor called");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter called");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
