package com.stackroute;

public class reverse {

    public boolean rev(String s)
    {
        if(s==null || s.isEmpty())
            return false;
        int i;
        String r="";
        for(i=s.length()-1;i>=0;i--)
            r+=s.charAt(i);
        return s.equalsIgnoreCase(r);
    }
}
