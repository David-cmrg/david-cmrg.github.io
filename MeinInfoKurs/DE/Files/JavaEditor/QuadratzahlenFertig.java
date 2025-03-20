public class QuadratzahlenFertig {
  public static void main(String[] args) {
    int a=1,b=1,tmp;
    
    System.out.println(a);
    while (a <= 21) { 
      tmp = b;
      b = a;
      a+=tmp;
      System.out.print(a + " ");
    } // end of while 
  }
}
