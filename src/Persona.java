public class Persona {
    public int id;
    public int tiempoLlegada;


    public Persona(int id, int tiempoLlegada){
        id= this.id;
        tiempoLlegada=this.tiempoLlegada;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }
    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    @Override public String toString() {
        return String.format("Persona{id=%d, tiempoLlegada=%d}", id, tiempoLlegada);
    }

}
