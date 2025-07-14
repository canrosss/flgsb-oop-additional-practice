// Employee class to demonstrate encapsulation
public class Employee implements Cloneable {
    // Step 1: Declare private variables for name, age, and salary
    // Hint: Use appropriate data types (String, int, double)
    
    // Step 2: Create constructors
    // 2.1: Create a default constructor that sets name to "Unknown", age to 18, and salary to 0.0
    // Hint: public Employee()
    
    // 2.2: Create an overloaded constructor that initializes all three variables
    // Hint: public Employee(String name, int age, double salary)
    
    // Step 3: Create public getter methods for each variable
    // Hint: Use the format: public returnType getVariableName()
    
            @Override
            public String toString() {
                 return "Employee {\n" +
                     "  Name: '" + name + "',\n" +
                      "  Age: " + age + ",\n" +
                       "  Salary: " + salary + "\n" +
                   "}";
            }

    // Step 4: Create public setter methods for each variable
    // Hint: Use the format: public void setVariableName(parameter)
    // Add validation logic in the setter methods:
    // - For name: Ensure it is not null or empty
    // - For age: Ensure it is between 18 and 65 (inclusive)
    // - For salary: Ensure it is greater than or equal to 0
    
    // Step 5: Create a public method to calculate annual salary (monthly salary * 12)
    // Hint: public double calculateAnnualSalary()
    
    // Step 6: Create a public method to give a raise (percentage)
    // This method should increase the salary by the given percentage
    // Hint: public void giveRaise(double percentage)
    
    // Step 7: Create a public method to display employee details
    // Hint: Use System.out.println() to print name, age, monthly salary, and annual salary
    
    // Step 8: Override the clone method to make Employee objects cloneable
    // Hint: @Override protected Object clone() throws CloneNotSupportedException
    // Return super.clone() to create a shallow copy of the object



}

--Manejo de una excepcion 

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double salario = 23500.456;
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Salario: $" + df.format(salario));
    }
}

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

    }
}