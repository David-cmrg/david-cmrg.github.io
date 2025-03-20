



public class Parkscheinautomat2Fertig {
  public static void main(String[] args) {
    int Stunden;
    double Geldbetrag, Parkgebühr, Zahlbetrag, Wechselgeld;
  
    Stunden = InOut.readInt("Parkzeit in Stunden: ");
    Geldbetrag = InOut.readDouble("Eingeworfener Geldbetrag in Euro: ");  
    
    Parkgebühr = Stunden * 0.5;
    System.out.println("Betrag zu Zahlen: " + Parkgebühr);
    if (Parkgebühr > 5) {
      Parkgebühr = 5;
    } 
    if (Geldbetrag < Parkgebühr) {
      Zahlbetrag = Parkgebühr - Geldbetrag;
      System.out.println("Noch zu Zahlen: " + Zahlbetrag);
    }else {
       if (Geldbetrag > Parkgebühr) {
        Wechselgeld = Geldbetrag - Parkgebühr;
        System.out.println("Wechselgeld: " + Wechselgeld);
        System.out.println("Parkgebühr bezahlt! :)" );
       } // end of if
     } // end of if-else

  
  }
}
