
public class Pascal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(cislo(5));

	}
	
	public static long cislo(int n) {  
		return Faktorial.factorial(n) / (Faktorial.factorial(n - n / 2) * Faktorial.factorial(n / 2));
	}

}
