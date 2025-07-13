package com.canrossoft.model;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(){
        this.name = "Unknow";
        this.age = 18;
        this.salary = 0.0;
    }

    public Employee(String name, int age, double salary){
        setName(name);
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else{
            throw new IllegalArgumentException("Name cannot be empty!");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee {Name '" + this.name + "', age=" + this.age + ", salary=" + this.salary + "}";

    }
}
