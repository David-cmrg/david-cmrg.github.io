public class MarklerFirmaFertig {
  
  public static void main(String[] args) {
    double  Grundst�cksPreis, Marklergeb�hr, MehrwertSteuer, GesamtKosten, Breite, L�nge, QuadratMeterPreis, Geb�hr, Steuern;
  
    System.out.println("");              
    System.out.println("Marklerfirma von Herr Rich Immobilienkalkulator:");
    System.out.println("");
    System.out.println("Erlaubt sind nur DezimalZahlen der Punkteschreibweise.");
    System.out.println("");
    
    Breite = InOut.readDouble("Welche Breite hat das Grundst�ck in Meter? ");
    L�nge = InOut.readDouble("Welche L�nge hat das Grundst�ck in Meter? ");
    QuadratMeterPreis = InOut.readDouble("Wie hoch ist der Quadratmeterpreis in Euro? ");
    Geb�hr  = InOut.readDouble("Wieviel betr�gt die Marklergeb�hr in Prozent? ");
    Steuern = InOut.readDouble("Wie hoch ist die Mehrwertsteuer in Prozent? ");
    
    Grundst�cksPreis = Breite * L�nge * QuadratMeterPreis;
    MehrwertSteuer = Steuern / 100 * Grundst�cksPreis;
    Marklergeb�hr = Geb�hr / 100 * Grundst�cksPreis;
    GesamtKosten = Grundst�cksPreis + Marklergeb�hr + MehrwertSteuer;
    
    System.out.println("");
    System.out.println("Der Grundst�ckspreis betr�gt: " + InOut.format2(Grundst�cksPreis));
    System.out.println("Die Marklergeb�hr betr�gt: " + InOut.format2(Marklergeb�hr));
    System.out.println("Die Mehrertsteuer betr�gt: " + InOut.format2(MehrwertSteuer));
    System.out.println("Die Gesamtkosten betragen: " + InOut.format2(GesamtKosten));
    System.out.println("");
    System.out.println("Vielen Dank f�r den Auftrag. Bis zum n�chsten mal.");                 
  }
  
}


