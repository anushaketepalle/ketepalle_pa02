package ketepalle_p3;

import java.util.Scanner;

public class ketepalle_p3 {

	static String [] s= {"Racism","Homophobia","Climate Change","Sexism","Poverty"};
	static int [][] f = new int [5] [10];
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		double [] sum=new double [] {0,0,0,0,0};
		double avg = 0;
		
		for(int i=0; i<10; i++) {
			for (int j=0; j<5; j++) {
				System.out.println("Rate the issue from 1-10.\n" + (j+1) + ". " + s[j]);
				f[j][i]=scnr.nextInt();
			}
		}
		System.out.println("The user response is: ");
		for(int i=0; i<5; i++) {
		System.out.print("\n" + (i+1) + ". " + s[i]);
		for(int j=0; j<10; j++) {
			System.out.print(f[i][j] + "\t");
			sum[i] = sum[i] + f[i][j];
		//this setup is to output the issue and have the user put their rating under
		}
		avg = sum[i]/10;
		System.out.print("The average is: " + avg);
		//to output the average
	}
	double max = sum[0], min = sum[0];
	int maxl = 0, minl = 0;
	for(int i=0; i<5; i++) {
		if(max < sum[i]) {
			max = sum [i];
			maxl = i;
		}
		if(min > sum[0]) {
			min = sum [0];
			minl = 1;
		}
	}
	System.out.println("Highest point total: " + s[maxl] +"\tRatings: " + max);
	System.out.println("Highest point total: " + s[minl] +"\tRatings: " + min);
}
}