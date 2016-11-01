/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cschultz57
 */
public class StartUp {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();        
        employees.add(new Employee("Smith", "Bill", "123456789"));
        employees.add(new Employee("Smith", "Roger", "987654321"));
        employees.add(new Employee("Crisis", "Existential", "1597538624"));
        employees.add(new Employee("Smith", "Bill", "123456789"));

        System.out.println(employees.get(2));
        System.out.println("\t");
        System.out.println("Old style for loops using casting:");
        System.out.println("\t");

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.println(emp);
        }
        System.out.println("\t");
        System.out.println("New style not using casting:");
        System.out.println("\t");

        for (Employee s : employees) {            
            System.out.println(s);
        }
        employees.remove(3);

        System.out.println("\t");
        System.out.println("Output List minus the removed employee:");
        System.out.println("\t");

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.println(emp);
        }

        employees.add(new Employee("Employee", "New", "78795642"));

        System.out.println("\t");
        System.out.println("Output List with the new employee:");
        System.out.println("\t");

        for (Employee s : employees) {
            System.out.println(s);
        }
        System.out.println("\t");
        System.out.println("Size of list after employee deletion: " + employees.size());
        System.out.println("\t");

        employees.set(3, new Employee("Replaced", "Employee", "123545"));

        System.out.println("\t");
        System.out.println("List after employee replacement: ");
        System.out.println("\t");

        for (Employee s : employees) {
            System.out.println(s);
        }

    }
}
