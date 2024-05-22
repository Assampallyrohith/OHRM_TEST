package com.user_defined_methods;

public class Method_example10_perameters
{

	public void addition() // Method withOut Parameters and the variables are assigned with hardCoded values  
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1+var2;
	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
	}

	public void addition(int var1, int var2) // Method with Parameters
	{
	int var3;
	var3=var1+var2;
	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);

	}


	// Method OverLoading - If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	public void addition(int var1, int var2,int var3) // Method with Parameters
	{
	//int var3;
	var3=var1+var2+var3;
	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);

	}

	public void addition(int var1, int var2,double var3) // Method with Parameters
	{
	//int var3;
	double var4;
	var4=var1+var2+var3;
	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var4);

	var3=var1+var2+var3;
	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);


	}

	// Method OverLoading - If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	public void addition(int var1, int var2,float var3) // Method with Parameters
	{
	//int var3;
	var3=var1+var2+var3;
	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);

	}


	public void addition(int var1, double var2,float var3) // Method with Parameters
	{
	//int var3;
	double var4;
	var4=var1+var2+var3;
	System.out.println(" The value of the Variable var4 after Addition Operation is :- "+var4);

	}


	public static void main(String[] args)
	{

		Method_example10_perameters m10 = new Method_example10_perameters();
	System.out.println(" The value of the Variable var4 after Addition of Different DataType values is:- ");
	m10.addition(20, 50.222, 30.333f);

	}
	}

