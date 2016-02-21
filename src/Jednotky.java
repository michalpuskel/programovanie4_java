/**
 * @author misko
 */
public class Jednotky {

    public static void main(String[] args) {

        Input in = new Input();
        System.out.println("Zadaj pocet '1' n:");
        int n = in.nextInt();
        System.out.printf("Dec(2**n - 1) = %d", cislo(n));
        in.close();

    }

    /**
     * na predmete Programovanie 3 sme boli explicitne vystrihani pred hovnokodmi typu:<br/>
     * while (n-- > 0)<br/>
     * ale zjavne tunaaa na Jave sme sami <strong>fajnsmekri</strong> takze si dovolim aj ja sem tam taky maly <em>trol</em><br/>
     * a som za to vdacny konecne som pochopil rozdiel medzi n-- a --n<br/>
     * na cpp som to bral tak ze skratka --n nikdy nepouzivat... ale to by bola velka skoda :)
     * <p style="color: #07c307;">It is worth noting that, full comprehension of diff n-- vs --n is best accomplished by IntelliJ IDEA user-friendly debugger<br/> powered by Linux Mint Cinnamon :)</p>
     * @param n pocet chlievikov s 1 v bin zapise
     * @return 2**n - 1
     */
    public static int cislo(int n) {
        int b = 0;
        while (n-- > 0) {
            b <<= 1;
            b++;
        }
        return b;
    }

}
