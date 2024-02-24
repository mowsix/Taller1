public class Agente {

    public int id;
    public int tiempoServicio;
    public boolean agenteLibre;
    public int tiempoParaLiberar;

    public void setTiempoParaLiberar(int tiempoParaLiberar) {
        this.tiempoParaLiberar = tiempoParaLiberar;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public void setAgenteLibre(boolean agenteLibre) {
        this.agenteLibre = agenteLibre;
    }



    public Agente(int id, boolean agenteLibre, int tiempoServicio, int tiempoParaLiberar ) {
        this.id = id;
        this.agenteLibre = agenteLibre;
        this.tiempoServicio= tiempoServicio;
        this.tiempoParaLiberar=tiempoParaLiberar;
    }

    @Override
    public String toString() {
        //return "Persona{id= "+id+ ", tiempo de llegada= "+tiempoLlegada+"}";
        return String.format("Agente{id: "+id+ ", Esta Libre= "+ agenteLibre +" Tiempo en servicio = "+tiempoServicio+"}\n");
    }


}
