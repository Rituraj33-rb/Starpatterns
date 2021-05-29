//7th pattern first we print the space the we print spacex  ie " *" 
package starpattern;

public class Piramid {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) // outer loop 
		{
			for(int j=4;j>=i;j--) // 1st inner loop to print spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)// 2nd inner loop to print space&x " *"
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
