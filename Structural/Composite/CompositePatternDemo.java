package Structural.Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("LEO", "CEO", 30000.0f);    // Composite

        Employee headSales = new Employee("Robert", "Head Sales", 20000.0f); //Composite
        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000.0f); //Leaf
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10001.0f);  //Leaf
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        Employee headMarketing = new Employee("Micheal", "Head Marketing", 20001.0f);  // Composite
        Employee clerk1 = new Employee("Laura", "Marketing", 10000.0f); // Leaf
        Employee clerk2 = new Employee("Bob", "Marketing", 10001.1f);   // Leaf
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        CEO.add(headSales);
        CEO.add(headMarketing);

        // print all staffs
        Employee.preOrderTraversal(CEO, 0);

        // Employee: [Name: LEO, Dept: CEO, Salary: 30000.0$]
        // |-Employee: [Name: Robert, Dept: Head Sales, Salary: 20000.0$]
        //         |-Employee: [Name: Richard, Dept: Sales, Salary: 10000.0$]
        //         |-Employee: [Name: Rob, Dept: Sales, Salary: 10001.0$]
        // |-Employee: [Name: Micheal, Dept: Head Marketing, Salary: 20001.0$]
        //         |-Employee: [Name: Laura, Dept: Marketing, Salary: 10000.0$]
        //         |-Employee: [Name: Bob, Dept: Marketing, Salary: 10001.1$]
    }
}
