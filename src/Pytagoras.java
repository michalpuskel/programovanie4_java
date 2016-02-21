/**
 * @author misko
 */
public class Pytagoras {

    public static void main(String[] args) {

        int poc = 0, vnoreni = 0;
        for (int a = 1; a < 100; a++) {
            if (a >= 50) {
                break;
            }
            for (int b = 1; b < 100; b++) {
                if (a + b >= 99) {
                    break;
                }
                for (int c = 1; c < 100; c++) {
                    if (a + b + c >= 100) {
                        break;
                    }
                    vnoreni++;
                    if (a*a + b*b == c*c &&
                            a + b + c < 100 &&
                            a + b >= c &&
                            a + c >= b &&
                            b + c >= a) {
                        System.out.println(a + "\t" + b + "\t" + c);
                        poc++;
                    }
                }
            }
        }
        System.out.println("\nPocet 3-uholnikov je " + poc);
        System.out.println("\nPocet vnoreni je " + vnoreni);
        System.out.println("\n300**3 je " + 300*300*300);

    }

}
