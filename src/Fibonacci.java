
public class Fibonacci {

	/**
	 * @param args
	 * @author puskel1
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 31; i++) {
			System.out.println(fib(i));
		}

	}
	
	/**
	 * Pocita fibonachiho
	 * @param n "poradie fib cisla"
	 * @return "vypocitane n-te fib cislo"
	 */
	public static long fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

}
