import java.util.Scanner;

public class reto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        String[][] productos = new String[5][2];
        
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese el nombre del producto:  " + i + ": ");
            String nombre = leer.nextLine();
            System.out.print("Ingrese el precio del producto:  " + i + ": ");
            String precio = leer.nextLine();
            productos[i][0] = nombre;
            productos[i][1] = precio;
        }
        
        System.out.println("Catálogo de productos:");
        System.out.println("Código\tNombre\tPrecio");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(i + "\t" + productos[i][0] + "\t" + productos[i][1]);
        }
        
        leer.close();
    }

}