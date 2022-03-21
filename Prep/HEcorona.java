import java.util.*;
import java.io.*;

/*
* COMMENTS:
* https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/the-corona-virus/
* always YES because always reachable - you have option to not move
* convert to bit problem
*/

public class HEcorona {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int N = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int k=0; N>0; k++) {
			if ((N&1) != 0) {
				
				list.add(1<<k);
//				num = num | (1<<k);
//				System.out.println(num + " "); outputs position
				N = N>>1;
			}
		}
		
		System.out.println("YES");
		System.out.println(list.size());
		System.out.print("0 ");
		for(int m:list) {
			System.out.print(m + " ");
		}
		
	}

}



