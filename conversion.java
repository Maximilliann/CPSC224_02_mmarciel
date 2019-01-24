/*
	In-class Assignment, 1/24/2019
	conversion.java
	Due: 1/25/19
	Name: Maximillian Marciel
	GU User: mmarciel
*/

import java.util.*;

public class conversion
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		String userInput;
		String userChoice;
		int userMeters;
		int userChoiceNum;
		
		while (true)
		{
			System.out.print("Enter a distance in meters: ");
			userInput = scnr.nextLine();
			userMeters = Integer.parseInt(userInput);
			if (userMeters < 0)
			{
				System.out.println("Negative numbers are not permitted");
			}
			else
			{
				menu();
				System.out.print("Enter your choice: ");
				userChoice = scnr.nextLine();
				userChoiceNum = Integer.parseInt(userChoice);
				if (userChoiceNum == 1)
				{
					showKilometers(userMeters);
				}
				else if (userChoiceNum == 2)
				{
					showInches(userMeters);
				}
				else if (userChoiceNum == 3)
				{
					showFeet(userMeters);
				}
				else if (userChoiceNum == 4)
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid input. Must be a number between 1-4.");
				}
			}
		}
	}
	
	//--------------------------------------------------------
	
	public static void menu()
	{
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}
	
	//--------------------------------------------------------
	
	public static void showKilometers(int meters)
	{
		double result = meters * 0.001;
		System.out.println(meters + " meters is " + result + " kilometers");
	}
	
	//---------------------------------------------------------
	
	public static void showInches(int meters)
	{
		double result = meters * 39.37;
		System.out.println(meters + " meters is " + result + " inches");
	}
	
	//---------------------------------------------------------
	
	public static void showFeet(int meters)
	{
		double result = meters * 3.281;
		System.out.println(meters + " meters is " + result + " feet");
	}
}