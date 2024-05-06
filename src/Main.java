import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola muchachos!");
        // System.out.println("Pelicula Interestelar");

        int fechaDeLanzamiento = 2014;
        double evaluacion = 9.9;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Interestelar";
        String sinopsis = """
                Una pelicula que no te puedes perder si te apasiona el espacio
                """;
        double mediaEvaluacionUsario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Clasificacion: " + evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (8.1 + 9.0 + 5 + 9.9 + 6.6 + 7 + 8 + 8.8 + 9) / 10;
        System.out.println("Clasificacion promedio de los espectadores: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula popular del momento");
        } else {
            System.out.println("Pelicula de astronomia que vale la pena ver");
        }

        for (int i = 0; i < 10; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la nota que le darias a interestelar");
            double notaInterestelar = teclado.nextDouble();
            mediaEvaluacionUsario = mediaEvaluacionUsario + notaInterestelar;
        }
        System.out.println("La media de la pelicula interestelar" +
                " calculada por el usario es: " + mediaEvaluacionUsario / 10);
    }
}