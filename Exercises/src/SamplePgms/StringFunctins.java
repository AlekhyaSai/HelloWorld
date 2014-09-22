package SamplePgms;

public class StringFunctins {
	int n,intVar=7;
	float floatVar=9.0f;
    String s = "Hey Alekhya", t = "", u = "", stringVar="Happiness", fs;
    
	public void func() {
	    System.out.println(s);
	 
	    //length of string
	    n = s.length();
	    System.out.println("Number of characters = " + n);
	 
	    //Replace characters
	    System.out.println("---------------------");
	    t = s.replace("Alekhya", "Alekhya Sasidhar");
	    System.out.println(s);
	    System.out.println(t);
	 
	    //Concatenating string 
	    System.out.println("---------------------");
	    u = s.concat(" have fun");
	    System.out.println(s);
	    System.out.println(u);
	  
	    //printf and formst difference
	    System.out.println("---------------------");
		/*System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);*/
	    
		fs = String.format("The value of the float variable is " +               
		                   "%f, while the value of the integer " +
		                   "variable is %d, and the string " +
		                   "is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
		
		/* Using String's static format() method allows you to create a formatted string that you can reuse, 
		 * as opposed to a one-time print statement.*/
		
		//CharAt
		char result = s.charAt(8);
	      System.out.println(result);
	      
	    //Compare. First method compares this String to another Object 
	     //and second method compares two strings lexicographically.
	      
	      
	    
	}
}
