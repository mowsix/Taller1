import java.util.Scanner;

public class Taller1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de Personas: ");
        int cantidadPersonas = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la Cantidad de Agentes: ");
        int cantidadAgentes = Integer.parseInt(scanner.nextLine());
        Fila filaLlena = new Fila(cantidadPersonas,cantidadAgentes);
        System.out.println(filaLlena.getFila());
        System.out.println(filaLlena.getAgentes());





        /*StdOut.print("Por favor, ingresa tu edad: ");
        int cantidadPersonas = StdIn.readInt();
        Fila filaLlena = new Fila().llenarFila(cantidadPersonas);
        StdOut.print(filaLlena);
        System.out.println(filaLlena);*/

    }
}