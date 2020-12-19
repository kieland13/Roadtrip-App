package Roadtrip;

import java.util.Scanner;

public class MpgCalc {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		//Initialize Scanner so user can make inputs
		
		//Initialize all the variables
		double startGalGas = 0;
		double endGalGas = 0;
		double distTraveled = 0;
		double gasPrice;
		double[] mpg = new double[11];
		double totalMpg = 0;
		double nextTrip;
		
		//Have the user answer the set of questions 10 times for 10 trips
		for(int trip = 1; trip <  mpg.length; trip++) {
			
			//ask user for how many gallons they began the trip with
			System.out.println("How many gallons did you have at the beggining trip " + trip + "?");
			startGalGas = scnr.nextDouble();
			
			//if they enter in a negative number, an error message will appear
			while (startGalGas < 0) {
				System.out.println("Number needs to be greater than 0, enter a positive number:");
				startGalGas = scnr.nextDouble();
			}
			
			//ask the user for how many gallons were left at end of trip
			System.out.println("How many gallons did you have at the end of trip " + trip + "?");
			endGalGas = scnr.nextDouble();
			
			//if they enter in a negative number, an error message will appear
			while (endGalGas < 0) {
				System.out.println("Number needs to be greater than 0, enter a positive number:");
				endGalGas = scnr.nextDouble();
			}
			
			//ask the user for how many miles they traveled for the one trip
			System.out.println("How far did you travel for trip " + trip + " in miles?");
			distTraveled = scnr.nextDouble();
			
			//if they enter in a negative number, an error message will appear
			while (distTraveled < 0) {
				
				System.out.println("Number needs to be greater than 0, enter a positive number:");
				distTraveled = scnr.nextDouble();
			}
			//calculate the MPG for that specific trip and print it out
			double milesPerGal = distTraveled / (startGalGas - endGalGas);
			System.out.println("What was the MPG for trip " + trip + "?");
			System.out.println(milesPerGal);
		
			//using an array, add up the total MPG for all ten trips
			totalMpg = totalMpg + milesPerGal;
		}
		//get an average of all ten trips MPG into one MPG
		double totalAvgMpg = totalMpg / mpg.length;
		
		System.out.println("The average MPG for all ten trips is: " + totalAvgMpg);
		
		//ask the user how far they would like to travel next
		System.out.println("How far would you like to go on your next trip?");
		nextTrip = scnr.nextDouble();
		
		//if they enter in a negative number, an error message will appear
		while (nextTrip < 0) {
			
			System.out.println("Number needs to be greater than 0, enter a positive number:");
			nextTrip = scnr.nextDouble();
		}
		
		double fillAmount = nextTrip / totalAvgMpg;
		//after asking the user, calculate how many gallons they will need to fill up for that trip
		System.out.println("You will have to fill up " + (fillAmount) + " times");
		System.out.println("What is the current cost of gas?");
		gasPrice = scnr.nextDouble();
		
		//if they enter in a negative number, an error message will appear
		while (gasPrice < 0) {
			
			System.out.println("Number needs to be greater than 0, enter a positive number:");
			gasPrice = scnr.nextDouble();
		}
		//print out the total cost for that next trip
		System.out.println("Your trip will cost $" + (fillAmount * gasPrice));
		}
		
		

	}

