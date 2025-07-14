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
        if(age < 18 && age > 65)
        {
            this.age = age;
        }else{
           throw new IllegalArgumentException("Age must be between 18 & 65");
        }
    }

    public void setSalary(double salary) {
        if(salary >= 0){
            this.salary = salary;
        }else{
            throw new IllegalArgumentException("Salary must be greater than 0 ");
        }
    }

    @Override
    public String toString(){
        return
                "Employee\n" +
                "---------------------\n"+
                "Name    : " + this.name + "\n" +
                "Age     : " + this.age + "\n" +
                "Salary  : $" + this.salary + "\n" +
                "----------------------\n";

    }


    public double calculateAnnualSalary(int months){
       double annualSalary = months * this.salary;
       return annualSalary;
    }

    public void giveRaise(double percentage) {
  //      System.out.println("Salary         : "+ this.salary);
        this.salary = this.salary + (this.salary * percentage);
//        System.out.printf("Porcentaje     : "+ "%.1f\n", (percentage*100));
 //       System.out.println("Con incremento : "+ this.salary);
    }
}
