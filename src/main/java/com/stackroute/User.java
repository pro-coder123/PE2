package com.stackroute;

public class User {

    public String firstName,lastName;
    public int age,salary;
    public User(String a, String b, int age, int salary)
    {
        firstName=a;
        lastName=b;
        this.age=age;
        this.salary=salary;
    }
    public boolean isValidAge()
    {
        return age>=18 && age<=60;
    }
    public String getFullName()
    {
        return firstName+" "+lastName;
    }

}
