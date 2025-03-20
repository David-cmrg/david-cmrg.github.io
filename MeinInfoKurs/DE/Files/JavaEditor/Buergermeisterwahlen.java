/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @Daniel Pestov 
 */

public class Buergermeisterwahlen {
  
  public static void main(String[] args) {
    
    // Definition von Variablen
    long Stimmen1=0, Stimmen2=0, Stimmen3=0;
    double Summe, Anteil1, Anteil2, Anteil3;
    
    System.out.println("");
    
    //Eingabe
    Stimmen1 = InOut.readLong("Stimmen Billy Makes: ");
    Stimmen2 = InOut.readLong("Stimmen Marc Tuckerberg: ");
    Stimmen3 = InOut.readLong("Stimmen Larry Rage: ");
    
    //Verarbeitung
    Summe = Stimmen1 + Stimmen2 + Stimmen3;
    Anteil1 = Stimmen1 / Summe * 100;
    Anteil2 = Stimmen2 / Summe * 100;
    Anteil3 = 100 - Anteil1 - Anteil2;
    
    
    //Ausgabe
    System.out.println("Anteil Billy Makes: " + InOut.format2(Anteil1) + " %");
    System.out.println("Anteil Marc Tuckerberg: " + InOut.format2(Anteil2) + " %");
    System.out.println("Anteil Larry Rage: " + InOut.format2(Anteil3) + " %");
    
  } // end of main

} // end of class Buergermeisterwahlen

