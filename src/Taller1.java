import java.util.Arrays;
import java.util.Scanner;

public class Taller1 {
    /*=====TALLER 1=======
    SANTIAGO GALLEGO HENAO
    SEBASTIAN FORERO DUQUE
    SEBASTIAN VILLA VARGAS
     */

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de Personas: ");
        int cantidadPersonas = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la Cantidad de Agentes: ");
        int cantidadAgentes = Integer.parseInt(scanner.nextLine());*/




        /*Fila filaLlena = new Fila(cantidadPersonas,cantidadAgentes);
        System.out.println(Arrays.toString(Fila.getFilaPersonasOrdenadas()));
        System.out.println(Fila.getAgentes());
        SimuladorFilas simulador = new SimuladorFilas(cantidadAgentes,filaLlena.getFilaPersonas(),28800);*/



        //Persona[] personas = { new Persona(2, 0, 5), new Persona(4, 1, 3) };

        //Fila filallena = new Fila();
        //Persona[] personas = filallena.llenarFila(cantidadPersonas);

        /*Persona[] personas = { new Persona(2, 0, 5), new Persona(4, 1, 3) };
        System.out.println(Arrays.toString(personas));
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        System.out.println(Fila.getAgentes());
        sim.correrSimulacion();
        System.out.println("Dato esperado: "+sim.getPromedioOcupacion());
        System.out.println("Dato Obtenido: "+sim.getPromedioEspera());*/

        Persona[] personas = {
                new Persona(0, 0, 2),
                new Persona(0, 1, 2),
                new Persona(0, 2, 2)
        };
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