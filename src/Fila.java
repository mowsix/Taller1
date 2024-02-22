import java.util.*;

public class Fila {


    private static Persona[] filaPersonas;
    private static Persona[] filaPersonasOrdenadas;
    public static Persona[] getFilaPersonasOrdenadas() {
        return filaPersonasOrdenadas;
    }


    public static Persona[] getFilaPersonas() {
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
        filaPersonas = new Persona[0];
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


    /*public void agregarPersona(Persona persona) {

        filaPersonas.add(persona);
    }*/

    public Persona[] llenarFila(){
        ArrayList<Persona> arrayLpersonas = new ArrayList<>();
        for (int i = 0; i<=getCantidadPersonas()-1; i++ ) {
            int tiempoLlegada = new Random().nextInt(28801);
            int tiempoAtencion = (int) (Math.random() * 3301) + 300;
            Persona persona = new Persona(tiempoLlegada, i , tiempoAtencion );
            //System.out.println(persona);
            arrayLpersonas.add(persona);
        }
        filaPersonas= arrayLpersonas.toArray(new Persona[0]);
        filaPersonasOrdenadas=ordenarPorTiempoLlegada(filaPersonas);
        //System.out.println(Arrays.toString(filaPersonasOrdenadas));
        return filaPersonasOrdenadas;
    }

    public static Persona[] ordenarPorTiempoLlegada(Persona[] personas) {
        Arrays.sort(personas, Comparator.comparingInt(Persona::getTiempoLlegada));

        for (int i=0;i<= personas.length-1;i++){
            personas[i].setId(i);
        }

        return personas;
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