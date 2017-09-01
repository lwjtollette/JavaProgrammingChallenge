import java.util.Scanner;

public class Main {
public static Scanner reader;
public static void HelloWorld() {
	
	/*Print "Hello, World" to the screen*/
	
	System.out.println("Hello, World");
	
	
}

public static void AcceptUserName() {
	
	/* Scans for system input to register name from user */
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
	
	/* Sums numbers from 1 to N (user inputed number) */
	for (int i = 0; i < number ; i++){
		sum = sum +i;
	}
	
	/* Prints sum */
	System.out.println("The Sum = " + sum);
}
public static void ProductVsSumCase(int choice, int number, int sum, int product) {
	/* Processes correct calculation based off of user's choice*/
	switch(choice) {
	
		case 1: {
		
			sum=number;
			
			/* Sums numbers from 1 to N (user inputed number) */
			for (int i = 0; i < number ; i++){
				sum = sum +i;
			}

			/* Prints sum result */
			System.out.println("The Sum = " + sum);
			break;
		}
		case 2:{
		
			/* Calculates product of 1 to N (user inputed number) */
			product=number;
			for (int j = 1; j < number; j++) {
				product = product * j;
	
		}
			/* Prints product result*/
			System.out.println("The Product = " + product);
			break;
		}
		default: {
		
			/* notifies user that option was invalid */
			System.out.println("Please enter a correct option: 1 or 2");
			
			/* Prompts user to choose a valid option */
			reader = new Scanner(System.in);
			System.out.println("Please Enter a Number Option [1: Sum or 2:Product] ");
			choice = reader.nextInt();
			
			/* Runs back through cases with correct option */
			ProductVsSumCase(choice, number, sum, product);
			break;
		}
	}
}
public static void ProductVsSum() {
	int sum= 0; // initiating the sum to 0
	int choice= 0;
	int number= 0;
	int product =0;
	
	/* Scans for system input to register number from user*/
	reader = new Scanner(System.in);
	System.out.println("Please enter an integer of your choice: ");
	number = reader.nextInt(); 
	
	/* Scans for system input to register option from user*/
	System.out.println("Please Enter a Number Option [1: Sum or 2:Product] ");
	choice = reader.nextInt();
	ProductVsSumCase(choice, number, sum, product);
	
}
public static void main(String[] args) {
		
	/*Prints "Hello, World" to the screen*/
		
	HelloWorld();
	
	/* Accepts user name input and returns greeting with name*/
	
	AcceptUserName();
	
	/* Summation of numbers 1 to user input number*/
	Sum();
	
	/* Allows user to chose to do a summation or find the product of numbers 1 to user input*/
	ProductVsSum();

	}

}
