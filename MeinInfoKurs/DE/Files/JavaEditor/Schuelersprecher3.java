public class Schuelersprecher3 {
  
  public static void main(String[] args) {
    String Kandidat1="", Kandidat2="", Kandidat3="";
    int StimmenK1=0, StimmenK2=0, StimmenK3=0;
    double Anteil1, Anteil2, Anteil3, GesamtStimmen;    
    String [] stimmen = {1,2,3};
    
    Kandidat1 = InOut.readString("Wie heisst der erste Kandidat?: ");
    Kandidat2 = InOut.readString("Wie heisst der zweite Kandidat?: ");
    Kandidat3 = InOut.readString("Wie heisst der dritte Kandidat?: ");
    
    System.out.println("");
    System.out.println("Der erste Kandidat ist also: " + Kandidat1);
    System.out.println("Der zweite Kandidat ist also: " + Kandidat2);
    System.out.println("Der dritte Kandidat ist also: " + Kandidat3);
    
    System.out.println("");
    StimmenK1 = InOut.readInt("Wie viele Stimmen hat " + Kandidat1 + "?  ");
    StimmenK2 = InOut.readInt("Wie viele Stimmen hat " + Kandidat2 + "?  ");
    StimmenK3 = InOut.readInt("Wie viele Stimmen hat " + Kandidat3 + "?  ");
    
    GesamtStimmen = StimmenK1 + StimmenK2 + StimmenK3;                                             

        
    Anteil1 = (int) StimmenK1 / GesamtStimmen * 100;
    Anteil2 = (int) StimmenK2 / GesamtStimmen * 100;
    Anteil3 = 100 - Anteil1 - Anteil2;
    
    stimmen[0] = StimmenK1;
    stimmen[1] = StimmenK2;
    stimmen[2] = StimmenK3;
    
    System.out.println("");
    System.out.println(Kandidat1 + " hat " + StimmenK1 + " Stimmen." + "  (" + InOut.format2(Anteil1) + "%)");
    System.out.println(Kandidat2 + " hat " + StimmenK2 + " Stimmen." + "  (" + InOut.format2(Anteil2) + "%)");
    System.out.println(Kandidat3 + " hat " + StimmenK3 + " Stimmen." + "  (" + InOut.format2(Anteil3) + "%)");
    System.out.println("Es gibt insgesamt " + GesamtStimmen + " Stimmen.");
    
    
    for (int i = 0; i < stimmen.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
    System.out.println(max);
  } // end of main
  
} // end of class Schuelersprecher3
