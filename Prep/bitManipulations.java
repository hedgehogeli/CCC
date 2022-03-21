import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class bitManipulations {

	public static void main(String[] args) {
		
		int n = 45; //doesnt' matter
		
		//checking rightmost bit
		// 1 in binary is 00000...0001
		// which essentially sets everything to 0, and if last digit of target is 1, then 1 comes out
		// otherwise it's 0, so:
		if ((n&1) != 0) {
			//final bit is 1 b/c calculation yields 00...001
			System.out.println("last bit 1");
		}
		else {
			// final bit is 0
			System.out.println("last bit 0");
		}
		
		//checking second rightmost bit
		// same logic as above, but this time 000..001 is left shifted to 00..00010
		if (( (n>>1)&1) !=0) {
			// bit is 0
			System.out.println("second bit 1");
		}
		else {
			// bit is 1
			System.out.println("second bit 0");
		}
		
		
		//counting how many 1s in the base 2 bit representation
		// essentailly saying while temp!=000000
		//if last digit is 1 add count, then remove last digit using rightshift
		int count = 0;
		int temp = n;
		while (temp>0) {
			if ((temp&1) != 0) count += 1;
			temp = temp>>1;
		}
		System.out.println(count);
		
		
		//setting the nth (counting from right) bit to 1:
		int a = 5; //target
		//int n = position
		a = a|(1<<(n-1));
		// the n-1 indexes it
		
		
		//setting the nth to 0
		a = a & ( ~(1<<(n-1)));
		//shift, flip, then use ~ cuz ~ is opposite to |		
		
		
	}

}
