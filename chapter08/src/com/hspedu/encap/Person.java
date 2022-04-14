package com.hspedu.encap;

public class Person {
    private String name;
    private int age;
    private double salary;
    private String job;

    public Person(String name, int age, double salary, String job) {
        /*this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;*/
        //防止用户通过构造器绕过逻辑限制，可以将setXxx方法设置在构造器中
        setName(name);
        setAge(age);
        setJob(job);
        setSalary(salary);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 2 || name.length() > 6){
            System.out.println("姓名不符合规范");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 120) {
            System.out.println("输入的年龄必须在1-120之间");
            return;
        }
        this.age = age;
    }

    public String getSalary() {
    return "工资无权查看";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {

        this.job = job;
    }
}
