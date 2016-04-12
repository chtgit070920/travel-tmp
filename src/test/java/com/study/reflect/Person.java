package com.study.reflect;

/**
 * Created by Edward on 2016/3/17.
 */
public class Person {

    public int id;//唯一标识
    public double salary;//薪水
    public String name;//名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
