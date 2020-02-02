package ketepalle_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		//This is necessary in order to ask for input from the user later in the program.
		
		int userInput;
		int a, b, c, d;
		//userInput = 4 digit number, a,b,c,d = splitting the number into 4 separate values
		
		System.out.print("Please input a four-digit number: ");
		userInput = scnr.nextInt();
		
		a = ((userInput / 1000 + 7) % 10);
		b = (((userInput % 1000) / 100) + 7) % 10;
		c = ((((userInput % 100) / 10) + 7) % 10);
		d = (((userInput % 10) + 7) % 10);
		//Mods are used to separate the numbers before we do the calculation on them

		System.out.printf("Your encrypted value is: %d%d%d%d.", c, d, a, b);

	}

}
