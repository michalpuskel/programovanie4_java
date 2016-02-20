
public class Faktorial {

	/**
	 * @param args
	 * @author Michal_Puškel
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 21; i++) {
			System.out.println("Faktorial(" + i + ")\t=\t" + factorial(i));	
		}
		
	}
	
	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
