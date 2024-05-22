package com.user_defined_methods;

public class Method_Exampe1
{
//* User-Defined Methods are created for RE-Usability Purpose

//User-Defined Method - a method which is developed by the Programmers / Test Engineers
public void ROHITH()
{
System.out.println(" This is a ROHITH User-Defined Method ");
}

//Pre-Defined Method
public static void main(String[] args)
{

System.out.println(" This is the Main Method of the JAVA Language ");

Method_Exampe1 m1 = new Method_Exampe1(); // creating an Object for the Current Class
System.out.println();

m1.ROHITH(); // Using the Current Class - calling the User defined Method to perfrom an Operation

m1.ROHITH();
m1.ROHITH();


}


}




