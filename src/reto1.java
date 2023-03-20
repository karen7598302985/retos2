import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de competidores: ");
        
        int canticompetidores = leer.nextInt();
        String[] nombres = new String[canticompetidores];
        double[] tiempos = new double[canticompetidores];
        int indiGanador = 0;
        double tiempoGanador = tiempos[0];


        for (int i = 0; i < canticompetidores; i++) {
            System.out.printf("Ingrese el nombre del competidor: ", i + 1);
            nombres[i] = leer.next();

            System.out.printf("Ingrese el tiempo del competidor: ", i + 1);
            tiempos[i] = leer.nextDouble();
        }

        System.out.println("Resultados:");

        for (int i = 0; i < canticompetidores; i++) {
            System.out.printf("2f segundos\n", nombres[i], tiempos[i]);
        }
        for (int i = 1; i < canticompetidores; i++) {
            if (tiempos[i] < tiempoGanador) {
                tiempoGanador = tiempos[i];
                indiGanador = i;
            }
        }

        System.out.printf("El ganador es %s con un tiempo de 2f segundos.", nombres[indiGanador], tiempoGanador);
        
        leer.close();

    }
}
