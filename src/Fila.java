import java.util.*;

public class Fila {

    private static Queue<Persona> filaPersonas;
    public static Queue<Persona> getFilaPersonas() {
        return filaPersonas;
    }
    private int CantidadPersonas;

    private static List<Agente> agentes;
    public static List<Agente> getAgentes() {
        return agentes;
    }

    public void setAgentes(List<Agente> agentes) {
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
        agentes= new ArrayList<>();
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
    public List<Agente> llenarFilaAgentes(){
        for (int i = 1; i<=getCantidadAgentes(); i++ ) {
            //int tiempoServicio = (int) (Math.random() * 3301) + 300;
            Agente agente = new Agente(i,false, 0);
            agregarAgente(agente);
        }
        return agentes;
    }

    public static void ocuparAgente(int id, boolean estado){
        agentes.get(id).setEstaOcupado(estado);
    }


    public static void asignarTiempoDeServicio(int id, int tiempoServicio){
        agentes.get(id).setTiempoServicio(tiempoServicio);
    }



}