import java.util.Scanner;

public class Answer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Day Number: ");
		int dayNumber = in.nextInt();
		System.out.println("The Day Number is " + dayNumber);
		
		if (dayNumber == 0)
		{
			System.out.println("Sunday");
		} 
		else if (dayNumber == 1)
		{
			System.out.println("Monday");
		} 
		else if (dayNumber == 2)
		{
			System.out.println("Tuesday");
		} 
		else if (dayNumber == 3)
		{
			System.out.println("Wednesday");
		} 
		else if (dayNumber == 4)
		{
			System.out.println("Thursday");	
		} 
		else if (dayNumber == 5)
		{
			System.out.println("Friday");
		} 
		else if (dayNumber == 6)
		{
			System.out.println("Saturday");
		}
		else 
		{
			System.out.println("Not a valid day");
		}
		
		// ********** OR **********
	}
}