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


    public static Persona[] getFilaPersonas() {
        return filaPersonas;
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

    public void setAgentes(List<Agente> agentes) {
        this.agentes = agentes;
    }

    public static int CantidadAgentes;

    public static int getCantidadAgentes() {
        return CantidadAgentes;
    }

    public static void setCantidadAgentes(int cantidadAgentes) {
        CantidadAgentes = cantidadAgentes;
    }

    /*public Fila(int cantidadPersonas, int cantidadAgentes) {
        setCantidadPersonas(cantidadPersonas);
        setCantidadAgentes(cantidadAgentes);
        filaPersonas = new Persona[0];
        agentes= new ArrayList<>();
       // llenarFila();
        //llenarFilaAgentes();
    }*/
      public Fila() {

      }




    /*public void agregarPersona(Persona persona) {

        filaPersonas.add(persona);
    }*/

    public Persona[] llenarFila(int cantidadPersonas){
        setCantidadPersonas(cantidadPersonas);
        ArrayList<Persona> arrayLpersonas = new ArrayList<>();
        for (int i = 0; i<=getCantidadPersonas()-1; i++ ) {
            //int tiempoLlegada = new Random().nextInt(28801);
            //int tiempoAtencion = (int) (Math.random() * 3301) + 300;

            int tiempoLlegada = new Random().nextInt(11);
            int tiempoAtencion = (int) (Math.random() * 3) + 2;
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

    public static void eliminarPrimeraPersona(Persona[] personas) {

        // Crear un nuevo arreglo con una longitud menor
        Persona[] nuevoArreglo = new Persona[personas.length - 1];


        // Copiar las personas excepto la primera
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
        for (int i = 0; i<=getCantidadAgentes()-1; i++ ) {
            Agente agente = new Agente(i,true, 0,0);
            //System.out.println(agente);
            agregarAgente(agente);
        }
        return agentes;
    }

    public static void ocuparAgente(int id, boolean estado){
        agentes.get(id).setAgenteLibre(estado);
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