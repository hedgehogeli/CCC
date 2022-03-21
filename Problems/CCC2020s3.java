import java.util.*;
import java.io.*;

// this works properly, but TLEs. 

public class CCC2020s3 {
	
	static Set<String> perms = new HashSet<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String needle = mReader.readLine();
		String hay = mReader.readLine();
		
	//	String hay = "abacabaabazcbaa";
	//	String needle = "abac";	
		
		mReader.close();
		
		int nL = needle.length();
		int hL = hay.length();
		
		if (nL > hL) System.out.println(0); //stpupid test case
		else {
			
			HashSet<Integer> set = new HashSet<Integer>();
			
			//create needle ID
			int[] nID = new int[26];
			Arrays.fill(nID, 0);
			for (int i=0; i<nL; i++) {
				nID[needle.charAt(i)-'a']++;
			}
			
			//moving window ID
			int[] wID = new int[26];
			Arrays.fill(wID, 0);
			
			for (int i=0; i<=hL-nL; i++) {
//				System.out.println("window start at " + hay.charAt(i));
				
				//initialise window
				if (i==0) {
					for (int k=0; k<nL; k++) {
						wID[hay.charAt(k)-'a']++;
					}
				}
				else {// else create temp window, drop prev and add new 
					wID[hay.charAt(i-1)-'a']--; // System.out.println("drop " + hay.charAt(i));
					wID[hay.charAt(i+nL-1)-'a']++; // System.out.println("add " + hay.charAt(i+nL));
				}
				
				//compare two ID values using func
				if (compArr(wID, nID)==true) {
					//if true then hash string and insert into set
					set.add(hashFunc(hay.substring(i, i+nL), nL));
				//	currently not bothering with the hash
				//	set.add(hay.substring(i, i+nL));
					
				}
				
				
			}
			
			System.out.println(set.size());
		//	for(String bonk : set) {
		//		System.out.println(bonk);
		//	}
			
		}
		
		
		
	}
	
	static boolean compArr (int[] a, int[] b) {
		
		
//		for (int c : a) {
//			System.out.print(c);
//		}
//		System.out.println("   winID");
//		for (int d : b) {
//			System.out.print(d);
//		}
//		System.out.println();
		
		for (int j=0; j<26; j++) {
			if (a[j] != b[j]) return false;
		}
		return true;
	}
	
	static int hashFunc (String str, int len) {
		
		int p = 31;
		int m = 1000000009;
		
		long powerP = 1;
		long hashVal = 0;
		
		for (int i=0; i<len; i++) {
			hashVal = hashVal + (str.charAt(i)*powerP)%m;
			powerP = (powerP * p ) %m;
		}
		
		return (int) hashVal;
	}

}
