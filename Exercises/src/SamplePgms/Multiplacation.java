package SamplePgms;

import java.util.Scanner;

public class Multiplacation {
	int a, b, c, d;
	static Scanner in = new Scanner(System.in);

	public void mu() {
		System.out.println("Enter range of numbers to print their multiplication table");
		a = in.nextInt();
		b = in.nextInt();
		for (c = a; c <= b; c++) {
			System.out.println("Multiplication table of " + c);

			for (d = 1; d <= 10; d++) {
				System.out.println(c + "*" + d + " = " + (c * d));
			}
		}
	}
	

	public void printMultiplicationTable() {

		// first print the top header row
		System.out.format("           ");
		System.out.println("Enter the tablesize");
		int tableSize=in.nextInt();
		for (int i = 1; i <= tableSize; i++) {
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("------------------------------------------");
		for (int i = 1; i <= tableSize; i++) {
			// print left most column first
			System.out.format("%4d |", i);
			for (int j = 1; j <= tableSize; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}
	}
	public void multiply() {
		System.out.println("Enter the range ");
		int n=in.nextInt();
		int[][] multTable=new int[n+1][n+1];
		for (int i=1;i<=n;i++)
		{
			System.out.println("Multiplication table of " + i);
			for (int j=1;j<=n;j++)//j<=10
			{
				multTable[i][j] = i*j;
				System.out.println(i + "*" + j + " = " + (i * j));
			
			}
		}

	}

}
