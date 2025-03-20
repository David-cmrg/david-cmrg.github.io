/**
*
* Keine Garantie auf vollständigkeit oder funktionsfähigkeit. 
*
* @version 1.0 vom 20.03.2025
* @MeinInfoKurs.github.io
*/

public class OnlineKaufhausX {
  
  public static void main(String[] args) {

    double Versandpauschale;
    double Rabatt;
    int Preis;
    int Auftragswert;
    String Ausgabe;

    Versandpauschale=3.5;
    Rabatt=0.02;
    Preis=100;
    Auftragswert=0;
    Auftragswert="Wie_hoch_belaufen_sich_ihre_gesamten_Einkaufskosten?" = InOut.readDouble("Auftragswert="Wie_hoch_belaufen_sich_ihre_gesamten_Einkaufskosten?": ");
    if (Auftragswert>Preis) {
      Rabatt=Auftragswert*Rabatt;
      Auftragswert=Auftragswert-Rabatt;
      Ausgabe="Ihr Preis beträgt: " + Auftragswert;
    } else {
      Auftragswert= Auftragswert + Versandpauschale;
      Ausgabe="Ihr Preis beträgt: " + Auftragswert;
    }
   
  } // end of main

} // end of class OnlineKaufhaus

