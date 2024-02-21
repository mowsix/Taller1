import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Fila {

    private Queue<Persona> fila;
    public Queue<Persona> getFila() {
        return fila;
    }

    private int CantidadPersonas;
    public Fila(int cantidadPersonas) {
        setCantidadPersonas(cantidadPersonas);
        System.out.println(cantidadPersonas+"@@@@@@2");
        fila = new ArrayDeque<>();
        System.out.println(fila+"fila");
        llenarFila();
        System.out.println(fila+"filaLLENAAAA");
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }
    public void setCantidadPersonas(int cantidadPersonas) {
        CantidadPersonas = cantidadPersonas;
    }


    public void agregarPersona(Persona persona) {
        fila.add(persona);
    }

    public Queue<Persona> llenarFila(){
        for (int i = 1; i<=getCantidadPersonas(); i++ ) {
            int tiempoLlegada = new Random().nextInt(28801);
            System.out.println(i+ " "+tiempoLlegada);
            Persona persona = new Persona(i,tiempoLlegada);
            agregarPersona(persona);
        }
        return fila;
    }

}
