package com.stackroute;

import java.lang.management.MemoryMXBean;

public class Member {
    public String Name;
    public int age, Salary;
    Member(String n,int a,int s)
    {
        Name=n;
        age=a;
        Salary=s;
    }
}

class Member_Variable{
    public Member m;
    Member_Variable(String n,int a,int s)
    {
        m = new Member(n,a,s);
    }
    public String getName()
    {
        return m.Name;

    }
    public int getAge()
    {
        return m.age;

    }
    public int getSalary()
    {
        return m.Salary;

    }
}
