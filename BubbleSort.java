/*
	Filename: 	BubbleSort.java
	Author: 	Dan Hunt
	Date:		02.12.19
*/
import java.util.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		// Variables and constants
		int[] someNums = new int[5];
		int comparisonsToMake = someNums.length - 1;
		Scanner keyboard = new Scanner(System.in);
		int a, b, temp;
		
		// for loop that will ask user to enter numbers
		for(a = 0; a < someNums.length; ++a)
		{
			System.out.print("Enter a number " + (a + 1) + " >> ");
			someNums[a] = keyboard.nextInt();
		}
		
		// Calls the display method which accepts the array and the number of iterations the sort loop has done so far
		display(someNums, 0);
		
		// The b loop comares two numbers and if they are out of order, will swap with the help of a temp variable
		// The a loop will continue the process by going through unitl all values have been compared and put in order
		for(a = 0; a < someNums.length - 1; ++a)
		{
			for(b = 0; b < comparisonsToMake; ++b)
			{
				if(someNums[b] > someNums[b+1])
				{
					temp = someNums[b];
					someNums[b] = someNums[b + 1];
					someNums[b + 1] = temp;
				}
			} // b for loop is finished
			display(someNums, (a + 1));
			--comparisonsToMake;
		}	// a for loop is finished
	}	
	
	public static void display(int[] someNums, int a)
	{
		System.out.print("Iteration " + a + ": ");
		// loop displays all values
		for(int x = 0; x < someNums.length; ++x)
		{
			System.out.print(someNums[x] + " ");			
		}
		System.out.println();
	}
	
}