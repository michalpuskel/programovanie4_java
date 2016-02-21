/**
 * @author misko
 */
public class Binary {

    public static void main(String[] args) {

        System.out.println(pocetJednotiek(10) + "\n");
        System.out.println(pocetJednotiek(65535) + "\n");
        System.out.println(pocetJednotiek(15) + "\n");

    }

    /**
     * funkcia spocita kolkokrat sa da celociselne vydelit cislo 2kou
     * @param n vstupne cislo v desiatkovej sustave
     * @return
     */
    public static long pocetJednotiek(int n) {
        System.out.printf("%-8d", n);
        long poc = 0;
        String bin = "";
        while (n > 0) {
            bin = n % 2 + bin;
            poc += n % 2;
            n /= 2;
        }
        System.out.println(" = " + bin);
        return poc;
    }

}
