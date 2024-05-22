package com.user_defined_methods;

public class method_Example2 
{
 /*public void hello()
{
System.out.println("rohith");	
}
public void jarvis() 
{
	System.out.println("jarvis");
}
public static void main(String[] args) 
{
	method_Example2 m2 = new method_Example2();
	m2.hello();
	m2.jarvis();
	System.out.println();
	m2.ironman();
}
public void ironman()
{
System.out.println("natasha");	
}
*/
	// a Java Class can have any number of User-Defined Methods withOut a Main Method

	// a Java Class cannot perform an Operation related to any User-Defined Method By itself withOut
//	     having a Main Method - the Main should be called with User-Defined Methods by creating
//	         an Object for the Current Class

	// Though the User-Defined methods are Created in a Java Class - it is not necessary to call
	//   all the Created User-Defined Methods - Only when required the Method is called

	// if a class contains multiple User-Defined Methods - it is not required to create a new Object
//	      every time to call a different User-Defined Method - instead using the same class object
//	         created we can call any number of user-defined methods of the Class

	// * User defined Method Names should be Unique
	// User Defined methods can be either be created Above the Main or Below the Main Method

                       //**********//down is said by sir//*****************
	
	
	public void hello()
	{
	System.out.println(" Testing ");
	}

	public void chello()
	{
	System.out.println(" WebDriver ");
	}


	public static void main(String[] args) {

	method_Example2 m2 = new method_Example2();
	m2.hello();

	//System.out.println();

	//MethodExample2 m = new MethodExample2();
	//m.chello();

	
	m2.chello();

	m2.pollo();

	System.out.println();

	m2.chello();


	}

	public void pollo()
	{
	System.out.println(" Selenium ");
	}

}
