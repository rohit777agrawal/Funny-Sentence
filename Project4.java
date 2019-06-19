import java.util.Scanner;
public class Project4 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		// create string for color and ask user for input
		String color;
		System.out.println("Enter your favorite color");
		Scanner keyboard = new Scanner(System.in);
		color = keyboard.nextLine();
		
		// create string for food and ask user for input
		String food;
		System.out.println("Enter your favorite food");
		food = keyboard.nextLine();
		
		// create string for animal and ask user for input
		String animal;
		System.out.println("Enter your favorite animal");
		animal = keyboard.nextLine();
		
		// create string for friend and ask user for input
		String friend ;
		System.out.println("Enter the first name of your friend or relative");
		friend = keyboard.nextLine();
		
		//Make a sentence including the users input
		String S1 = "I had a dream that " + friend + "\n ate a " + color + " " + animal + " and said it tasted like " + food + "!" ;
		// show the result
		System.out.println(S1);
		
	}
}
