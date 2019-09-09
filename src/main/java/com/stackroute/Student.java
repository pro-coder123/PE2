package com.stackroute;

import java.io.IOException;
import java.util.Scanner;

public class Student {

    public int[] grades;
    public double avg()
    {
        int i;
        double s=0;
        for(i=0;i<grades.length;i++)
            s+=grades[i];
        return s/grades.length;
    }
    public int min()
    {
        int t = grades[0],i;
        for(i=1;i<grades.length;i++)
            t=Math.min(t,grades[i]);
        return t;
    }
    public int max()
    {
        int t = grades[0],i;
        for(i=1;i<grades.length;i++)
            t=Math.max(t,grades[i]);
        return t;
    }
    public Student(int[] grades)
    {
        this.grades=grades;
    }

//    public static void main(String[] args) throws IOException {
//
//        Student s=new Student();
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Enter the number of students : ");
//        n = sc.nextInt();
//        s.grades = new int[n];
//        int i;
//
//        for (i=0;i<n;i++)
//        {
//            System.out.print("Enter the grade for student "+ (i+1) +" : ");
//            s.grades[i]=sc.nextInt();
//        }
//
//        System.out.println("The average is "+s.avg());
//        System.out.println("The minimum is "+s.min());
//        System.out.println("The maximum is "+s.max());
//    }
}
