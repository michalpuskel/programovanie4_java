/**
 * <p>algoritmus gcd som do hlbky pochopil na <strong>Uvode do Deklarativneho programovania</strong> s p profs Klukom a Komarom
 * <strong>toto ma byt POVINNY PREDMET PRE AIN</strong></p>
 * a nie ze ho vymazete z existencie vesmiru... PLS fix it ASAP!!!
 * @author Michal Puskel
 * @see <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor">Greatest common divisor</a>
 */
public class GcdNsn {

    public static void main(String[] args) {

        Input in = new Input();
        System.out.println("Zadaj 2 kladne cele cisla, prosim");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("gcd(%d, %d)\t=\t%d%n", a, b, gcd(a,b));
        System.out.printf("lcm(%d, %d)\t=\t%d%n", a, b, lcm(a,b));
        in.close();

    }

    /**
     * pocita najvacsi spolocny delitel 2 cisiel (kladnych)
     * @param a kladne cele cislo
     * @param b kladne cele cislo
     * @return gcd(a,b)
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    /**
     * pocita najmensi spolocny nasobok 2 cisiel (kladnych)
     * @param a kladne cele cislo
     * @param b kladne cele cislo
     * @return lcm(a,b)
     */
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
