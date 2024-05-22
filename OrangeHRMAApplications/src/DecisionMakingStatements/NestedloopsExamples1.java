package DecisionMakingStatements;

public class NestedloopsExamples1
{
public static void main(String[]args)
{
	int x = 5;
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=x;j++)
		{
		System.out.print(j+" ");
		}
		System.out.println();
		x--;
	}
	System.out.println("-------------------------------");
	
	int y=10;
	for(int i=1;i<=10;i++)
	{
		for( int j=1;j<=y;j++)
		{
		System.out.print(j+" ");
		}
		System.out.println();
		y--;
	}
	System.out.println("-------------------------------");
	int z=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=z;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			z--;
		}
		System.out.println("-------------------------------");
	
		int a=6;
		for (int i=2;i<=6;i++)
		{
			for(int j=3;j<=a;j++)
			{
			System.out.print(i+"");	
			}
			System.out.println();
			a--;
		}
		System.out.println("-------------------------------");
		int d=7;
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=d;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			d--;
		}
}
	

}
