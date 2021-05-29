//combination of 4th & 5th. 5th is partially used ie 3 rows & 3 column 
package starpattern;

public class Combination {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) //1st outer loop
		{
			for(int j=3;j>=i;j--)//1st inner loop
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) //2st outer loop
		{
			for(int j=1;j<=i;j++)//2nd inner loop
			{
				System.out.print(" ");
			}
			
			for(int k=3;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
