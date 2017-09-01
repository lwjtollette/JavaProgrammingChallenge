import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
static Scanner reader;
	
	public static void forLoop(List<Integer> list) {
		int sum =0;
		
		for(int i=0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		
		System.out.println("The Sum by for loop= " + sum);
	}
	
	public static void whileLoop(List<Integer> list, int itemCount) {
		int sum=0;
		int count =0;
		
		while(count < itemCount)
		{
			sum = sum + list.get(count);
			count++;
		}
		
		System.out.println("The Sum by while loop = " + sum);
	}
	
	public static void Recursion(List<Integer> list, int count, int sum, int itemCount) {
		
		if(count < itemCount)
		{
			sum= sum + list.get(count);
			count++;
			Recursion(list, count, sum, itemCount);
		}
		else System.out.println("The Sum by Recursion = " + sum);
	}
	
	public static void Rotate(List<Integer> list, int itemCount) {
		int rotation = 0;
		
		/* takes user input for rotation*/
		reader = new Scanner(System.in);
		System.out.println("By what number would you like to rotate the list?");
		rotation = reader.nextInt(); 
		
		
		/*Rotates list items*/
		for(int i=0; i < (itemCount - rotation); i++) {
			for (int j= list.size() -1; j > 0; j--) {
	
				int temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);
				
			}
		}
		
		
			System.out.println("List Rotated by: " + rotation + " is " + list);
	
		
	}
	
	public static void Sort(List<Integer> list) {
		Collections.sort(list);
		
		System.out.println("Mereged and Sorted List: " + list);
		
	}
	
	public static void Merge( List<Integer> list1, List<Integer> list2) {
		System.out.println("List 1: " + list1);
		System.out.println("list 2: " + list2);
		
		List<Integer> listMerged = new ArrayList<Integer>();
		listMerged.addAll(list1);
		listMerged.addAll(list2);
		
		Sort(listMerged);
	}
	
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
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
		System.out.println("Please enter item #" + itemNum );
		listItem = reader.nextInt();
		list.add(listItem);
		itemNum++;
		count++;
	}
	
	forLoop(list); // calculates a sum using a for loop
	
	whileLoop(list, itemCount); // calculates a sum using a while loop
	
	Recursion(list,0, 0, itemCount); // calculates a sum using recursion
	
	Rotate(list, itemCount); // rotates a list
	
	/* Takes in input for number of items in the second list*/
	reader = new Scanner(System.in);
	System.out.println("Create another list to merge to the first list!");
	System.out.println("How many items do you wish to add to the list? (Enter an Integer)");
	int itemCount2 = reader.nextInt(); 

	itemNum=1;
	listItem =0;
	count=0;
	
	/* ands items to the the second list*/
	while(count < itemCount2)
	{
		System.out.println("Please enter item #" + itemNum );
		listItem = reader.nextInt();
		list2.add(listItem);
		itemNum++;
		count++;
	}
	
	Merge(list, list2); // Merges and sorts two lists
	
	}
}
