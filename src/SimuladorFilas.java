import java.util.Queue;

public class SimuladorFilas {

    public double promedioEspera;
    public double promedioOcupacion;

    public double getPromedioEspera() {
        return promedioEspera;
    }
    public double getPromedioOcupacion() {
        return promedioOcupacion;
    }

    public static int jornada = 28800;

    public static int getJornada() {
        return jornada;
    }

    public static void setJornada(int jornada) {
        SimuladorFilas.jornada = jornada;
    }

    public SimuladorFilas(int cantidadAgentes, Persona[] personas, int jornada) {
        correrSimulacion();
    }

    public void correrSimulacion() {
        int agenteEnTiempoDeServicio=0;
        int contadorTiempoDeEspera=0;

        for (int t = 0; t <= jornada; t++){

            for (Agente agente : Fila.getAgentes()) {
                if(!agente.estaOcupado){
                    for ( Persona persona :Fila.getFilaPersonas() ){
                        if(t==persona.tiempoLlegada){
                            agente.setEstaOcupado(true);
                            agente.tiempoServicio+=persona.tiempoAtencion;
                            break;
                        }
                        if (t==persona.tiempoLlegada+persona.tiempoAtencion){
                            agente.setEstaOcupado(false);
                            break;
                        }

                    }
                }else {

                    for ( Persona persona :Fila.getFilaPersonas() ){
                        if(t==persona.tiempoLlegada){
                            break;
                        }

                    }

                }
            }
        }












        /*for (int t = 0; t <= jornada; t++) {
            //System.out.println(t+"    "+Fila.getAgentes());
            for (Agente agente : Fila.getAgentes()) {
                if(!agente.estaOcupado){

                    for ( Persona persona :Fila.getFilaPersonas() ) {
                        if(t>=persona.tiempoLlegada){
                            Fila.ocuparAgente(agente.id-1,true);
                            //int tiempoServicio = (int) (Math.random() * 3301) + 300;
                            Fila.asignarTiempoDeServicio(agente.id-1, tiempoServicio);
                            //System.out.println(t+"    "+Fila.getAgentes());
                        }
                    }
                }else {
                    if (agente.tiempoServicio>0){
                        Fila.asignarTiempoDeServicio(agente.id-1, agente.tiempoServicio-1);
                    }else {
                        Fila.ocuparAgente(agente.id-1,false);
                    }
                }

            }
        }*/


    }

}




