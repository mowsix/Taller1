import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Fila {

    private Queue<Persona> fila;
    private int CantidadPersonas;
    public Fila() {
        fila = new ArrayDeque<>();
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

    public Fila llenarFila(int cantidadPersonas){

        Fila filaLLena = new Fila();






        for (int i = 0; i<=getCantidadPersonas(); i++ ) {
            int tiempoLlegada = new Random().nextInt(28801);
            Persona persona = new Persona(i,tiempoLlegada);
            filaLLena.agregarPersona(persona);
        }



        return  filaLLena;

    }


}
