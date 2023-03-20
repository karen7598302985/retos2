import java.util.Scanner;

public class reto4 {
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int[] numeros = new int[10];
      int dosContador = 0;
      
      System.out.println("Ingrese 10 números:");
      
      for (int i = 0; i < numeros.length; i++) {
         numeros[i] = leer.nextInt();
         
         if (numeros[i] == 2) {
            dosContador++;
         }
      }
      
      System.out.println("Se ingresaron " + dosContador + " números iguales a 2.");
      leer.close();
   }
}