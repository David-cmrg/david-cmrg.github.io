public class BodyMassIndex {
  public static void main(String[] args) {
    int Alter, Monate, Groesse;
    double Gewicht;
    boolean junge;
    
    Alter = InOut.readInt("Wie alt bist du? ");
    if (Alter > 135) {
      while (Alter > 135) { 
        System.out.println("Invalides Alter!");
        Alter = InOut.readInt("Wie alt bist du wirklich? ");
      } // end of while
    } // end of if
    Monate = InOut.readInt("Wie viele Monate lang bist du schon " + Alter + "? ");
    if (Monate > 11) {
      while (Monate > 11) { 
        System.out.println("Invalide Monat Anzahl!!");
        Monate = InOut.readInt("Wie viele Monate lang bist du schon " + Alter + "? ");
      } // end of while
    } // end of if
    Gewicht = InOut.readDouble("Was ist dein Gewicht in kg? ");
    
  } // end of main

} // end of class BodyMassIndex

