/**
*
* Beschreibung
*
* @version 1.0 vom 04.07.2023
* @David 
*/

public class Bodymassindex {

  public static void main(String[] args) {
    int Gewicht;
    double Groesse, Bodymassindex;

    Groesse= InOut.readDouble("Wie groß sind Sie in Meter: ");
    Gewicht= InOut.readInt("Wie viel wiegen Sie in kg? ");
    Bodymassindex=Gewicht/(Groesse*Groesse);

      if (Bodymassindex>=25) {
        System.out.println("Sie sind Übergewichtig und haben einen BMI von: " + InOut.format2(Bodymassindex));
      }
      if (Bodymassindex<=24.9) {
        System.out.println("Sie sind im Normalbereich des BMI: " + InOut.format2(Bodymassindex));
      } // end of if 
       else {
        System.out.println("Sie sind Untergewichtig und haben einen BMI von: " + InOut.format2(Bodymassindex));
      } // end of if-else 

  } // end of main

} // end of class Bodymassindex
 
