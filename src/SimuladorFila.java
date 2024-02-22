public class SimuladorFila {

    public double porcentajeTiempoOcupado;
    public double promedioTiempoEspera;
    public int jornada = 28800;

    public SimuladorFila() {
        correrSimulacion();

    }

    public void correrSimulacion() {
        int contadorOcupado=0;

        for (int t = 0; t <= jornada; t++) {
            System.out.println(t+"    "+Fila.getAgentes());
            for (Agente agente : Fila.getAgentes()) {
                if(!agente.estaOcupado){
                    contadorOcupado++;
                    for ( Persona persona :Fila.getFilaPersonas() ) {
                        if(t>=persona.tiempoLlegada){
                            Fila.ocuparAgente(agente.id-1,true);
                            int tiempoServicio = (int) (Math.random() * 3301) + 300;
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
        }


    }

}




