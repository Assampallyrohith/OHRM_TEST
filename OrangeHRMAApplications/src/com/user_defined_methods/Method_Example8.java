package com.user_defined_methods;

public class Method_Example8 {
	

		protected void division()
		{
		int var1=20;
		int var2=5;
		int var3;

		var3=var1/var2;

		System.out.println(" The value of the Variable var3 after Division Operation is :- "+var3);
		}


		public static void main(String[] args) {

		Method_Example8 m8 = new Method_Example8();
		m8.division();

		Method_Example7 m7 = new Method_Example7();
		m7.multiplication();

		
		}


}
