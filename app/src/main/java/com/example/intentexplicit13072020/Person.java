package com.example.intentexplicit13072020;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
