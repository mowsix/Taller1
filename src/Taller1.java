import java.util.Arrays;
import java.util.Scanner;

public class Taller1 {
    /*=====TALLER 1=======
    SANTIAGO GALLEGO HENAO
    SEBASTIAN FORERO DUQUE
    SEBASTIAN VILLA VARGAS
     */


    public static int optimizacionNumeroDeAgentes(Persona[] personas){
        int contadorTiempoTotalDeAtencion=0;
        for (Persona persona:personas) {
            contadorTiempoTotalDeAtencion+= persona.tiempoAtencion;
        }
        System.out.println(contadorTiempoTotalDeAtencion+"CONTADOR");
        double numeroOptimoDeAgentes=Math.ceil ( ( (  (double) (contadorTiempoTotalDeAtencion) /((double) ((personas.length))  ) )*0.5/(   (double) (28800)  )   ));

        int numeroOptimoDeAgentesEntero= (int) numeroOptimoDeAgentes;

        return numeroOptimoDeAgentesEntero;
    }


    public static void main(String[] args) {

        //SIMULACION ALEATORIOS POR CONSOLA
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de Personas: ");
        int cantidadPersonas = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la Cantidad de Agentes: ");
        int cantidadAgentes = Integer.parseInt(scanner.nextLine());
        Fila filallena = new Fila();
        Persona[] personas = filallena.llenarFila(cantidadPersonas);
        SimuladorFilas sim = new SimuladorFilas(cantidadAgentes, personas, 28800);
        sim.correrSimulacion();
        System.out.println("El porcentaje promeedio de tiempo de Ocupacion fue: "+sim.getPromedioOcupacion());
        System.out.println("El tiempo de espera promedio de cada persona fue: "+sim.getPromedioEspera());




        /*Formato Prueba Unitaria
        Persona[] personas = { new Persona(0, 0, 5) };
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        sim.correrSimulacion();
        System.out.println("El porcentaje promeedio de tiempo de Ocupacion fue: "+sim.getPromedioOcupacion());
        System.out.println("El tiempo de espera promedio de cada persona fue: "+sim.getPromedioEspera());*/

    }

}