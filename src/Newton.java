/**
 * @author misko
 * toto som nevedel vyriesit
 * pozrel som si Vase spravne riesenie a snazim sa ho nejako vstrebat
 */
public class Newton {

    public static void main(String[] args) {
        //*** Newtonova iteracia pre sqrt(2)
        double x;
        double xx = 100;  // velmi zla pociatocna aproximacia
        do {
            x = xx;
            xx = 1/x + x/2;		// vzorec zo zadania
            System.out.println("odmocnina z dvoch: " + xx);
        } while (Math.abs(x-xx) > 1e-10);	// opakuj, kym odchylka dvoch posebeiducich je mensia ako epsilin
        // ina podmienka na zastavenie moze byt Math.abs(x*x-2) < epsilon
        System.out.println("odmocnina z dvoch: " + xx);
    }

}
