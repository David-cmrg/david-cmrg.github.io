/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 27.01.2025
 * @author 
 */

public class schulsprecher3 {
  
   public static void main(String[] args) {
        while (true) {
            String Kandidat1 = "", Kandidat2 = "", Kandidat3 = "";
            long Stimmen1 = 0, Stimmen2 = 0, Stimmen3 = 0;
            double Summe, Anteil1, Anteil2, Anteil3;
 
            System.out.println();
 
            Kandidat1 = InOut.readString("Name des ersten Kandidaten: ");
            Kandidat2 = InOut.readString("Name des zweiten Kandidaten: ");
            Kandidat3 = InOut.readString("Name des dritten Kandidaten: ");
 
            System.out.println();
 
            Stimmen1 = InOut.readLong("Stimmen von " + Kandidat1 + ":");
            Stimmen2 = InOut.readLong("Stimmen von " + Kandidat2 + ":");
            Stimmen3 = InOut.readLong("Stimmen von " + Kandidat3 + ":");
 
            Summe = Stimmen1 + Stimmen2 + Stimmen3;
 
            Anteil1 = Stimmen1 / Summe * 100;
            Anteil2 = Stimmen2 / Summe * 100;
            Anteil3 = 100 - Anteil1 - Anteil2;
 
            System.out.println();
 
            System.out.println("Anteil aller Stimmen von " + Kandidat1 + ": " + InOut.format2(Anteil1) + "%");
            System.out.println("Anteil aller Stimmen von " + Kandidat2 + ": " + InOut.format2(Anteil2) + "%");
            System.out.println("Anteil aller Stimmen von " + Kandidat3 + ": " + InOut.format2(Anteil3) + "%");
 
            System.out.println();
 
            if (Stimmen1 == Stimmen2 && Stimmen2 == Stimmen3) {
                System.out.println("Da alle Kandidaten den gleichen Stimmanteil haben, müssen Neuwahlen durchgeführt werden.");
                System.out.println("--- Neuwahl beginnt ---");
                continue; 
            }
 
            long[] stimmen = { Stimmen1, Stimmen2, Stimmen3 };
            String[] kandidaten = { Kandidat1, Kandidat2, Kandidat3 };
            int maxIndex = 0;
            for (int i = 1; i < stimmen.length; i++) {
                if (stimmen[i] > stimmen[maxIndex]) {
                    maxIndex = i;
                }
            }
 
            String winner = kandidaten[maxIndex];
            System.out.println("Der Gewinner ist: " + winner + " mit " + stimmen[maxIndex] + " Stimmen.");
 
            
            for (int i = 0; i < stimmen.length; i++) {
                if (i != maxIndex) {
                    double abstand = ((double) (stimmen[maxIndex] - stimmen[i]) / stimmen[maxIndex]) * 100;
                    System.out.println("Abstand von " + kandidaten[i] + " zum Gewinner: " + InOut.format2(abstand) + "%.");
                }
            }
            break; 
        } 
    } 

} // end of class schulsprecher3

