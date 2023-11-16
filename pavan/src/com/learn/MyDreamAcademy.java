package com.learn;

public class MyDreamAcademy implements FullStackAcademy{
    @Override
    public int getTotalCourseDuration() {
        return 40;
    }

    @Override
    public int getTotalCostOfCourse() {
        return 500;
    }

    @Override
    public String getDetailsAboutFullStack() {
        return "Fullstack java developer course";
    }
}
