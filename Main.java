import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

       System.out.println("Nombre completo: ");
       String nombreCompleto = scanner.nextLine();  

       char inicialNombre = nombreCompleto.charAt (0);

       System.out.println("Edad: ");
       byte edad = scanner.nextByte();

       System.out.println("Número de departamento: ");
       short numeroDepartamento = scanner.nextShort();

       System.out.println("Número de torre: ");
       int numeroTorre = scanner.nextInt();
       
       System.out.println("Número de celular: ");
       long numeroCelular = scanner.nextLong();

       System.out.println("Temperatura (Responda con coma en vez de punto): ");
       float temperatura = scanner.nextFloat();

       System.out.println("Altura (Responda con coma en vez de punto): ");
       double altura = scanner.nextDouble();

       System.out.println("Es visitante (Responda con true/false): ");
       boolean esVisitante = scanner.nextBoolean();

       List<String> semana = new ArrayList<>();
       semana.add("Lunes");
       semana.add("Martes");
       semana.add("Miércoles");
       semana.add("Jueves");
       semana.add("Viernes");
       semana.add("Sábado");
       semana.add("Domingo");

       int totalVisitas = 0;
       double totalHoras = 0.0;

       System.out.println("Registro de Visitas: ");
       for (String dia : semana) {
            System.out.println(" Cuantas visitas hizo " + dia + ": ");
            int visitasDia = scanner.nextInt();

            for (int i = 1; i <= visitasDia; i++) {
                System.out.println("Cuantas horas estuvo en la visita " + i + "(en horas): ");
                double horasVisita = scanner.nextDouble();
                totalHoras += horasVisita;
            }
            totalVisitas += visitasDia;
           
         }
        double promedioHoras = totalVisitas > 0 ? totalHoras / totalVisitas : 0;
        String tipoEdad = edad < 18 ? "Menor de edad" : "Mayor de edad";

        System.out.println("**** DATOS DEL VISITANTE ****");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Inicial del Nombre: " + inicialNombre);
        System.out.println("Edad: " + edad + " (" + tipoEdad + ")");
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("Número de torre: " + numeroTorre);
        System.out.println("Número de celular: " + numeroCelular);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Es visitante: " + esVisitante );
        System.out.println("Total de visitas en semana: " + totalVisitas);
        System.out.println("Promedio de horas por visita: " + promedioHoras + " horas");
        System.out.println("**** FIN DEL REGISTRO ****");
        System.out.println("**** GRACIAS POR SU VISITA ****");

        scanner.close();
   }
   
}