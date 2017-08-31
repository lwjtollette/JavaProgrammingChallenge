import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static Scanner reader;
	public static void forloop() {
		
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
	
	for(int i = 0; i <list.size(); i++) {
	System.out.println(list.get(i));
	}
	}
}
