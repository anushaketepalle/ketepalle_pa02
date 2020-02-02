package ketepalle_p1;

import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		int userInput;
		int a, b, c, d;
		
		System.out.print("Please input a four-digit number: ");
		userInput = scnr.nextInt();
		
		a = ((userInput / 1000 + 3) % 10);
		b = (((userInput % 1000) / 100) + 3) % 10;
		c = ((((userInput % 100) / 10) + 3) % 10);
		d = (((userInput % 10) + 3) % 10);
		
		
		System.out.printf("Your decrypted value is: %d%d%d%d.", c, d, a, b);
		
	}

}
