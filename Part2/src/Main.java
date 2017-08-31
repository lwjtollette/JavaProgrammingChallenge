import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static Scanner reader;
	
	public static void forLoop(List<Integer> list) {
		int sum =0;
		
		for(int i=0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		
		System.out.println("The Sum = " + sum);
	}
	
	public static void whileLoop(List<Integer> list, int itemCount) {
		int sum=0;
		int count =0;
		
		while(count < itemCount)
		{
			sum = sum + list.get(count);
			count++;
		}
		
		System.out.println("The Sum = " + sum);
	}
	
	public static void Recursion(List<Integer> list, int count, int sum, int itemCount) {
		
		if(count < itemCount)
		{
			sum= sum + list.get(count);
			count++;
			Recursion(list, count, sum, itemCount);
		}
		else System.out.println("The Sum = " + sum);
	}
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		int itemNum = 1;	// Identifies an items position in the list
		int count =0;		// Keeps Count of Number of Items entered into list
		int listItem =0;	//Number that will be added to list
		int itemCount = 0; // Identifies the number of items that the list should end with
	
	/* Scans for system input to register number from user*/
	reader = new Scanner(System.in);
	System.out.println("How many items do you wish to add to the list? (Enter an Integer)");
	itemCount = reader.nextInt(); 
	
	while(count < itemCount)
	{
		System.out.println("Please enter item #" + itemNum);
		listItem = reader.nextInt();
		list.add(listItem);
		itemNum++;
		count++;
	}
	
	forLoop(list);
	
	whileLoop(list, itemCount);
	
	Recursion(list,0, 0, itemCount);
	
	}
}
