public class Wahlauswetrtung {
  
  public static void main(String[] args) {
    int Stimmen1=38937, Stimmen2=24842, Stimmen3=33324;
    double Summe, Anteil1, Anteil2, Anteil3;
    
    Stimmen1 = InOut.readInt("Stimmen Billy Makes: ");
    Stimmen2 = InOut.readInt("Stimmen Mark Tuckerberg: ");
    Stimmen3 = InOut.readInt("Stimmen Larry Rage: ");
  
    Summe = Stimmen1 + Stimmen2 + Stimmen3;
    Anteil1 = Stimmen1 / Summe * 100;
    Anteil2 = Stimmen2 / Summe * 100;
    Anteil3 = 100 - Anteil1 - Anteil2;
    
    System.out.println("Anteil Billy Makes: " + InOut.format2(Anteil1) + " %");
    System.out.println("Anteil Mark Tuckerberg: " + InOut.format2(Anteil2) + " %");
    System.out.println("Anteil Larry Rage: " + InOut.format2(Anteil3) + " %");
  
  } // end of main :)
  
} // end of class Wahlauswertung :)
