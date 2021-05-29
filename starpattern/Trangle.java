//1st pattern
package starpattern;

public class Trangle {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) { // outer loop represents row
			
			for(int j=1;j<=i;j++) { //inner loop represents columns
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
