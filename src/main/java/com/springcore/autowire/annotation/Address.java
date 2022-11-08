package com.springcore.autowire.annotation;

public class Address {
    private String address;
    private String city;

    public Address() {
    }

    public Address(String address, String city) {
        System.out.println("Constructor called - Address");
        this.address = address;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Setter called - Address");
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Setter called - Address");
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
