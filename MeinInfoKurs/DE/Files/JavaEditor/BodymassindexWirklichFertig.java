/**
*
* Beschreibung
*
* @version 1.0 vom 20.02.2025
* @David 
*/

public class BodymassindexWirklichFertig {

  public static void main(String[] args) {
    int Gewicht;
    double Groesse, Bodymassindex;
    
    Groesse= InOut.readDouble("Wie groß sind Sie in Meter? ");
    Gewicht= InOut.readInt("Wie viel wiegen Sie in Kg? ");
    Bodymassindex=Gewicht/(Groesse*Groesse);

      if (Bodymassindex>=25) {
        System.out.println("Sie sind Übergewichtig und haben einen BMI von: " + InOut.format2(Bodymassindex));
      }
      if (Bodymassindex<=24.9) {
        System.out.println("Sie sind im Normalbereich des BMI: " + InOut.format2(Bodymassindex));
      } // end of if 
      if (Bodymassindex<=18.5) {
      System.out.println("Sie sind Untergewichtig und haben einen BMI von: " + InOut.format2(Bodymassindex));  
      } // end of if
  } // end of main

} // end of class BodymassindexWirklichFertig
 
