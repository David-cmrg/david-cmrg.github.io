/**
                *
                * Das fertige Java Programm der Bahnreise
                *
                * @version 1.0 vom 25.02.2024
                * @MeinInfoKurs.github.io
                */
    
                public class BahnreiseMeinInfo {
    
                                public static void main(String[] args) {
                                                int PersonenAnzahl;
                                                double Normalpreis, Maximalpreis, GruppenPreis, PersonenEndPreis, Rabatt;
    
                                                PersonenAnzahl = InOut.readInt("Anzahl der reisenden Personen: ");
                                                Normalpreis = InOut.readDouble("Betrag des Normalpreises: ");

                                                Maximalpreis=36.60;
                                                Rabatt = 0.70;
                                                GruppenPreis=Normalpreis*PersonenAnzahl;

                                                if (PersonenAnzahl >= 6) {
                                                                GruppenPreis= GruppenPreis*Rabatt;
                                                };
                
                                                PersonenEndPreis=GruppenPreis/PersonenAnzahl;
                
                                                if (PersonenEndPreis > Maximalpreis) {
                                                                PersonenEndPreis=Maximalpreis;
                                                                GruppenPreis=PersonenEndPreis*PersonenAnzahl;
                                                };

                                                System.out.println("Preis pro Einzelperson: " + PersonenEndPreis);
                                                System.out.println("Gesamtpreis der Gruppe: " + GruppenPreis);
                                }
                }
