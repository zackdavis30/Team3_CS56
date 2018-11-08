/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKiSINNER
 */
public class Person {
    
    private String name;
    private String image;
    
    private int age;
    private String email;
    private int zip;
    private char gender;
    private String password;
    
    
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    public int getZip()
    {
        return zip;
    }
    public void setZip(int newZip)
    {
        zip = newZip;
    }
    public boolean isUsername(String nameToCheck)
    {
        return name.equals(nameToCheck);
    }
    public boolean isEmail(String emailToCheck)
    {
        return email.equals(emailToCheck);
    }
    public boolean isPassword(String passwordToCheck)
    {
        return password.equals(passwordToCheck);
    }
    
    
    public void forgotUsername()
    {
        //not sure what to do
    }
    public void forgotPassword()
    {
        //not sure what to do
    }
    
    
    
    
    
}
