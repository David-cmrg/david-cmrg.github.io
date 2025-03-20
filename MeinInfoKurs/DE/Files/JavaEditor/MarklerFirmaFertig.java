public class MarklerFirmaFertig {
  
  public static void main(String[] args) {
    double  GrundstücksPreis, Marklergebühr, MehrwertSteuer, GesamtKosten, Breite, Länge, QuadratMeterPreis, Gebühr, Steuern;
  
    System.out.println("");              
    System.out.println("Marklerfirma von Herr Rich Immobilienkalkulator:");
    System.out.println("");
    System.out.println("Erlaubt sind nur DezimalZahlen der Punkteschreibweise.");
    System.out.println("");
    
    Breite = InOut.readDouble("Welche Breite hat das Grundstück in Meter? ");
    Länge = InOut.readDouble("Welche Länge hat das Grundstück in Meter? ");
    QuadratMeterPreis = InOut.readDouble("Wie hoch ist der Quadratmeterpreis in Euro? ");
    Gebühr  = InOut.readDouble("Wieviel beträgt die Marklergebühr in Prozent? ");
    Steuern = InOut.readDouble("Wie hoch ist die Mehrwertsteuer in Prozent? ");
    
    GrundstücksPreis = Breite * Länge * QuadratMeterPreis;
    MehrwertSteuer = Steuern / 100 * GrundstücksPreis;
    Marklergebühr = Gebühr / 100 * GrundstücksPreis;
    GesamtKosten = GrundstücksPreis + Marklergebühr + MehrwertSteuer;
    
    System.out.println("");
    System.out.println("Der Grundstückspreis beträgt: " + InOut.format2(GrundstücksPreis));
    System.out.println("Die Marklergebühr beträgt: " + InOut.format2(Marklergebühr));
    System.out.println("Die Mehrertsteuer beträgt: " + InOut.format2(MehrwertSteuer));
    System.out.println("Die Gesamtkosten betragen: " + InOut.format2(GesamtKosten));
    System.out.println("");
    System.out.println("Vielen Dank für den Auftrag. Bis zum nächsten mal.");                 
  }
  
}


