public class Persona {
    public int id;
    public int tiempoLlegada;


    public int tiempoEspera;

    public int getTiempoEspera() {
        return tiempoEspera;
    }
    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }


    public Persona(int id, int tiempoLlegada){
        this.id=id;
        this.tiempoLlegada=tiempoLlegada;
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

    @Override
    public String toString() {
        //return "Persona{id= "+id+ ", tiempo de llegada= "+tiempoLlegada+"}";
        return String.format("Persona{id: "+id+ ", tiempo de llegada= "+tiempoLlegada+"}\n");
    }

}
