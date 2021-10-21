//Travis Hammonds
//Lab 3 Variables and Expressions
//Sep 16 2021
//Dr. Nazli Hardy

//Import Scanner class
import java.util.Scanner; 

public class TimeBreakdown {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in); //Create scanner obj
		System.out.println("Enter amount of seconds: ");  
		
		//reads number provided using keyboard
		int num1 = scan.nextInt();
		
		//Close scanner after use
		scan.close();
		
		//Divide for days
		//86400 seconds in a day
		int day;
		day = num1 / 86400; 
		
		//Get remainder of day 
		int remainder;
		remainder = num1 % 86400;
		
		//Convert remainder seconds to hours
		int hours;
		hours = remainder / 3600;
		
		//Get remainder of hour
		remainder = remainder % 3600;
		
		//Convert seconds to minutes 
		int minutes;
		minutes = remainder / 60;
		
		//Label last seconds
		int seconds;
		seconds = remainder % 60;
		
		//Display message 
		System.out.println("A time of " + num1 + " seconds is equivalent to \n" 
				+ day + " day(s)\n" 
				+ hours + " hour(s)\n"
				+ minutes +" minute(s)\n"
				+ seconds + " second(s)");
	}
}
