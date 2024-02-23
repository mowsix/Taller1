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

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public SimuladorFilas(int cantidadAgentes, Persona[] personas, int jornada) {
        //Fila filaLlena = new Fila();
        Fila.setCantidadPersonas(personas.length);
        Fila.setCantidadAgentes(cantidadAgentes);
        this.jornada=jornada;
        Fila.setFilaPersonasOrdenadas(personas);
        Fila.llenarFilaAgentes(cantidadAgentes);

        //correrSimulacion();




    }

    public void correrSimulacion() {

        int agenteEnTiempoDeServicio = 0;

        int contadorAgentesOcupados=0;


        boolean control=false;

        for (int t = 0; t <= jornada; t++) {
            //System.out.println(t + " " + Fila.getAgentes() + " " + Arrays.toString(Fila.getFilaPersonasOrdenadas()));
            //System.out.println(contadorTiempoDeEspera+"    OOOOOOOOOOODJGDFKGDLFKJG");

            for (Persona persona : Fila.getFilaPersonasOrdenadas()) {
                if (t >= persona.tiempoLlegada) {
                    control=true;
                    contadorAgentesOcupados=0;
                    for (Agente agente : Fila.getAgentes()) {
                        if (!agente.agenteLibre) {
                            contadorAgentesOcupados++;

                            //break; // No es necesario continuar verificando si uno ya está ocupado
                        }

                        if (agente.agenteLibre && control) {
                            control=false;

                            Fila.liberarAgente(agente.id, false);
                            int tiempo=persona.tiempoAtencion;
                            int tiempoParaLiberar=t+persona.tiempoAtencion;
                            Fila.asignarTiempoParaLiberar(agente.id,tiempoParaLiberar);

                           // System.out.println(tiempo+"rrrrrrrrrrrrrrrr"+agente.id+"pidddd"+persona.id);
                            Fila.asignarTiempoDeServicio(agente.id, tiempo);
                            Fila.eliminarPrimeraPersona(Fila.getFilaPersonasOrdenadas());

                        }else if (t==agente.tiempoParaLiberar){
                            Fila.liberarAgente(agente.id, true);
                        }

                    }
                    if (contadorAgentesOcupados==Fila.getCantidadAgentes()) {
                        contadorTiempoDeEspera++;
                    }

                }
            }

            //System.out.println(t + " " + Fila.getAgentes() + " " + Arrays.toString(Fila.getFilaPersonas()));

        }

        int x=0;
        for (Agente agente : Fila.getAgentes()){

            x+= Fila.getTiempoDeServicio(agente.id);


        }

        //System.out.println("PERSONASSS: "+ Fila.getCantidadPersonas());

      promedioEspera = ((contadorTiempoDeEspera)/Fila.getCantidadPersonas());
        //System.out.println(contadorTiempoDeEspera);
        //System.out.println(Fila.getCantidadPersonas());


        //System.out.println(x+"SUMAAAAA");
        //System.out.println(jornada+"·······");
        promedioOcupacion= (((double) (x))/((double) (jornada)))*100;


    }





}




