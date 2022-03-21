import java.util.*;
import java.io.*;

/*
* COMMENTS:    BIG BRAIN PERMUTATION METHOD
*/

public class PERMUTATIONS {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		String needle = "asdfghjg";
		char[] e = new char[needle.length()];
		for (int i=0; i<needle.length(); i++) {
			e[i] = needle.charAt(i);
		}
		permuteRest(e, 0);
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		/*
		char[] e = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		long startTime = System.nanoTime();
		
		permuteRest(e, 0);
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000000); */
	}

	public static void permuteRest (char[] e, int iStart) { //istart is starting index
		if (iStart == e.length) {
			System.out.println(e);
		}
		else {
			for (int j=iStart; j<e.length;j++) {
				swap (e,iStart, j);
				permuteRest(e,iStart+1);
				swap(e,iStart,j); //swap back - this is backtracking
				}
			}
	}
	
	public static void swap (char[] e, int i, int j) {
		char temp = e[i];
		e[i] = e[j];
		e[j] = temp;
	}
	
}



