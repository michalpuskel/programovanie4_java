/**
 * program precita zo vstupu polomer a kruznice a vypise jej obsah a obvod
 * @author Michal Puskel
 */
public class Kruznica {

    public static void main(String[] args) {

        System.out.println("zadaj polomer kruznice:");
        Input in = new Input();
        double r = in.nextDouble();
        System.out.printf("r = %f\tO = %f\tS = %f%n", r, obvod(r), obsah(r));
        in.close();

    }

    /**
     * funkcia pocita obsah kruhu
     * @param r polomer
     * @return obsah
     */
    public static double obsah(double r) {
        return Math.PI * r * r;
    }

    /**
     * funkcia pocita obvod kruhu
     * @param r polomer
     * @return obvod
     */
    public static double obvod(double r) {
        return 2 * Math.PI * r;
    }

}
