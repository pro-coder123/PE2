package com.stackroute;

import java.util.Scanner;

public class Factorial {

    public long longFactorial(int n)
    {
        long p=1;
        int i;
        if(n>20)
        {
            System.out.println("The factorial of "+n+" is out of range.");
            return 0;
        }
        for(i=1;i<=n;i++)
            p*=(long)i;
        return p;

    }

    public long factorial(int n)
    {
        if(n>13)
            return longFactorial(n);

            int i=1,p=1;
            for(i=1;i<=n;i++)
                p*=i;
        return p;

    }
}
