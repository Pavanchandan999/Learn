package com.learn;

public class AtlantaJSTechAcademy extends JSTechAcademy implements FullStackAcademy{

    @Override
    String getLocation() {
        return "Downtown, Atlanta";
    }

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
        return "advanced course";
    }
}
