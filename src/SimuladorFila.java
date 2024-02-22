public class SimuladorFila {

    public double porcentajeTiempoOcupado;
    public double promedioTiempoEspera;
    public int jornada = 20;

    public SimuladorFila() {
        correrSimulacion();

    }

    public void correrSimulacion() {
        System.out.println("······" + jornada);

        for (int t = 0; t <= jornada; t++) {
            System.out.println(t);
            for (Agente agente : Fila.getAgentes()) {
                if(!agente.estaOcupado){
                    for ( Persona persona :Fila.getFilaPersonas() ) {
                        if(t>=persona.tiempoLlegada){


                        }
                    }
                }

            }
        }


    }

}




