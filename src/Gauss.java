
public class Gauss {

	/**
	 * @param args
	 * @author puskel1
	 */
	public static void main(String[] args) {
		System.out.println(sucet(1,4));
	}
	
	public static long sucet(long from, long to) {
		long b = ((to + 1) * to) / 2;
		long a = ((from + 1) * from) / 2;
		return b - a + from;
	}

}
