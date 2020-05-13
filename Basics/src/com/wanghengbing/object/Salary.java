package com.wanghengbing.object;

public class Salary extends Employee{ // 集成抽象类Salary
    private double salary;

    public void setSalary(double salary) {
        if (salary >= 0.0){
            this.salary = salary;
        }
    }

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
