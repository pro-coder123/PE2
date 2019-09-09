package com.stackroute;

public class powerof4 {

    public boolean check(int n)
    {
        while(n>0)
        {
            n/=4;
            if(n==1)
                return true;
        }
        return false;
    }
}
