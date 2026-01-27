package com.generics.resumescreening;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        this.roleName = "Software Engineer";
    }

    @Override
    public int getMinExperience() {
        return 2;
    }

    @Override
    public String[] getRequiredSkills() {
        return new String[]{"Java", "DSA", "OOP"};
    }
}
