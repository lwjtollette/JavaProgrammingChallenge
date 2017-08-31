import java.util.Scanner;

public class Main {
private static Scanner reader;
public static void HelloWorld() {
	
	/*Print "Hello, World" to the screen*/
	
	System.out.println("Hello, World");
	
	
}

public static void AcceptUserName() {
	
	reader = new Scanner(System.in);
	System.out.println("Please enter your name: ");
	String name = reader.next();
	
	/* Uses Name variable to respond to user*/
	System.out.println("Hi, " + name + ". " + "How are you?");
}

public static void Sum() {
	int sum = 0; // initiating the sum to 0
	
	/* Scans for system input to register number from user*/
	reader = new Scanner(System.in);
	System.out.println("Please enter an integer of your choice (to find the sum of numbers from 1 to n): ");
	int number = reader.nextInt(); 
	sum=number;
	
	for (int i = 0; i < number ; i++)
	{
		sum = sum +i;
	}
	
	System.out.println("The Sum = " + sum);
}
	public static void main(String[] args) {
		
	/*Prints "Hello, World" to the screen*/
		
	HelloWorld();
	
	/* Accepts user name input and returns greeting with name*/
	
	AcceptUserName();
	
	/* Summation of numbers 1 to user input number*/
	Sum();
		

	}

}
