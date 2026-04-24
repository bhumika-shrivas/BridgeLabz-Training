package com.generics.resumescreening;

public class ProductManager extends JobRole {

    public ProductManager() {
        this.roleName = "Product Manager";
    }

    @Override
    public int getMinExperience() {
        return 4;
    }

    @Override
    public String[] getRequiredSkills() {
        return new String[]{"Communication", "Strategy", "Market Analysis"};
    }
}
