package com.hspedu.ployparameter_;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("one",100.0);
        AnnualEmploy manage = new AnnualEmploy("manage", 200.0, 100.0);
        Worker three = new Worker("three", 150);

        TestEmployee testEmployee = new TestEmployee();testEmployee.testWork(employee);
        testEmployee.testWork(manage);
        testEmployee.testWork(three);

        testEmployee.showEmpAnnual(employee);
        testEmployee.showEmpAnnual(manage);
        testEmployee.showEmpAnnual(three);
    }
    public void showEmpAnnual(Employee e){
        if ( e instanceof AnnualEmploy) {
            System.out.println(e.getName() + "的年薪是" + (e.getSalary() * 12 +((AnnualEmploy) e).getBonus()));
        }else {
            System.out
                    .println(e.
                            getName() + "的年" +
                            " 薪是" + e.getSalary() * 12);
        }
    }

    public void testWork(Employee e){
        if(e instanceof AnnualEmploy){
            ((AnnualEmploy) e).manage();
        }else if (e instanceof Worker){
            ((Worker) e).work();
        }else {
            System.out.println("？？？？？？？？");
        }
    }
}
