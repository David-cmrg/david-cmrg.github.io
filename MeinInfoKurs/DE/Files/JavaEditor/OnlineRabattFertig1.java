public class OnlineRabattFertig1 {
  
  public static void main(String[] args) {
    double KaufPreis, Versand, GesamtKosten, Rabatt;
    
    KaufPreis = InOut.readInt("Was ist dein Einkaufswert in Euro? ");
    if (KaufPreis <= 100) {
      Versand = 3.50;
      Rabatt = 0.0;
      GesamtKosten = KaufPreis + Versand;
    } else {
      Versand = 0;
      Rabatt = 0.90;
      GesamtKosten = KaufPreis + Versand;
      GesamtKosten = GesamtKosten * Rabatt;
    } // end of if-else
    System.out.println("");
    System.out.println("Versand: " + InOut.format2(Versand));
    System.out.println("Gesamtkosten: " + InOut.readInt(GesamtKosten));
  } // end of main

} // end of class OnlineRabattFertig1



