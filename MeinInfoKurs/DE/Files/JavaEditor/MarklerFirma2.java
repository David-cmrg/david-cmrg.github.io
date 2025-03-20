public class MarklerFirma2 {
  
  public static void main(String[] args) {
    double  GrundstuecksPreis, Marklergebuehr, GesamtKosten, Breite, Laenge, QuadratMeterPreis, Gebuehr, Mehrwertsteuer, Gewinnkalkulation, Jahressteigerung = 1,99, Gewinn, Jahre, Gewinn2;
  
    System.out.println("");              
    System.out.println("Marklerfirma von Herr Rich Immobilienkalkulator:");
    System.out.println("");
    System.out.println("Erlaubt sind nur DezimalZahlen der Punkteschreibweise.");
    System.out.println("");
    
    Breite = InOut.readDouble("Welche Breite hat das Grundstueck in Meter? ");
    Laenge = InOut.readDouble("Welche Laenge hat das Grundstueck in Meter? ");
    QuadratMeterPreis = InOut.readDouble("Wie hoch ist der Quadratmeterpreis in Euro? ");
    Gebuehr  = InOut.readDouble("Wieviel betraegt die Marklergebuehr in Prozent? ");
    Mehrwertsteuer = InOut.readDouble("Wie hoch ist die Mehrwertsteuer in Prozent? ");
    Gewinnkalkulation = InOut.readDouble("Wie lange moechten sie ihr Grundstueck behalten? ")
    
    
    GrundstuecksPreis = Breite * Laenge * QuadratMeterPreis;
    Mehrwertsteuer = Mehrwertsteuer / 100 * GrundstuecksPreis;
    Marklergebuehr = Gebuehr / 100 * GrundstuecksPreis ;
    GesamtKosten = GrundstuecksPreis + Marklergebuehr + Mehrwertsteuer;
    Gewinn = GrundstuecksPreis* Jahressteigerung * Gewinnkalkulation;
    while(GrundstuecksPreis!=<Gewinn) { 
      Gewinn2 = GrundstuecksPreis* Jahressteigerung* (Jahre + 1);
    } // end of while
       System.out.println("");
    System.out.println("------------Grundstueckspreis------------");
    System.out.println("");
    System.out.println("Der Grundstueckspreis betraegt: " + InOut.format2(GrundstuecksPreis) + " Euro");
    System.out.println("Rechnung Grundstueckpreis:");
    System.out.println(GrundstuecksPreis + " (Grundstueckspreis) = " + Laenge + " (Laenge) * " + Breite + " (Breite) * " + QuadratMeterPreis + " (Quadratmeterpreis) " );
    System.out.println("------------Steuer und Gebuehr------------");
    System.out.println("Die Marklergebuehr betraegt " + InOut.format2(Marklergebuehr) +" Euro");
    System.out.println("Die Mehrertsteuer betraegt " + InOut.format2(Mehrwertsteuer) +" Euro");
    System.out.println("------------Gewinn------------");
    System.out.println("In " + Gewinnkalkulation + " Jahren haben sie " + Gewinn + " Euro eingenommen");
    System.out.println("Um den Break-Even-Point zu erreichen benötigen sie " + Jahre + " Jahre");
    System.out.println("------------Gesamtbetrag------------");
    System.out.println("Die Gesamtkosten betragen " + InOut.format2(GesamtKosten) + " Euro");
    System.out.println("Rechnung Gesamtbetrag :");
    System.out.println(InOut.format2(GesamtKosten) + " (Gesamtkosten) = " + InOut.format2(GrundstuecksPreis) + " (Grundstueckspreis) + " + InOut.format2(Mehrwertsteuer) + " (Mehrwertsteuer) + " + InOut.format2(Marklergebuehr) + " (Maklergebuehr) ");
    System.out.println("");
    System.out.println("Vielen Dank fuer den Auftrag. Bis zum naechsten mal.");
  }
  
}
