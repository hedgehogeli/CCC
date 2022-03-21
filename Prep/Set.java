import java.util.HashSet;

public class Set {
	
	public static void main(String[] args) {
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		
		System.out.println(hash_Set);
		
		if(hash_Set.contains("Geeks")) {
			System.out.println("yes");
		}
		
		hash_Set.remove("Example");
		
		for(String s : hash_Set ) {
			System.out.println(s);
		}


	}

}
