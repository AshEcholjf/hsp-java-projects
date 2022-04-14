package com.hspedu.ployparameter_;

public class AnnualEmploy extends Employee{
    private double bonus;

    public AnnualEmploy() {
    }

    public AnnualEmploy(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public AnnualEmploy(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理"+ getName() + "在managing");
    }
}
