public class Notenprogramm {
  public static void main(String[] args) {
    double EndProzent, Prozent,Punkte, MaxPunkte;
    Punkte=InOut.readDouble("Wie viele Punkte konnten sie in der Klausur erzielen: ");
    MaxPunkte=InOut.readDouble("Was war die maximal zu erreichende Punlteanzahl: ");
    Prozent=Punkte/MaxPunkte;
    EndProzent=Prozent*100;
    
    if (Punkte > MaxPunkte) {
      System.out.println("");
      System.out.println("Ungültige Eingabe!");
      System.out.println("Maximal Punktzahl darf nicht größer als die erreichte Punktzahl sein.");
    } else {
      System.out.println("");
      if (EndProzent >= 95) {
            System.out.println("Sie haben 15 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist sehr gut.");
            System.out.println("Die Leistungen entsprechen den Anforderungen in besonderem Masse.");
        } else if (EndProzent >= 90) {
            System.out.println("Sie haben 14 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist sehr gut.");
            System.out.println("Die Leistungen entsprechen den Anforderungen in besonderem Masse.");
        } else if (EndProzent >= 85) {
            System.out.println("Sie haben 13 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist sehr gut.");
            System.out.println("Die Leistungen entsprechen den Anforderungen in besonderem Masse.");
        } else if (EndProzent >= 80) {
            System.out.println("Sie haben 12 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist gut.");
            System.out.println("Die Leistungen entsprechen den Anforderungen voll.");
        } else if (EndProzent >= 75) {
            System.out.println("Sie haben 11 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist gut.");
            System.out.println("Die Leistungen entsprechen den Anforderungen voll.");
        } else if (EndProzent >= 70) {
            System.out.println("Sie haben 10 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist gut.");
            System.out.println("Die Leistungen entsprechen den Anforderungen voll.");
        } else if (EndProzent >= 65) {
            System.out.println("Sie haben 09 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist befriedigend.");
            System.out.println("Die Leistungen entsprechen den Anforderungen im Allgemeinen.");
        } else if (EndProzent >= 60) {
            System.out.println("Sie haben 08 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist befriedigend.");
            System.out.println("Die Leistungen entsprechen den Anforderungen im Allgemeinen.");
        } else if (EndProzent >= 55) {
            System.out.println("Sie haben 07 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist befriedigend.");
            System.out.println("Die Leistungen entsprechen den Anforderungen im Allgemeinen.");
        } else if (EndProzent >= 50) {
            System.out.println("Sie haben 06 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist ausreichend.");
            System.out.println("Die Leistungen weisen zwar Maengel auf, entsprechen aber im Ganzen noch den Anforderungen.");
        } else if (EndProzent >= 45) {
            System.out.println("Sie haben 05 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist ausreichend.");
            System.out.println("Die Leistungen weisen zwar Maengel auf, entsprechen aber im Ganzen noch den Anforderungen.");
        } else if (EndProzent >= 40) {
            System.out.println("Sie haben 04 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist ausreichend.");
            System.out.println("Die Leistungen weisen Maengel auf und entsprechen den Anforderungen nur noch mit Einschraenkungen.");
        } else if (EndProzent >= 33) {
            System.out.println("Sie haben 03 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist mangelhaft.");
            System.out.println("Die Leistungen entsprechen den Anforderungen nicht, lassen jedoch erkennen, dass die notwendigen Grundkenntnisse vorhanden sind.");
        } else if (EndProzent >= 27) {
            System.out.println("Sie haben 02 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist mangelhaft.");
            System.out.println("Die Leistungen entsprechen den Anforderungen nicht, lassen jedoch erkennen, dass die notwendigen Grundkenntnisse vorhanden sind.");
        } else if (EndProzent >= 20) {
            System.out.println("Sie haben 01 Punkt erreicht und " + EndProzent + "% erreicht. Ihre Note ist mangelhaft.");
            System.out.println("Die Leistungen entsprechen den Anforderungen nicht, lassen jedoch erkennen, dass die notwendigen Grundkenntnisse vorhanden sind.");
        } else {
            System.out.println("Sie haben 00 Punkte erreicht und " + EndProzent + "% erreicht. Ihre Note ist ungenuegend.");
            System.out.println("Die Leistungen entsprechen den Anforderungen nicht und selbst die Grundkenntnisse sind so lueckenhaft, dass die Maengel nicht behoben werden koennen.");
        } 
      } // end of if-else
  } // end of main
 
} // end of class Notenprogramm
