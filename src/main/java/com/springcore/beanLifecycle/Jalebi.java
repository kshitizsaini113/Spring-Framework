package com.springcore.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
    private double price;

    public Jalebi() {
    }

    public Jalebi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jalebi{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializer from @PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destructor from @PreDestroy");
    }
}
