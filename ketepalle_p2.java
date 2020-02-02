package ketepalle_p2;

import java.util.Scanner;

public class ketepalle_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		String userChoice;
		double userWS, userHS, userWM, userHM, bmiS, bmiM;
		//W = weight, H = height, S = standard, M = metric
		
		System.out.println("Welcome to the Body Mass Index Calculator!");
		System.out.println("Would you like to use the Standard or Metric scale? Please type out your response.");
		System.out.println("Please type out your response.");
		
		userChoice = scnr.nextLine();
		
		while(!userChoice.equals("Standad"))
		{
			System.out.println("Please try again.(in While)");
			userChoice = scnr.nextLine();
		}
		
		switch(userChoice) {
		//used to do one metric case and one standard case
		
		case "Metric":
			System.out.println("Enter your height in centimeters: ");
			userHM = scnr.nextDouble();
			System.out.println("Enter your weight in kilograms: ");
			userWM = scnr.nextDouble();
			bmiM = userWM/(userHM * userHM);
			System.out.println("Your Body Mass Index is: " + bmiM);
			break;
			
		case "Standard":
			System.out.println("Enter your height in inches: ");
			userHS = scnr.nextDouble();
			System.out.println("Enter your weight in pounds: ");
			userWS = scnr.nextDouble();
			bmiS = (703 * userWS)/(userHS * userHS);
			System.out.println("Your Body Mass Index is: " + bmiS);
			break;
			
		default:
			System.out.println("Please try again.");
		}
		
		System.out.println(" ");
		System.out.println("BMI Categories");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = 30 or greater");
	}

}
