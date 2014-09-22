package SamplePgms;

import java.util.Scanner;

public class BreakNcontinue {
	    int n;
	    Scanner input = new Scanner(System.in);
	 public void breakmethod () {
		 
	    while (true) {
	      System.out.println("Input an integer");
	      n = input.nextInt();
	 
	      if (n == 0) {
	        break;
	      }
	      System.out.println("You entered " + n);
	    }
	  }
	 
	 public void continuemethod() {
		 while (true) {
		      System.out.println("Input an integer");
		      n = input.nextInt();
		 
		      if (n != 0) {
		        System.out.println("You entered " + n);
		        continue;
		      }
		      else {
		        break;
		      }
		    }

	 }
	}

