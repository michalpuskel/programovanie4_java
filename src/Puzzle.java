/**
 * hadanka - program z riesenych uloh
 */
public class Puzzle {
  static void usage() {
    System.out.println("Usage: \n\t" +
      "help yourself");
    System.exit(1);
  }
  public static void main(String[] args) {
    if(args.length != 1) usage();
    if(args[0].equals("paj")) {
	  int n = 0;
	  int m = 0;
      while(m < 314588) {
        double a = Math.random();
        double b = Math.random();
        if (a*a < 1-b*b) n++;
        m++;
	   }
       System.out.println("What ??? !" + (4F*n/m));
    }
    else
      usage();
  }
}

/*
aproximuje PI

What ??? !3.1357584

na Linuxe s IntelliJ IDEA a integrovanym terminalom velmi pohodlne riesitelna uloha :)
skutocne netusim ako toto riesilia vacsina mojich kamaratov na Win :/ .....
*/
