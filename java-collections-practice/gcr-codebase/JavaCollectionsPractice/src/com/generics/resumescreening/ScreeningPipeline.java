package com.generics.resumescreening;

import java.util.List;

public class ScreeningPipeline {

    public void processResumes(List<? extends JobRole> roles) {
        System.out.println("Screening pipeline initialized for " + roles.size() + " job roles.");
    }
}
