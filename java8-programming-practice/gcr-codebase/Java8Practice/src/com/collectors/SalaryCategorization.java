package com.collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
/*
Employee Salary Categorization
You have a list of employees with their departments and salaries. Use
Collectors.groupingBy() to group employees by department and calculate the
average salary for each department.
 */
public class SalaryCategorization {
	
	record Employee(String name, String department, double salary) {
        // methods to match your usage
        public String getDepartment() {
            return department;
        }
        public double getSalary() {
            return salary;
        }
    }
	
	public static void main(String[] args) {
		
		
		List<Employee> employees= List.of(
				new Employee("Bhumika", "Finance", 80000.0),
				new Employee("Arya", "HR", 75000.0),
				new Employee("Disha", "IT", 60000.0),
				new Employee("Shraddha", "HR", 50000.0),
				new Employee("Rashi", "IT", 78000.0)
				);
		
		Map<String, Double> avgSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSalaryByDept);
	}

}
