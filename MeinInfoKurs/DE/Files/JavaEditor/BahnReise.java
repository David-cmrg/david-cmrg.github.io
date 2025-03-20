/**           
 *
 * Beschreibung
 *
 * @version 1.0 vom 24.02.2025
 * @David
 */

public class BahnReise {
  
  public static void main(String[] args) {
    double Normalpreis, MaximalPreis=36.60, PersonenRabatt=0.7, PersonenPreis, GruppenPreis;  
    int Personen;
    
    Personen= InOut.readInt("Wie viele Personen sind in deiner Gruppe?   ");
    Normalpreis= InOut.readDouble("Was ist der Betrag des maximal Preises?   ");
    
    if (Personen>=6) {
      PersonenPreis=Normalpreis*PersonenRabatt;
      System.out.println("Preis pro Person   " + PersonenPreis);
      GruppenPreis=PersonenPreis*Personen;
      System.out.println("GruppenPreis   " + GruppenPreis);  
    } // end of if

   
  } // end of main

} // end of class BahnReise
         
