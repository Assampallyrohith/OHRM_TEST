package com.user_defined_methods;

public class Method_Example5 {

public void addition()
{
int var1=20;
int var2=30;
int var3;

var3=var1+var2;

System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
}

private void subtraction()
{
int var1=20;
int var2=30;
int var3;

var3=var1-var2;

System.out.println(" The value of the Variable var3 after Subtraction Operation is :- "+var3);
}

public static void main(String[] args) {

Method_Example5 m5 = new Method_Example5();
m5.addition();
m5.subtraction();// Private Methods can be accessed in the same class for any number of times
m5.subtraction();// Private Methods can be accessed in the same class for any number of times

}

}





