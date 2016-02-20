
public class Hviezdicky {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(star(5));
	}
	
	public static String star(int n) {
		String vysl = "";
		for (int i = 1; i < n+1; i++) {
			for (int j = 0; j < (n - i); j++) {
				vysl += ' ';
			}
			for (int j = 1; j < (2 * i); j++) {
				vysl += '*';
			}
			vysl += '\n';
		}
		return vysl;
	}

}
