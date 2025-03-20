/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.03.2025
 * @author 
 */

public class WhileStruktogramm {
  
  public static void main(String[] args) {

    int zahl;
    int Nutzereingabe;

    zahl=0;
    Nutzereingabe = InOut.readInt("Was soll die Endzahl sein?  ");
    while (zahl != Nutzereingabe) { 
      zahl++;
      System.out.print(zahl + " ");
    }
    System.out.println("");
    System.out.println("Deine Zahl (" + Nutzereingabe + ") wurde erreicht!");
   
  } // end of main

} // end of class WhileStruktogramm

