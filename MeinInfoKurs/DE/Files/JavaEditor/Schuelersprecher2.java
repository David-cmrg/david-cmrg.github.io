public class Schuelersprecher2 {
  
  public static void main(String[] args) {
    String Kandidat1="", Kandidat2="", Kandidat3="";
    int StimmenK1=0, StimmenK2=0, StimmenK3=0, GesamtStimmen=0;
    double Prozent1, Prozent2, Prozent3;
    
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
    Prozent1 = StimmenK1 / GesamtStimmen * 100;
    Prozent2 = StimmenK2 / GesamtStimmen * 100;
    Prozent3 = 100 - Prozent1 - Prozent2;
    
    System.out.println("");
    System.out.println(Kandidat1 + " hat " + StimmenK1 + " Stimmen." + "  (" + InOut.format2(Prozent1) + "%)");
    System.out.println(Kandidat2 + " hat " + StimmenK2 + " Stimmen." + "  (" + InOut.format2(Prozent2) + "%)");
    System.out.println(Kandidat3 + " hat " + StimmenK3 + " Stimmen." + "  (" + InOut.format2(Prozent3) + "%)");
    System.out.println("Es gibt insgesamt " + GesamtStimmen + " Stimmen.");
    
    
  } // end of main
  
} // end of class Schuelersprecher
