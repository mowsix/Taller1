public class Persona {

    public int id;
    public int tiempoLlegada;
    public int tiempoAtencion;

    public Persona(int tiempoLlegada, int id, int tiempoAtencion ){
        this.id=id;
        this.tiempoLlegada=tiempoLlegada;
        this.tiempoAtencion=tiempoAtencion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    @Override
    public String toString() {
        //return "Persona{id= "+id+ ", tiempo de llegada= "+tiempoLlegada+"}";
        return String.format("Persona{  Tiempo de llegada: "+tiempoLlegada+ ", id: "+id+", tiempo de Servicio: "+tiempoAtencion+"}\n");
    }

}