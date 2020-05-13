package com.wanghengbing.object;

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String address, int number) {
        System.out.println("调用 Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
}


