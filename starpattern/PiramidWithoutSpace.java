// it is the combination of 3 triangle 
package starpattern;

public class PiramidWithoutSpace {

	public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)// 1st inner loop to build the space triangle
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)//2nd inner loop to build the * triangle
		{
			System.out.print("*");
		}
		for(int l=2;l<=i;l++)//3rd inner loop to build the * triangle
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
