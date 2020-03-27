package com.azish.designpattern.behavioral.nullpattern;

import com.azish.designpattern.behavioral.nullpattern.nullclass.Coder;
import com.azish.designpattern.behavioral.nullpattern.nullclass.Emp;
import com.azish.designpattern.behavioral.nullpattern.nullclass.NoClient;

public class EmpData
{

    public static final String[] names = {"Lokesh", "Kushagra", "Vikram"};
    public static Emp getClient(String name)
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(name))
            {
                return new Coder(name);
            }
        }
        return new NoClient();
    }
}
