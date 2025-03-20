/**
                    *
                    * Das fertige Java Programm "Millionaer.java"
                    *
                    * @version 1.0 vom 08.03.2024
                    * @MeinInfoKurs.github.io
                    */

            public class MillionaerMeinInfo2 {

                public static void main(String[] args) {
                    double Zinsen, Kapital, StartKapital;
                    double jahre=0;
    
                    // Nutzereingabe
                    System.out.println("Wilkommen beim Millionen-club und dem Rechner zu ihrer Millionen!");
                    StartKapital = InOut.readDouble("Wie viel Kapital besitzen Sie: ") ;
                    Zinsen = InOut.readDouble("Wie viele Zinsen beziehen Sie: ");
    
                    // Berechnung der Zinsen
                    Zinsen = Zinsen/100;
                    Zinsen = Zinsen + 1;
                    Kapital = StartKapital;
    
                    
                    while (Kapital < 1000000) { 
                        Kapital = Kapital * Zinsen; 
                        jahre = jahre + 1; 
                    } // end of while

                    System.out.println("Sie benoetigen bei Kapital von " + StartKapital + "  " + jahre + " Jahre bis sie zu dem Vermoegen von einer Million kommen.");   
    
                } // end of main

            } // end of class Millionaer
