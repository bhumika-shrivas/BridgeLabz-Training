package com.objectmodelling.compositionproblem;

public class CompositionDemo {
    public static void main(String[] args) {

        Company company = new Company("TechNova");

        Department dev = new Department("Development");
        dev.addEmployee("Amit", 101);
        dev.addEmployee("Neha", 102);

        Department hr = new Department("HR");
        hr.addEmployee("Rohan", 201);

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showCompanyDetails();

        // Deleting company (composition effect)
        company.closeCompany();
    }
}
