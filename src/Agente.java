public class Agente {
    public int id;
    public int tiempoServicio;
    public boolean estaOcupado = false;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }
    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }
    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }


    public Agente(int id, boolean estaOcupado, int tiempoServicio ) {
        this.id = id;
        this.estaOcupado = estaOcupado;
        this.tiempoServicio= tiempoServicio;
    }

    @Override
    public String toString() {
        //return "Persona{id= "+id+ ", tiempo de llegada= "+tiempoLlegada+"}";
        return String.format("Agente{id: "+id+ ", Esta Ocupado= "+estaOcupado+" Tiempo en servicio = "+tiempoServicio+"}\n");
    }


}
