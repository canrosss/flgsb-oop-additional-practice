package com.canrossoft;

import com.canrossoft.model.Employee;

public class Main {
    protected static Employee e = new Employee("i", 19, 2000);
    public static void main(String[] args) {
        System.out.println("Welcome to EMS! - v0.1");
        try {
            e.setName("");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(e.toString());
        e.giveRaise(0.10);
        System.out.println(e.toString());
    }
}