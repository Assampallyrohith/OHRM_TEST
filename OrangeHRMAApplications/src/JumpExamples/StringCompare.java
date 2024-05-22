package JumpExamples;

public class StringCompare 
{
public static void main(String[]args)
{
	String rohith="sai";
	String naveen="venky";
	if(naveen.equals(rohith))
	{
	System.out.println(" rohith is equal to naveen");	
	}
		else
		{
		System.out.println("naveen is not  equal to rohith");
		}
	System.out.println("--------------------------------");
	
	String var1="rohith";
	String var2="rohith";
		if (var1.equals(var2))
		{
			System.out.println("var1  is equal to var2");
		}
			else 
			{
				System.out.println("var1 is not equal to var2");
			}
	
		System.out.println("--------------------------------");
	String var3="rohith";
	String var4="Rohith";
		if(var4.equals(var3))
		{
			System.out.println("var4 is equal to var 3");
		}
		else 
		{
			System.out.println("var3 is not equal to var 4");
		}
		System.out.println("--------------------------------");
	String var5="rohith";
	String var6="rohith ";
	if (var5.equals(var6))
	{
		System.out.println("var5 is equal to var6");
	}	
	else
	{
		System.out.println("var5 is not equal to var6");
	}
	System.out.println("--------------------------------");	
		
		String var7="rohith";
		String var8="Rohith";
	if(var7.equalsIgnoreCase(var8)) 
	{
		System.out.println("var7 is equal to var8");
	}
		else 
		{
			System.out.println("var7 is not equal to var8");
		}
	System.out.println("--------------------------------");	
	String var9="naveengummula";
	String var10="naveen";
	if(var9.contains(var10)) 
	{
		System.out.println("naveengummula in existing on naveen or var9 is  existing on var10");
	}
	else
	{
		System.out.println("naveen is existing on naveengummula or var9 is not existing on var10");
	}
	
	System.out.println("--------------------------------");	
	String var11="naveen";
	String var12="naveengummula";
		if(var11.contains(var12)) 
		{
			System.out.println(" var11 in existing on var12");
		}
			else
			{
				System.out.println("var11 is  not existing on var12");
			}
		System.out.println("--------------------------------");	
	 String var13="rohith";
	 var13.length();
	System.out.println(" the length  of the varibles is "+ var13.length());
	
	System.out.println("--------------------------------");	
	String var14="livetech";
	String var15="loveyoumother";
	 int var14length=var14.length();
	 int var15length=var15.length();
		 if (var14length>var15length)
		 {
			 System.out.println("the varibles of  var14 is has less alphabets the  var15"+var14length);
		 }
			 else
			 {
			System.out.println("the varibles of var15 has more varibles then the var15"+ var15.length());	 
			 }
		 System.out.println("--------------------------------");	
		 String var16="rohith";
		 String var17="rohithassampally";
		int var16length=var16.length();
		int	var17length=var17.length();
	 if (var16length>var17length) 
	 {
		 System.out.println("the var16 has more charactors then var17 ");
	 }
	 else
	 {
		 System.out.println("the var16 has less charactors then var17" );
	 }
}
}

