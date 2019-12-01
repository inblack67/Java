package com;

public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.getLastName();
    }

    public int getAge()
    {
        return this.getAge();
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setAge(int age)
    {
        if(age<0 || age>100)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen()
    {
        if(age>12 && age<20)
            return true;
        return false;
    }

    public String getFullName()
    {
        if(firstName.isEmpty() && lastName.isEmpty())
            return "";
        if(firstName.isEmpty())
            return lastName;
        if(lastName.isEmpty())
            return firstName;
        else
            return firstName+" "+lastName;
    }
}
