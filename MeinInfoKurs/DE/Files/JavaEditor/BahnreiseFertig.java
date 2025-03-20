/**
*
* Beschreibung
*
* @version 1.0 vom 24.02.2025
* @David 
*/

public class BahnreiseFertig {

  public static void main(String[] args) {

    double MaximalPreis;
    double Rabatt;
    double Normalpreis;
    double Personen;
    double Preis;
    double Gruppenrabatt;
    double Gesamtpreis;
    double PersonenPreis;

    MaximalPreis=36.6;
    Rabatt=0.7;
    
    Personen = InOut.readDouble("Personen: ");
    Normalpreis = InOut.readDouble("Normalpreis: ");
    if (Normalpreis>=MaximalPreis) {
      Normalpreis=MaximalPreis;
    }
    if (Personen>=6) {
      Preis=Normalpreis*Personen;
      Gruppenrabatt=Preis*Rabatt;
      Gesamtpreis=Preis-Gruppenrabatt;
    } else {
      Gesamtpreis=Normalpreis*Personen;
    }
    PersonenPreis=Gesamtpreis/Personen;
    System.out.println("");
    System.out.println("Preis pro Person: " + InOut.format2(PersonenPreis) + " Euro");
    System.out.println("Gruppenkosten: " + InOut.format2(Gesamtpreis) + " Euro");

  } // end of main

} // end of class BahnreiseFertig
 
