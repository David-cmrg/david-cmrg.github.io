/**
                *
                * Das fertige Java Programm des "ParkscheinAutomat.java"
                *
                * @version 1.0 vom 26.02.2024
                * @David
                */
    
                public class ParkscheinAutomatMeinInfo {
    
                                public static void main(String[] args) {
                                                int Stunden;
                                                double Geldbetrag, Parkgeb�hr, Zahlbetrag, Wechselgeld;
    
                                                Stunden = InOut.readInt("Parkzeit in Stunden: ");
                                                Geldbetrag = InOut.readDouble("Eingeworfener Geldbetrag in Euro: ");  

                                                Parkgeb�hr = Stunden * 0.5;
                                                System.out.println("Betrag zu Zahlen: " + Parkgeb�hr);
                                                if (Parkgeb�hr > 5) {
                                                    Parkgeb�hr = 5;
                                                } 
                                                if (Geldbetrag < Parkgeb�hr) {
                                                    Zahlbetrag = Parkgeb�hr - Geldbetrag;
                                                    System.out.println("Noch zu Zahlen: " + Zahlbetrag);
                                                }else {
                                                    if (Geldbetrag > Parkgeb�hr) {
                                                        Wechselgeld = Geldbetrag - Parkgeb�hr;
                                                        System.out.println("Wechselgeld: " + Wechselgeld);
                                                    } // end of if
                                                    System.out.println("Parkgeb�hr bezahlt!");
                                                } // end of if-else
                                    } // end of main
                } // end of class ParkscheinAutomatMeinInfo
