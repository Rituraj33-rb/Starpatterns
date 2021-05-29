// This is the combination of 1st & 2nd pattern 
package starpattern;

public class Therdpattern {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
