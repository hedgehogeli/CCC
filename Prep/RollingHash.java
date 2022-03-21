import java.util.*;
import java.io.*;

/*
* COMMENTS: 
* hash = (s[0]*P^{0} + s[1]*P^{1} + ....s[m]*P^{m}) mod M 
* P = 31 or 53 (lower / upper case inclusion)
* M = 10^9+9   
* 
* so hash the searched, and then rehash by: (considering abc case, dropping a, adding d)
* drop a => (a* P^0 + b* P^1 + c* P^2) - a*P^0
* divide everything by P => (b*P^1 + c*P^2)/7 => b*P^0 + c*P^1
* add d => (b*P^0 + c*P^1)-already obtained + (d*P^2) 
* [the power of base for add is (pattern-length-1)]
* 
* str1 > str2 length checks may be necessary
* 
* i think this is functional but has not been tested thoroughly - does not work under current test case
there has to be smth wrong with moving window 9rehash
*/

public class RollingHash {

	public static void main(String[] args) {
	
		System.out.println(power(p, 8));
		
		String hay= "abcdefgabccabcdabcd";
		String needle = "abcdefg";
		
		int needleL = needle.length();
		int hayL = hay.length();
		
		long needleHash = hashStr(needle);
		long windowHash = hashStr(hay.substring(0,needleL)); //curr hash val
		int count = 0;
		
		for (int i=0; i<=(hay.length()-needleL); i++) {
System.out.println("winH = " + windowHash + "    needleH = " + needleHash);
System.out.println("winHash should be " + hashStr(hay.substring(i, i+needleL)));
System.out.println();
			if (windowHash == needleHash) { // if curr hash = needle hash
				//check if actually equal
				if (needle.equals(hay.substring(i,i+needleL))) {
					count++;
				}
			}
			
			//this clause is for not running into index error for last window mvmt
			if (i==(hayL-needleL)) break;
			
			//move window
			windowHash = hashDropAdd(windowHash, hay.charAt(i), hay.charAt(i+needleL), needleL);
		}
		
		System.out.println(count);

	}
	
	//hashing string function
	
	static int  p = 31;
	static int m = 1000000009;
	
	static long hashStr (String str) { //geeksforgeeks uses long here, but the output can't exceed M?
		//long and int returns different things so ig use long for safe
		
		long powerP = 1; // start at p^0
		long hash = 0;
		
		for (int i=0; i<str.length(); i++) {
		//	hash = (hash + (str.charAt(i) - ('a' - 1)) * powerP ) % m; //not sure if this -'a' is req but whatev
			hash = (hash + (str.charAt(i)*powerP)%m ) % m;
			powerP = (powerP * p) % m; //mod for math purposes and no exceed
			
		}
		
		return hash;
	}
	
	static long hashDropAdd (long prevVal, char drop, char add, int strLength) {
		//input for length of needle + 1, where last char is to add, and first to drop
		long newVal = 0;
		
		// drop first char
		newVal = prevVal - drop;
		
		//shift everything left by dividing by P
		if(newVal%p!=0) System.out.println("what the fuck, mod p = " + newVal%p);
		newVal = newVal / p;
		
		
		//add new
		newVal = (newVal%m + (add * power(p, strLength-1)%m )%m )%m;
		
		return newVal;
		
	}
	
	static long power (long a, long b) {
		if (b==0) return 1;
		
		else return ((a)*(power(a, b-1))%m)%m;
	}

}



