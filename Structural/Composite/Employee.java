package Structural.Composite;

import java.util.List;
import java.util.ArrayList;

public class Employee {         // Component

    private String name;
    
    private String dept;

    private float salary;

    private List<Employee> subordinates = null;

    public Employee(String name, String dept, float salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        if (this.subordinates == null) {
            this.subordinates = new ArrayList<Employee>();
        }
        this.subordinates.add(e);
    }

    public void remove(Employee e){
        this.subordinates.remove(e);
        if (this.subordinates.isEmpty()){
            this.subordinates = null;
        }
    }

    public List<Employee> getSubordinates(){
        return this.subordinates;
    }

    public String toString(){
        return ("Employee: [Name: " + this.name + ", Dept: " + this.dept + ", Salary: " + this.salary + "$]");
    }

    public static void preOrderTraversal(Employee root, int level){
        System.out.println(root);

        if (root.getSubordinates() != null){
            for (Employee e : root.getSubordinates()){
                System.out.print("\t".repeat(level+1));
                System.out.print("|-");

                preOrderTraversal(e, level+1);
            }
        }
    }

}
