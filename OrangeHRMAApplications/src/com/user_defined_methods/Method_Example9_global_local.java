package com.user_defined_methods;

public class Method_Example9_global_local 
{
	{
		// Global Variables
		int var1=50;
		int var2=10;}
		
		public void addition() // User-Defined Method WithOut Parameters/Arguments
		{
		// local/Instance Variable
		int var1=20;
		int var2=30;
		int var3;

		var3=var1+var2;
		System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
		}

		public void addition(int var1,int var2) // User-Defined Method With Parameters/Arguments
		{
		// This Method when Called - should be provided with the Values
		// This method will not have any local declaration nor will take the value
		    //  from the Global declaration

		// The values should be passed only when the Method is called to perform the Operation
		int var3;

		var3=var1+var2;
		System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
		}

		public void subtraction()
		{
		int var3;
	
	//	var3 = var1-var2; // the Current User Defined method doesn't have the declaration of variables
		                  //       var1 & var2(Local Variables) - these Variables var1 & var2 will
		                 //          Look for is there any Variables of Similar Type declared
		                //             Outside of all the Methods(Global declaration) - if it finds the similar variables
		    //                then the variables will take the values of Globally declared Variables
		   
	//	System.out.println(" The value of the Variable var3 after Subtraction Operation is :- "+var3);
		}


		public static void main(String[] args) {

			Method_Example9_global_local  m9 = new Method_Example9_global_local ();
		m9.addition();
		m9.subtraction();
		System.out.println();

		m9.addition(100, 70);
//**********note:-38&44lines are commented by me because of getting error for me***************		

		}

}
