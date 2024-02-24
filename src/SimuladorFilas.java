import java.util.Arrays;

public class SimuladorFilas {

    public double promedioEspera;
    public double promedioOcupacion;

    public double contadorTiempoDeEspera;

    public double getPromedioEspera() {
        return promedioEspera;
    }

    public double getPromedioOcupacion() {
        return promedioOcupacion;
    }

    public int jornada;


    public SimuladorFilas(int cantidadAgentes, Persona[] personas, int jornada) {

        Fila.setCantidadPersonas(personas.length);
        Fila.setCantidadAgentes(cantidadAgentes);
        this.jornada = jornada;
        Fila.setFilaPersonasOrdenadas(personas);
        Fila.llenarFilaAgentes(cantidadAgentes);

    }

    public void correrSimulacion() {

        int contadorAgentesOcupados = 0;
        boolean control = false;

        for (int t = 0; t <= jornada; t++) {
            for (Persona persona : Fila.getFilaPersonasOrdenadas()) {
                if (t >= persona.tiempoLlegada) {
                    control = true;
                    contadorAgentesOcupados = 0;
                    for (Agente agente : Fila.getAgentes()) {

                        if (agente.tiempoParaLiberar == t) {
                            Fila.liberarAgente(agente.id, true);
                        }

                        if (!agente.agenteLibre) {
                            contadorAgentesOcupados++;

                        }

                        if (agente.agenteLibre && control) {
                            control = false;

                            Fila.liberarAgente(agente.id, false);
                            int tiempo = persona.tiempoAtencion;
                            int tiempoParaLiberar = t + persona.tiempoAtencion;
                            Fila.asignarTiempoParaLiberar(agente.id, tiempoParaLiberar);
                            Fila.asignarTiempoDeServicio(agente.id, tiempo);
                            Fila.eliminarPrimeraPersona(Fila.getFilaPersonasOrdenadas());
                        }

                    }
                    if (contadorAgentesOcupados == Fila.getCantidadAgentes()) {
                        contadorTiempoDeEspera++;
                    }
                }
            }

        }
        int tiempoTrabajado = 0;
        for (Agente agente : Fila.getAgentes()) {
            tiempoTrabajado += Fila.getTiempoDeServicio(agente.id);
            System.out.println("El Agente "+agente.id+" Trabajo un: "+((Fila.getTiempoDeServicio(agente.id)/(double)((jornada))*100))+"%");
        }
        promedioOcupacion = ((((double) (tiempoTrabajado)) / ((double) (Fila.getCantidadAgentes()))) / ((double) (jornada))) * 100;
        promedioEspera = ((contadorTiempoDeEspera) / Fila.getCantidadPersonas());
    }
}