package com.visitor.example;

/**
 * Created by toryang on 7/21/16.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee){
        String info = "name:"+employee.getName() + "\t";
        info += "sex:"+(employee.getSex() == Employee.FEMALE?"FEMALE":"MALE")+"\t";
        info += "salary:"+employee.getSalary();

        return info;
    }

    private String getManagerInfo (Manager manager){
        String baseicInfo = this.getBasicInfo(manager);
        String otherInfo = "performance:"+manager.getPerformance()+"\t";

        return baseicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee){
        String baseicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "job:"+commonEmployee.getJob()+"\t";
        return baseicInfo + otherInfo;
    }
}
