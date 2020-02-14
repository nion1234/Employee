package com.company;

public class Employee {
    private String Name;
    private String CEO;
    private int Id;

    public Employee(String name, String CEO, int id) {
        Name = name;
        this.CEO = CEO;
        Id = id;
    }

    public Employee(String Name) {
    }

    public String getName() {
        return Name;
    }

    public String getCEO() {
        return CEO;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", CEO='" + CEO + '\'' +
                ", Id=" + Id +
                '}';
    }

    public void Employeeinfo(){
        System.out.println("The Employee name"+" "+Name);
        System.out.println("The executive officer of RIT"+" "+CEO);
        System.out.println("The Emplpyee Id is "+" "+Id);

    }
}
