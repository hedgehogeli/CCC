import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ccc2014s2 {

	public static void main(String[] args) throws Exception {

		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(mReader.readLine());
		String[] line1 = new String[n];
		line1 = mReader.readLine().split(" ");
		String[] line2 = new String[n];
		line2 = mReader.readLine().split(" ");
		
		for (int i=0;i<n;i++) {
			line1[i] = line1[i].toUpperCase();
			line2[i] = line2[i].toUpperCase();
		}
		
		HashMap<String, String> m1 = new HashMap<>(); 
		for (int i=0;i<n;i++) {
			m1.put(line1[i],line2[i]);
		}
		HashMap<String, String> m2 = new HashMap<>(); 
		for (int i=0;i<n;i++) {
			m2.put(line2[i],line1[i]);
		}
		
		
		String temp1 = "", temp2 = "";
		boolean check = true;
		for (int i=0;i<n;i++) {
			temp1 = m1.get(line1[i]);
			temp2 = m1.get(m2.get(m1.get(line1[i])));
			temp1 = line1[i];
			temp2 = m1.get(line1[i]);
			if(!temp1.equals(temp2)) {
				check = false;
			}
			if (line1[i].equals(line2[i])) {
				check = false;
			}
			if (line1[i] == null) {
				check = false;
			}
	//		if (m1.containsKey(line1[i])) {
	//			check = false;
	//		}
		}
		
		if (check == true) {
			System.out.println("good");
		}
		else System.out.println("bad");

	}

}
