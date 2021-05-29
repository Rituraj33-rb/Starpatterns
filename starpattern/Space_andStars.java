//4th
package starpattern;

public class Space_andStars {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) // outer loop 
		{
			for(int j=3;j>=i;j--) // 1st inner loop to print space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) //2nd inner loop to print *
			{
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
