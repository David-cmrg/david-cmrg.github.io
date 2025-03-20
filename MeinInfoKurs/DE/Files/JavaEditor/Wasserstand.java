/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 06.02.2025
 * @author 
 */

public class Wasserstand {
  
  public static void main(String[] args) {
int Zaehlerstandalt, Zaehlerstandneu,  Zaehlerstand;
    double monatlicherGrundpreis, PreisproM, Ust=0.07, Netto1, Netto2, Nettogesamt, Bruttogesamt, Mehrwertsteuer1, Mehrwertsteuer2;
     Zaehlerstandalt=InOut.readInt("Was ist der alte Zaehlerstand: ");
    Zaehlerstandneu=InOut.readInt("Was ist der neue Zaehlerstand: ");
    monatlicherGrundpreis=InOut.readDouble("Was ist der monatliche Grundpreis den sie zahlen: ");
    PreisproM=InOut.readDouble("Was ist der Preis pro Kubikmeter: ");
     Zaehlerstand = Zaehlerstandneu - Zaehlerstandalt;
    Netto1= Zaehlerstand * PreisproM;
    Mehrwertsteuer1= Netto1*Ust;
    Netto2= monatlicherGrundpreis*12;
    Mehrwertsteuer2= Netto2*Ust;
    Nettogesamt= Netto1+Netto2;
    Bruttogesamt= Mehrwertsteuer2+Mehrwertsteuer1+Netto1+Netto2;
    System.out.println("Ihr Wasserverbrauch betraegt: " + Zaehlerstand);
    System.out.println("Ihr Nettobetrag betraegt: " + InOut.format2(Nettogesamt)  + " Euro");
      System.out.println("Ihr Bruttobetrag betraegt: " + InOut.format2(Bruttogesamt) + " Euro");
  } // end of main

} // end of class Wasserstand

