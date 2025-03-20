public class Wassergebuehrern1 {
  
  public static void main(String[] args) {
    int ZaehlerstandAlt, ZaehlerstandNeu;
    double GrundPreis=0, KubikmeterPreis=0, Wasserverbrauch=0, NettoBetrag=0, Ust=0, BruttoBetrag=0;
    
    // Eingabe
    System.out.println("");
    System.out.println("- - - - - - Eingabe - - - - - -");
    System.out.println("Alle Preisangaben sind in Euro");
    System.out.println("");
    ZaehlerstandAlt = InOut.readInt("Alter Zählerstand: ");
    ZaehlerstandNeu = InOut.readInt("Neuer Zählerstand: ");
    GrundPreis = InOut.readDouble("Monatlicher Grundpreis: ");
    KubikmeterPreis = InOut.readDouble("Preis pro Kubikmeter: ");
    System.out.println("");
    
    // Rechnung
    Wasserverbrauch = ZaehlerstandAlt + ZaehlerstandNeu / 13;
    
    
    //Ausgabe
    System.out.println("- - - - - - Ausgabe - - - - - -");
    System.out.println("Wasserverbrauch: " + InOut.format2(Wasserverbrauch) + "Euro");
    System.out.println("NettoBetrag: " + InOut.format2(NettoBetrag) + "Euro");
    System.out.println("Ust 7%: " + InOut.format2(Ust) + "Euro");
    System.out.println("BruttoBetrag: " + InOut.format2(BruttoBetrag) + "Euro");
    System.out.println("");
    }
}
  
