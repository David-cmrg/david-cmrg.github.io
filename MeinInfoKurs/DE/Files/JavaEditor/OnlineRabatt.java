public class OnlineRabatt {
  
  public static void main(String[] args) {
    double KaufPreis, Versand, GesamtKosten, Rabatt;
    
    KaufPreis = InOut.readInt("Was ist dein Einkaufswert in Euro? ");
    if (KaufPreis <= 100) {
      Versand = 3.50;
      Rabatt = 0.0;
    } else {
      Versand = 0;
      Rabatt = 0.90;
    } // end of if-else
    GesamtKosten = KaufPreis + Versand;
    GesamtKosten = GesamtKosten * Rabatt;
    System.out.println("");
    System.out.println("Versand: " + InOut.format2(Versand));
    System.out.println("Gesamtkosten: " + GesamtKosten);
  } // end of main

} // end of class OnlineRabatt



