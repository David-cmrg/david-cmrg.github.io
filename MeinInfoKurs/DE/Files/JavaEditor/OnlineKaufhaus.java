/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.02.2025
 * @David 
 */

public class OnlineKaufhaus {
  
  public static void main(String[] args) {

    double Versandpauschale;
    double Rabatt;
    double Preis;
    double Auftragswert;
    String Ausgabe;

    Versandpauschale=3.5;
    Rabatt=0.02;
    Preis=100;
    Auftragswert = InOut.readDouble("Wie hoch belaufen sich ihre gesamten Einkaufskosten?: " );
    if (Auftragswert>Preis) {
      Rabatt=Auftragswert*Rabatt;
      Auftragswert=Auftragswert-Rabatt;
    System.out.println("Ihr Gesamtpreis (nach Abzug von Rabatt) beträgt: " + Auftragswert);
    } else {
      Auftragswert= Auftragswert + Versandpauschale;
      System.out.println("Ihr Gesamtpreis beträgt: " + Auftragswert);
    }
   
  } // end of main

} // end of class OnlineKaufhaus

