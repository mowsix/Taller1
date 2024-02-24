import java.util.*;

public class Fila {
    private static Persona[] filaPersonas;
    public static void setFilaPersonasOrdenadas(Persona[] filaPersonasOrdenadas) {
        Fila.filaPersonasOrdenadas = filaPersonasOrdenadas;
    }

    private static Persona[] filaPersonasOrdenadas;
    public static Persona[] getFilaPersonasOrdenadas() {
        return filaPersonasOrdenadas;
    }

    private static int CantidadPersonas;
    public static int getCantidadPersonas() {
        return CantidadPersonas;
    }
    public static void setCantidadPersonas(int cantidadPersonas) {
        CantidadPersonas = cantidadPersonas;
    }

    private static List<Agente> agentes= new ArrayList<>();
    public static List<Agente> getAgentes() {
        return agentes;
    }


    public static int CantidadAgentes;
    public static int getCantidadAgentes() {
        return CantidadAgentes;
    }
    public static void setCantidadAgentes(int cantidadAgentes) {
        CantidadAgentes = cantidadAgentes;
    }

      public Fila() {

      }

    public Persona[] llenarFila(int cantidadPersonas){
        setCantidadPersonas(cantidadPersonas);
        ArrayList<Persona> arrayLpersonas = new ArrayList<>();
        for (int i = 0; i<=getCantidadPersonas()-1; i++ ) {
            int tiempoLlegada = new Random().nextInt(28801);
            int tiempoAtencion = (int) (Math.random() * 3301) + 300;
            Persona persona = new Persona(tiempoLlegada, i , tiempoAtencion );
            arrayLpersonas.add(persona);
        }
        filaPersonas= arrayLpersonas.toArray(new Persona[0]);
        filaPersonasOrdenadas=ordenarPorTiempoLlegada(filaPersonas);
        return filaPersonasOrdenadas;
    }

    public static Persona[] ordenarPorTiempoLlegada(Persona[] personas) {
        Arrays.sort(personas, Comparator.comparingInt(Persona::getTiempoLlegada));

        for (int i=0;i<= personas.length-1;i++){
            personas[i].setId(i);
        }

        return personas;
    }

    public static void eliminarPrimeraPersona(Persona[] personas) {
        Persona[] nuevoArreglo = new Persona[personas.length - 1];
        for (int i = 1; i < personas.length; i++) {
            nuevoArreglo[i - 1] = personas[i];
        }
        filaPersonasOrdenadas=nuevoArreglo;
    }


    public static void agregarAgente(Agente agente) {
        agentes.add(agente);
    }

    public static List<Agente> llenarFilaAgentes(int cantidadAgentes){
        setCantidadAgentes(cantidadAgentes);
        agentes=new ArrayList<>();
        for (int i = 0; i<=getCantidadAgentes()-1; i++ ) {
            Agente agente = new Agente(i,true, 0,0);
            agregarAgente(agente);
        }
        return agentes;
    }

    public static void asignarTiempoDeServicio(int id, int tiempoServicio){

        int tiempoAcumulado=agentes.get(id).tiempoServicio+tiempoServicio;
        agentes.get(id).setTiempoServicio(tiempoAcumulado);
    }
    public static int getTiempoDeServicio(int id){
        return agentes.get(id).tiempoServicio;
    }

    public static void asignarTiempoParaLiberar(int id, int tiempoParaLiberar){
        agentes.get(id).setTiempoParaLiberar(tiempoParaLiberar);
    }

    public static void liberarAgente(int id, boolean Libre){
        agentes.get(id).setAgenteLibre(Libre);
    }

}