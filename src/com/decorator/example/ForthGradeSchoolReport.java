package com.decorator.example;

/**
 * Created by toryang on 7/15/16.
 */
public class ForthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("Dear family:");
        System.out.println("Chinese 62, Math 65, PE 98, Nature 63");
        System.out.println("sign:");
    }

    public void sign(String name) {
        System.out.println("sign:"+name);
    }
}
