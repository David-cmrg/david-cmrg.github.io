public class TrefferInBearbeitung {
  
  public static void main(String[] args) {
    int Note=InOut.readInt("Geben Sie die geworfene Zahl (1-20) ein: ");
    String Ausgabe="Sie haben einen ";
    switch (Note) {
      case  1:
      case  2: 
        Ausgabe=Ausgabe+"außerordentlichen";
        break;
      case  3:
      case  4:
      case  5:
      case  6:
      case  7:
      case  8: 
        Ausgabe=Ausgabe+"guten";
        break;
      case  9:
      case  10:
      case  11:
      case  12:
      case  13: 
        Ausgabe=Ausgabe+"normalen";
        break;
      case  14:
      case  15: 
        Ausgabe=Ausgabe+"schlechten";
        break;
      case  16:
      case  17: 
      case  18: 
      case  19: 
      case  20:  
        Ausgabe=Ausgabe+"kein";
        break;
      default:Ausgabe="Ungültige Eingabe!";    
    } // end of switch 
    Ausgabe=Ausgabe+" Treffer gelandet."; 
    System.out.println(Ausgabe);
  } // end of main

} // end of class TrefferInBearbeitung

