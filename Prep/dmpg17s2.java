import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dmpg17s2 {
	
	static int n, m;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = mReader.readLine().split(" ");
		n = Integer.parseInt(temp[0]);
		
		arr = new int[n+1];
		
		for (int k=1; k<=n; k++) {
			arr[k] = k;
		}
		
		m = Integer.parseInt(temp[1]);
		
		for (int k=0; k<m; k++){
			String[] re = mReader.readLine().split(" ");
			int x = Integer.parseInt(re[1]);
			int y = Integer.parseInt(re[2]);
			int px = findParent(x);
			int py = findParent(y);
			
			if (re[0].equals("A")) {
				if (px!=py) arr[py] = arr[px];
			}
			else {
				if (px==py) System.out.println("Y");
				else System.out.println("N");
			}
			
			
		}
		
		mReader.close();
		
		
		}
	
	public static int findParent (int x) {
		if (arr[x] == x) return x;
		return findParent(arr[x]);
	}
	
}