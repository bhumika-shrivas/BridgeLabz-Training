package com.generics.resumescreening;

public class DataScientist extends JobRole {

    public DataScientist() {
        this.roleName = "Data Scientist";
    }

    @Override
    public int getMinExperience() {
        return 3;
    }

    @Override
    public String[] getRequiredSkills() {
        return new String[]{"Python", "Statistics", "Machine Learning"};
    }
}
