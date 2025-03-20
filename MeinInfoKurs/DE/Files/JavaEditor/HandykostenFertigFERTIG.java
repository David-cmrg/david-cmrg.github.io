public class HandykostenFertigFERTIG {
  
  
  public static void main(String[] args) {
    String Name;
    int AnzahlSMS, AnzahlMMS;
    double PreisSMS=0, Rabatt=0, PreisMMS=0, KostenSMS=0, KostenMMS=0, KostenGesamt=0, Flatrate=0, GesamtMitRabatt=0, GesamtMitFlat=0;
    boolean Jugendlicher;
    System.out.println("Der Gameboy Handykalkulator");
    System.out.println("");
    System.out.println("Hallo!");
  
    Name = InOut.readString("Wie lautet dein Name? ");
    PreisSMS = InOut.readDouble("Gib den Preis pro SMS in Euro ein: ");
    AnzahlSMS = InOut.readInt("Gib die Anzahl der SMS ein: ");
    PreisMMS = InOut.readDouble("Gib den Preis der MMS ein: ");
    AnzahlMMS = InOut.readInt("Gib die Anzahl der MMS ein: ");
    Rabatt = InOut.readDouble("Gib den Rabatt für Jugendliche in % ein: ");
    Flatrate = InOut.readDouble("Gib die Kosten für die Flatrate ein: ");
    Jugendlicher = InOut.readBoolean("Bist du ein Jugendlicher (j/n)? ");
  
    Rabatt = 1 - (Rabatt/100);
    KostenSMS = AnzahlSMS * PreisSMS;
    KostenMMS = AnzahlMMS * PreisMMS;
    KostenGesamt = KostenSMS + KostenMMS;
    GesamtMitRabatt = KostenGesamt * 0.8 ; 
    GesamtMitFlat = 10 - 2.08;
    Flatrate = 10 - 0.10;
  
    // InOut.format2(*Variable*) rundet die Zahl auf 2 Nachkommastellen
    
    System.out.println("");
    System.out.println(Name + ", deine Kalkulationen lauten:");
    System.out.println("");
    System.out.println(Name + "´s, SMS und MMS Kosten:");                               
    System.out.println("Kosten für die " + AnzahlSMS + " SMS: " + InOut.format2(KostenSMS) + " Euro");
    System.out.println("Kosten für die " + AnzahlMMS + " MMS: " + InOut.format2(KostenMMS) + " Euro");
    System.out.println("Die Gesamtkosten betragen: " + InOut.format2(KostenGesamt) + " Euro");
    System.out.println("Gesamtkosten mit Flat: " + InOut.format2(Flatrate) + " Euro" );
    System.out.println("");
    System.out.println("Gesamtkosten mit Rabatt als Jugendlicher: " + InOut.format2(GesamtMitRabatt) + " Euro");
    System.out.println("Gesamtkosten mit Flat als Jugendlicher: " + InOut.format2(GesamtMitFlat) + " Euro" );
    System.out.println("");
    System.out.println("Du bist ein Jugendlicher: " + Jugendlicher);
  }
}
