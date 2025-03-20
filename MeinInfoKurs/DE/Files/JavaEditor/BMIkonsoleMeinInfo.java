/**
                *
                * Das fertige Java Programm "BMIkonsole.java"
                *
                * @version 1.0 vom 25.02.2024
                * @David
                */
    
                public class BMIkonsoleMeinInfo {
  
                    public static void main(String[] args) {
                        int Gewicht;
                        double  Groesse, Bodymassindex;
                      
                        Groesse= InOut.readDouble("Wie groß sind sie in Meter: ");
                        Gewicht= InOut.readInt("Wie viel wiegen sie in Kilogramm: ");

                        Bodymassindex=Gewicht/(Groesse*Groesse);
                    
                        if (Bodymassindex>=25) {
                            System.out.println("Sie sind Übergewichtig und haben einen BMI von: " + InOut.format2(Bodymassindex));
                          }
                        if (Bodymassindex<=18.4) {
                            System.out.println("Sie sind Untergewichtig und haben ein BMI von: " + InOut.format2(Bodymassindex));
                          } // end of if 
                          else {
                            System.out.println("Sie sind im Normalbereich und haben einen BMI von: " + InOut.format2(Bodymassindex));
                          } // end of if-else                     
                    } // end of main
                  } // end of class BMIkonsole
