import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc2020s3postcontest1 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String needle = mReader.readLine();
		String hay = mReader.readLine();
		mReader.close();
//		Scanner scan = new Scanner(System.in);
//		String needle = scan.nextLine();
//		String hay = scan.nextLine();
//		scan.close();
		
		int[] needleID = new int[26];
		int[] substr = new int[26];
		
		int needleLength = needle.length();
		int hayLength = hay.length();
		
		if (needleLength>hayLength) System.out.println(0);
	else {
		
		Set<String> set = new HashSet<String>(); 
		
		for (int i=0; i<needleLength; i++) {
			needleID[needle.charAt(i)-97]++;
			substr[hay.charAt(i)-97]++;
		}
		
		int counter = 0;
		
		//initial compare to get started
		if (Arrays.equals(needleID, substr)) {
			counter++;
			set.add(hay.substring(0,needleLength));
		}
		
		int skip=0;
		//start pseudo rolling hashing
		for (int i=1; i<=hayLength-needleLength; i++) {	
			substr[hay.charAt(i-1)-97]--;
			substr[hay.charAt(i+needleLength-1)-97]++;
			
			if (skip>0) {
				skip--;
				continue;
				
			}
			
			int d = diff(needleID, substr);
			if (d==0) {		
				String temp = hay.substring(i,i+needleLength);
				if (!set.contains(temp)) {
					counter++;
					set.add(temp);
				}
			}
			else {
				///skip = d/2;
				skip =1; // skipping is bad
			}
		/*	if (check(needleID, substr)) {		
				String temp = hay.substring(i,i+needleLength);
				if (!set.contains(temp)) {
					counter++;
					set.add(temp);
				}
			} */
			
			
			
		}
		
		System.out.println(counter);
		
	}
		
		
	}
	
	
	
	public static int diff (int[] a, int[] a2) {
		int c = 0;
		
	    if (a==a2)
	        return 0;
	    
	    for (int i=0; i<a.length; i++) {
	        c += Math.abs(a[i] - a2[i]);
	    }

	    return c;
	}
	public static boolean check (int[] a, int[] a2) {
		
		
	    if (a==a2)
	        return true;
	    
	    for (int i=0; i<26; i++) {
	        if (Math.abs(a[i] - a2[i]) > 0) return false;
	    }

	    return true;
	}
	

}