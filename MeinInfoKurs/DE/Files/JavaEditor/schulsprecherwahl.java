/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.01.2025
 * @author 
 */

public class schulsprecherwahl {
  
  public static void main(String[] args) {
    String Kandidat1="", Kandidat2="", Kandidat3="";
    long Stimmen1=0, Stimmen2=0, Stimmen3=0;
    double Summe=0, 
    
      Kandidat1 = InOut.readString("Name des ersten Kandidaten: ");
      Kandidat2 = InOut.readString("Name des zweiten Kandidaten: ");
      Kandidat3 = InOut.readString("Name des dritten Kandidaten: ");
      Stimmen1 = InOut.readString("Stimmen von" + Kandidat1 ": ");
      Stimmen2 = InOut.readLong("Stimmen von" + Kandidat2 ": " );
      Stimmen3 = InOut.readLong("Stimmen von" + Kandidat3 ": " );      
    
     Summe = Stimmen1 + Stimmen2 + Stimmen3;
    
  
  } // end of main

} // end of class schulsprecherwahl

