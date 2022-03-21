import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/coci07c1p5
* 
* divide and conquer - the median cannot be removed so start from median to both ends
* for example string of 7 4
* 5 7 2 4 3 1 6
* under you process
* -1 0 -1 b 1 1 -1
* being -1 req one bigrger number on other side
* etc.
* 
* i don't think the code works but logic works ig
* 
* */

public class coci07p5 {

	static Map<Integer,Integer> map1 = new HashMap<>();
	static Map<Integer,Integer> map2 = new HashMap<>();
	static int[] num;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); int b = scan.nextInt();
		num = new int[n];
		int Bpos = -1;
		
		for (int k=0;k<n;k++) {
			num[k] = scan.nextInt();
			if (num[k]==b) Bpos = k;
		}
		scan.close();
		
		int cur=0;
		for (int k=Bpos-1;k<n;k++) {
			if(num[k]>b) cur++;
			else cur--;
			if (!map1.containsKey(cur)) map2.put(cur, 1);
			else map1.put(cur,map1.get(cur)+1);
		}
		cur=0;
		for (int k=Bpos+1; k<n; k++) {
			if (num[k]>b) cur++;
			else cur--;
			if (!map2.containsKey(cur)) map2.put(cur, 1);
			else map2.put(cur, map2.get(cur)+1);
		}
		int ans = 1;
		for (int key:map2.keySet()) {
			if (map1.containsKey(-1*key)) {
				ans += map1.get(-1*key)*map2.get(key);
			}
		}
		
		if (map1.containsKey(0)) ans += map1.get(0);
		if (map2.containsKey(0)) {
			ans += map2.get(0);
			System.out.println(ans);
		}
		
		
	}

}



