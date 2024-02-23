import java.util.Arrays;
import java.util.Scanner;

public class Taller1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de Personas: ");
        int cantidadPersonas = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la Cantidad de Agentes: ");
        int cantidadAgentes = Integer.parseInt(scanner.nextLine());




        /*Fila filaLlena = new Fila(cantidadPersonas,cantidadAgentes);
        System.out.println(Arrays.toString(Fila.getFilaPersonasOrdenadas()));
        System.out.println(Fila.getAgentes());
        SimuladorFilas simulador = new SimuladorFilas(cantidadAgentes,filaLlena.getFilaPersonas(),28800);*/



        //Persona[] personas = { new Persona(2, 0, 5), new Persona(4, 1, 3) };

        Fila filallena = new Fila(cantidadPersonas,cantidadAgentes);
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        sim.correrSimulacion();
        System.out.println("Dato esperado: "+sim.getPromedioOcupacion());
        System.out.println("Dato Obtenido: "+sim.getPromedioEspera());




        /*StdOut.print("Por favor, ingresa tu edad: ");
        int cantidadPersonas = StdIn.readInt();
        Fila filaLlena = new Fila().llenarFila(cantidadPersonas);
        StdOut.print(filaLlena);
        System.out.println(filaLlena);*/

    }
}