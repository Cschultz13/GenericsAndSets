/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

        Set<Employee> employees2 = new LinkedHashSet<>(employees);

        employees = new ArrayList<>(employees2);

        System.out.println("List output after removing duplicates using a hashSet");
        for (Employee s : employees) {
            System.out.println(s);
        }

    }
}
