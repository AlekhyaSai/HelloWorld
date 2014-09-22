package SamplePgms;

import java.util.Scanner;

public class Fibonnoci {
	int f1 = 0, f2 = 1, output;
	public static Scanner in = new Scanner(System.in);

	public void series() {
		System.out.println("Enter the no till which the series is required");
		int num = in.nextInt();

		if (num <= 0) {
			System.out.println("Please enter a valid number");
		}

		else {
			for (int f3 = 0; f3 < num; f3++) {
				output = f1 + f2;
				f1 = f2;
				f2 = output;
				System.out.print(" " + output);
			}
		}

	}

}
