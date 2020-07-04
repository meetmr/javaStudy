package com.hengbing.jdbc;

public class User {
    public int id;
    public String name;
    public String password;
    public String info;
    public double salay;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getInfo() {
        return info;
    }

    public double getSalay() {
        return salay;
    }

    public User(int id, String name, String password, String info, double salay) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.info = info;
        this.salay = salay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", info='" + info + '\'' +
                ", salay=" + salay +
                '}';
    }
}
