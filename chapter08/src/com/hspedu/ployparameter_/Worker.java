package com.hspedu.ployparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public Worker() {
    }

    public void work(){
        System.out.println("员工" + getName() + "正在工作");
    }
}
