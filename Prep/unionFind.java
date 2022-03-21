public class unionFind {

	public static void main(String[] args) {
		
	}
	
	public int findRoot(int x) {
		if (parent[x] == x) return x;
		return findRoot(parent[x]);
		
	}

}
