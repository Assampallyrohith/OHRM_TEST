package Arrays_java;

public class Array_singelDimisions{

public static void main(String[] args) 
{
int array1;
  array1 = 1200000; 
  System.out.println(array1);
  array1=20;
System.out.println(" the array  of the value is"+array1);

System.out.println("--------------------------------------------------");

//datatype verible name[]=new datatype [size].;
int rohith1[]=new int[3];
rohith1[0]=10;
rohith1[1]=20;
rohith1[2]=30;
/*System.out.println("the veribles of rohith is "+rohith1[0]);
System.out.println("the veribles of rohith is "+rohith1[1]);
System.out.println("the veribles of rohith is "+rohith1[2]);
*/
for(int rohith=0;rohith<=4;rohith++)
{
	System.out.println(rohith1[rohith]);
}
System.out.println("----------------------------------");
for( int naveen=0;naveen<=2;naveen++)
{
	// System.out.println(rohith1[naveen]);

}

}
}