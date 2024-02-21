import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Fila {

    private Queue<Persona> fila;
    private int CantidadPersonas;

    private Queue<Agente> agentes;
    public Queue<Agente> getAgentes() {
        return agentes;
    }

    public void setAgentes(Queue<Agente> agentes) {
        this.agentes = agentes;
    }


    public int getCantidadAgentes() {
        return CantidadAgentes;
    }

    public void setCantidadAgentes(int cantidadAgentes) {
        CantidadAgentes = cantidadAgentes;
    }

    private int CantidadAgentes;

    public Queue<Persona> getFila() {
        return fila;
    }

    public Fila(int cantidadPersonas, int cantidadAgentes) {
        setCantidadPersonas(cantidadPersonas);
        setCantidadAgentes(cantidadAgentes);
        fila = new ArrayDeque<>();
        agentes= new ArrayDeque<>();
        llenarFila();
        llenarFilaAgentes();
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
            Persona persona = new Persona(i,tiempoLlegada);
            agregarPersona(persona);
        }
        return fila;
    }

    public void agregarAgente(Agente agente) {
        agentes.add(agente);
    }
    public Queue<Agente> llenarFilaAgentes(){
        for (int i = 1; i<=getCantidadAgentes(); i++ ) {
            //int tiempoServicio = (int) (Math.random() * 3301) + 300;
            Agente agente = new Agente(i,false);
            agregarAgente(agente);
        }
        return agentes;
    }




}