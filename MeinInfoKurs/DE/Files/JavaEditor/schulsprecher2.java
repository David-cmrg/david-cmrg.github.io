/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.01.2025
 * @author 
 */

public class schulsprecher {
    public static void main(String[] args) {
        String Kandidat1, Kandidat2, Kandidat3;
        int StimmenK1, StimmenK2, StimmenK3;
        double Anteil1, Anteil2, Anteil3, GesamtStimmen;    

        Kandidat1 = System.out.print("Wie heisst der erste Kandidat?: ");
     
        Kandidat2 = System.out.print("Wie heisst der zweite Kandidat?: ");
        
        Kandidat3 = System.out.print("Wie heisst der dritte Kandidat?: ");
        
        System.out.println("");
        System.out.println("Der erste Kandidat ist also: " + Kandidat1);
        System.out.println("Der zweite Kandidat ist also: " + Kandidat2);
        System.out.println("Der dritte Kandidat ist also: " + Kandidat3);

        StimmenK1 = readInt("Wie viele Stimmen hat " + Kandidat1 + "?  ", scanner);
        StimmenK2 = readInt("Wie viele Stimmen hat " + Kandidat2 + "?  ", scanner);
        StimmenK3 = readInt("Wie viele Stimmen hat " + Kandidat3 + "?  ", scanner);
        GesamtStimmen = StimmenK1 + StimmenK2 + StimmenK3;                                             
 
   
        Anteil1 = (double) StimmenK1 / GesamtStimmen * 100;
        Anteil2 = (double) StimmenK2 / GesamtStimmen * 100;
        Anteil3 = (double) StimmenK3 / GesamtStimmen * 100; 
      
        double[] stimmen = {StimmenK1, StimmenK2, StimmenK3};
  
        System.out.println("");
        System.out.println(Kandidat1 + " hat " + StimmenK1 + " Stimmen." + "  (" + String.format("%.2f", Anteil1) + "%)");
        System.out.println(Kandidat2 + " hat " + StimmenK2 + " Stimmen." + "  (" + String.format("%.2f", Anteil2) + "%)");
        System.out.println(Kandidat3 + " hat " + StimmenK3 + " Stimmen." + "  (" + String.format("%.2f", Anteil3) + "%)");
        System.out.println("Es gibt insgesamt " + GesamtStimmen + " Stimmen.");

        double max = stimmen[0];
        String winner = Kandidat1;
 
        for (int i = 1; i < stimmen.length; i++) {
            if (stimmen[i] > max) {
                max = stimmen[i];
                if (i == 1) {
                    winner = Kandidat2;
                } else {
                    winner = Kandidat3;
                }
            }
        }
        System.out.println("Der Gewinner ist: " + winner + " mit " + max + " Stimmen.");
    } // end of main
 
} // end of class schulsprecher
 

