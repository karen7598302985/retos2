import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas que deseea evaluar: ");
        int cantnotas=leer.nextInt();

        double sumNotas = 0;
        double[] notas = new double[cantnotas];
        

        for (int i = 0; i < cantnotas; i++) {
            System.out.printf("Ingrese la nota: ", i + 1);
            notas[i] = leer.nextDouble();
            sumNotas += notas[i];
        }

        double promedio = sumNotas / cantnotas;
        System.out.printf("El promedio de las notas es:", + promedio);

        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio <= 4.0) {
            System.out.println("Pasaste raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
        leer.close();
    }
}
