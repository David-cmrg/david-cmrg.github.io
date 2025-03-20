/**
                *
                * Das fertige Java Programm der SchulsprecherWahl
                *
                * @version 1.0 vom 25.02.2024
                * @David
                */
    
                public class SchulsprecherwahlMeinInfo {
    
                                public static void main(String[] args) {
                                    String Kandidat1="", Kandidat2="", Kandidat3="", Platz1="", Platz2="", Platz3="";
                                    int Stimmen1=0, Stimmen2=0, Stimmen3=0, Summe=0, StimmenPlatz1=0, StimmenPlatz2=0, StimmenPlatz3=0;
                                    double Anteil1, Anteil2, Anteil3;
                                    
                                    /* Eingabe von Werten */
                                    Kandidat1 = InOut.readString("Name des ersten Kandidaten: ");
                                    Kandidat2 = InOut.readString("Name des zweiten Kandidaten: ");
                                    Kandidat3 = InOut.readString("Name des dritten Kandidaten: ");
                                    System.out.println("");
                                    Stimmen1 = InOut.readInt("Stimmen von " + Kandidat1 + ":");
                                    Stimmen2 = InOut.readInt("Stimmen von " + Kandidat2 + ":");
                                    Stimmen3 = InOut.readInt("Stimmen von " + Kandidat3 + ":");
                
                                    /* Bestimmung der Prozente */
                                    Summe = Stimmen1 + Stimmen2 + Stimmen3;
                
                                    Anteil1 = Stimmen1 / Summe * 100;
                                    Anteil2 = Stimmen2 / Summe * 100;
                                    Anteil3 = 100 - Anteil1 - Anteil2;
                    
                
                
                
                                    /* Bestimmung des ersten Platzes durch else-if */
                                    if (Stimmen1 > Stimmen2 && Stimmen1 > Stimmen3) {
                                        Platz1=Kandidat1;
                                        StimmenPlatz1 = Stimmen1;
                                        
                                        /* Bestimmung des zweiten und dritten Platzes durch if-else */
                                        if (Stimmen2 > Stimmen3) {
                                            Platz2=Kandidat2;
                                            StimmenPlatz2 = Stimmen2;
                                            Platz3=Kandidat3;
                                            StimmenPlatz3 = Stimmen3;
                                        } else {
                                            Platz2=Kandidat3;
                                            StimmenPlatz2 = Stimmen3;
                                            Platz3=Kandidat2;
                                            StimmenPlatz3 = Stimmen2;
                                        };
                                    } else if (Stimmen2 > Stimmen1 && Stimmen2 > Stimmen3) {
                                        Platz1=Kandidat2;
                                        StimmenPlatz1 = Stimmen2;
                
                                        if (Stimmen1 > Stimmen3) {
                                            Platz2=Kandidat1;
                                            StimmenPlatz2 = Stimmen1;
                                            Platz3=Kandidat3;
                                            StimmenPlatz3 = Stimmen3;
                                        } else {
                                            Platz2=Kandidat3;
                                            StimmenPlatz2 = Stimmen3;
                                            Platz3=Kandidat1;
                                            StimmenPlatz3 = Stimmen1;
                                        };
                                    } else if (Stimmen3 > Stimmen2 && Stimmen3 > Stimmen1) {
                                        Platz1=Kandidat3;
                                        StimmenPlatz1 = Stimmen3;
                
                                        if (Stimmen1 > Stimmen2) {
                                            Platz2=Kandidat1;
                                            StimmenPlatz2 = Stimmen1;
                                            Platz3=Kandidat2;
                                            StimmenPlatz3 = Stimmen2;
                                        } else {
                                            Platz2=Kandidat2;
                                            StimmenPlatz2 = Stimmen2;
                                            Platz3=Kandidat1;
                                            StimmenPlatz3 = Stimmen1;
                                        };
                                    }
                                    
                                    /* Abstand zwischen erst-, zweit-, und drittplatziertem Kandidaten | Berechnung der prozentualen Abstaende */
                                    double abstandZweitgroesste = ((double) (StimmenPlatz1 - StimmenPlatz2) / StimmenPlatz1) * 100;
                                    double abstandDrittgroesste = ((double) (StimmenPlatz1 - StimmenPlatz3) / StimmenPlatz1) * 100;
                
                                    
                                    /* Ausgabe unserer Berechnungen */
                                    System.out.println("Erstplatzierter wurde: " + Platz1);
                                    System.out.println("Er gewann mit " + StimmenPlatz1 + " Stimmen");
                                    System.out.println("");
                                    System.out.println("Die zweitgroesste Zahl ist: " + StimmenPlatz2 + " (Abstand: " + abstandZweitgroesste + "%)");
                                    System.out.println("Die drittgroesste Zahl ist: " + StimmenPlatz3 + " (Abstand: " + abstandDrittgroesste + "%)");
                                    System.out.println("Bis zur naechsten Schulsprecherwahl!");      
                                }
                            }
