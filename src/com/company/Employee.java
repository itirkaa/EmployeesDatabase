package com.company;

public class Employee {
    String name;
    double exp;
    double sal;

    public Employee(){
        this.name = "";
        this.exp = 0;
        this.sal = 0;
    }

    public Employee(String name, double exp, double sal){
        this.name = name;
        this.exp = exp;
        this.sal = sal;
    }

    public String getName(){
        return this.name;
    }

    public Double getExp(){
        return this.exp;
    }

    public double getSal(){
        return this.sal;
    }

    public void setName(String name){ this.name = name; }

    public void setExp(double exp) { this.exp = exp; }

    public void setSal(double sal) { this.sal = sal; }
}
