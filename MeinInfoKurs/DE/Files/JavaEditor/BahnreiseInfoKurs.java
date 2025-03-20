                public class BahnreiseInfoKurs {
    
                                public static void main(String[] args) {
                                                int PersonenAnzahl;
                                                double Normalpreis, Maximalpreis, Gruppenpreis, PersonenEndPreis, Rabatt;
    
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
