import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Fila {

    public int jornada=28800;
    private static Queue<Persona> filaPersonas;
    public static Queue<Persona> getFilaPersonas() {
        return filaPersonas;
    }
    private int CantidadPersonas;

    private static Queue<Agente> agentes;
    public static Queue<Agente> getAgentes() {
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



    public Fila(int cantidadPersonas, int cantidadAgentes) {
        setCantidadPersonas(cantidadPersonas);
        setCantidadAgentes(cantidadAgentes);
        filaPersonas = new ArrayDeque<>();
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
        filaPersonas.add(persona);
    }

    public Queue<Persona> llenarFila(){
        for (int i = 1; i<=getCantidadPersonas(); i++ ) {
            int tiempoLlegada = new Random().nextInt(28801);
            Persona persona = new Persona(i,tiempoLlegada);
            agregarPersona(persona);
        }
        return filaPersonas;
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

    public void ocuparAgente(int id){

    }



}