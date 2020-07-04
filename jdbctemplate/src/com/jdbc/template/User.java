package com.jdbc.template;

public class User {
    public Integer id;
    public String name;
    public String password;
    public String info;
    public Double salay;

    public User() {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Double getSalay() {
        return salay;
    }

    public void setSalay(Double salay) {
        this.salay = salay;
    }

    public User(Integer id, String name, String password, String info, Double salay) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.info = info;
        this.salay = salay;
    }
}
