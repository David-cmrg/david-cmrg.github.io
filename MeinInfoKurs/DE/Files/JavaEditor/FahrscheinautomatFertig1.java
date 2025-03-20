public class FahrscheinautomatFertig1 {
  public static void main(String[] args) {
    double Fahrscheinpreis, Gezahlt, Wechselgeld;
    Fahrscheinpreis = InOut.readDouble("Fahrscheinpreis: ");
    Gezahlt   = InOut.readDouble("Gezahlt: ");
    while (Gezahlt < Fahrscheinpreis) {
      double ZuZahlen = Fahrscheinpreis - Gezahlt;
      System.out.println("Noch " + ZuZahlen + " zu zahlen!");
      Gezahlt = Gezahlt + InOut.readDouble("Zahle: ");
    } // end of while
    Wechselgeld = Gezahlt - Fahrscheinpreis;
    if (Wechselgeld > 0) {
      System.out.println("Wechselgeld " + InOut.format2(Wechselgeld));
      System.out.print("Rückgabe: ");
      while (Wechselgeld >= 2) {
        System.out.print("2 Euro ");
        Wechselgeld = Wechselgeld - 2;
      } // end of while
      if (Wechselgeld >= 1) {
        System.out.print("1 Euro ");
        Wechselgeld = Wechselgeld - 1;
      } // end of if
      if (Wechselgeld >= 0.50) { 
        System.out.print("50 Cent ");
        Wechselgeld = Wechselgeld - 0.50;
      } // end of while
      if (Wechselgeld >= 0.20) {
        System.out.print("20 Cent ");
        Wechselgeld = Wechselgeld - 0.20;
      } // end of if
      if (Wechselgeld >= 0.10) {
        System.out.println("10 Cent ");
        Wechselgeld = Wechselgeld - 0.10;
      } // end of if
      if (Wechselgeld >= 0.05) {
        System.out.print("5 Cent ");
        Wechselgeld = Wechselgeld - 0.05;
      } // end of if
      while (Wechselgeld >= 0.01) {
        System.out.print("2 Cent ");
        Wechselgeld = Wechselgeld - 0.02;
      } // end of if
      if (Wechselgeld >= 0.0) { 
        System.out.println("1 Cent");
        Wechselgeld = Wechselgeld - 0.01;   
      } // end of if
      }else {
      System.out.println("Passend bezahlt :)");
    }
    } // end of if-else
  } // end of main // end of class FahrscheinautomatFertig1

               
