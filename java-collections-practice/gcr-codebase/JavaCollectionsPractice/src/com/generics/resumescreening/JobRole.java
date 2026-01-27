package com.generics.resumescreening;

public abstract class JobRole {

    protected String roleName;

    public abstract int getMinExperience();
    public abstract String[] getRequiredSkills();

    public String getRoleName() {
        return roleName;
    }
}
