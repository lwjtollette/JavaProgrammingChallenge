import java.util.Scanner;

public class Main {
public static void HelloWorld() {
	
	/*Print "Hello, World" to the screen*/
	
	System.out.println("Hello, World");
	
	
}

public static void AcceptUserName() {
	
	/* Asks user for name and then stores the name into a variable*/
	Scanner reader = new Scanner(System.in);
	System.out.println("Please enter your name: ");
	String name = reader.next();
	
	/* Uses Name variable to respond to user*/
	System.out.println("Hi, " + name + ". " + "How are you?");
}
	public static void main(String[] args) {
		
	/*Call HelloWorld Method*/
		
	HelloWorld();
	
	/* Call to AcceptUserName method*/
	
	AcceptUserName();
	
		

	}

}
