/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 06.03.2025
 * @author 
 */

public class Millionaer {
  
  public static void main(String[] args) {
    double Zinsen, Kapital, StartKapital;
    double jahre=0;
    
    // Nutzereingabe
    System.out.println("Wilkommen beim Millionen-club und dem Rechner zu ihrer Millionen!");
    StartKapital = InOut.readDouble("Wie viel Kapital besitzen Sie: ") ;
    Zinsen =InOut.readDouble("Wie viele Zinsen beziehen Sie: ");
    
    // Berechnung der Zinsen
    Zinsen= Zinsen/100;
    Zinsen= Zinsen + 1;
    Kapital=StartKapital;
    
    
       while (Kapital<1000000) { 
                 Kapital= Kapital*Zinsen; 
                 jahre= jahre + 1; 
       } // end of while
    System.out.println("Sie benoetigen bei Kapital von " + StartKapital +"  " + jahre + " Jahre bis sie zu dem Vermoegen von einer Million kommen. ");   
    
  } // end of main

} // end of class clubdermillionen2

