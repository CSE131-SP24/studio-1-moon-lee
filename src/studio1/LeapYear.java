package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		boolean Four = (year%4 == 0); 
		boolean Hundred = (year%100 != 0);
		boolean Exception=(year%400==0);
		boolean leapyear= (Four && Hundred|| Exception);
		System.out.println(leapyear);
	}

}
