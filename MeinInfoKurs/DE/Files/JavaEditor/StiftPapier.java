/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15.02.2021
 * @David
 */

public class StiftPapier {
  
  public static void main(String[] args) {
        int y;
    int x = 1;
    int total = 0;
    while (x <= 5) {
      y = x * x;
      System.out.println("Y: " + y);
      System.out.println("Total: " + total);
      total = total + y;
      x = x + 1;
    } // end of while
    System.out.println("Total ist: " + total);

  } // end of main

} // end of class StiftPapier

