import java.util.*;
import java.io.*;

/*
* COMMENTS:https://dmoj.ca/problem/coci06c2p3
* COCI '06 Contest 2 #3 Kolone
* 
* it works but str lengths + sec can't exceed 200
* guess you could do it the right way by doing the math and dividing and shit 
* but hey this one worked
*/

public class coci06c2p3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); int b = scan.nextInt(); scan.nextLine();
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		int sec = scan.nextInt();
		
		String[] arr = new String[200];
		
		
		for (int i=0; i<str1.length() ;i++) {
			arr[100-(2*i)] = str1.substring(i,i+1);// System.out.println(arr[100-(2*i)]);
		}
		
		for (int i=0; i<str2.length(); i++) {
			arr[101-(2*sec)+(2*i)] = str2.substring(i,i+1);
		}
		
		
		//output
		for (int i=0;i<200;i++) {
			if (arr[i]!=null)  System.out.print(arr[i]);
		}
		

	}

	
	
}



