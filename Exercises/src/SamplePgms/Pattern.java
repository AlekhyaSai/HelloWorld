package SamplePgms;

import java.util.Scanner;

public class Pattern {

	public static Scanner in = new Scanner(System.in);
	
	public void code() {
		System.out.println("Enter the pattern" );
		String x=in.next();
		System.out.println("Enter the no.of rows");
		int r=in.nextInt();
		for(int i = 1;i <= r ;i++) {
			
			for(int j = 1 ; j<=i;j++) {
				
				System.out.print("  " + x);
			}
			System.out.println(" ");
		}
	}
	
}
