import java.util.Scanner;
public class WhatIsN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if (n==1||n==9||n==10) 
			System.out.println(1);
		if (n==2||n==3||n==7||n==8)
			System.out.println(2);
		if (n==4||n==5||n==6)
			System.out.println(3);
	}
}