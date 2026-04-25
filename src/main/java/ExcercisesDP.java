
public class ExcercisesDP {

	public static long binomial(int N, int K) {
		return 0;
	}

	public static int change(int[] coins, int amount) {
		return 0;
	}
	
	public static void main(String[] args) {
		int[] coins = { 1, 4, 6 };
		int c = change(coins, 9);	// c = 3 [4, 4, 1]
		System.out.println(c);
		
		long b = binomial(4, 3);	// b = 4 --> (1,2,3), (1,2,4), (1,3,4), (2,3,4)
		System.out.println(b);
	}

}
