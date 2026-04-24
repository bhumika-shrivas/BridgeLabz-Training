package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


class Employee {

    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupEmployeeByDepartment {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        takeEmployeeInput(sc, employees);

        Map<String, List<Employee>> groupedMap = groupByDepartment(employees);

        displayGroupedEmployees(groupedMap);

        sc.close();
    }

    static void takeEmployeeInput(Scanner sc, List<Employee> list) {

        System.out.print("How many employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Department: ");
            String dept = sc.next();

            list.add(new Employee(id, name, dept));
        }
    }

    // grouping logic
    static Map<String, List<Employee>> groupByDepartment(List<Employee> list) {

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : list) {

            if (map.containsKey(emp.department)) {
                map.get(emp.department).add(emp);
            } else {
                List<Employee> deptList = new ArrayList<>();
                deptList.add(emp);
                map.put(emp.department, deptList);
            }
        }

        return map;
    }

    static void displayGroupedEmployees(Map<String, List<Employee>> map) {

        System.out.println("\nEmployees Grouped By Department:");

        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
