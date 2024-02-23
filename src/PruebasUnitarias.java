public class PruebasUnitarias {

    private static boolean igualdadDoubles(double a, double b) {
        return Math.abs(a-b)<1E-8;
    }

    public static void testCase1() {
        Persona[] personas = { new Persona(0, 0, 5) };
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        sim.correrSimulacion();
        assert(igualdadDoubles(sim.getPromedioOcupacion(), 50.0));
        assert(igualdadDoubles(sim.getPromedioEspera(), 0.0));
    }

    public static void testCase2() {
        Persona[] personas = { new Persona(2, 0, 5), new Persona(4, 1, 3) };
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        sim.correrSimulacion();
        assert(igualdadDoubles(sim.getPromedioOcupacion(), 80.0));
        assert(igualdadDoubles(sim.getPromedioEspera(), 3.0/2));
    }

    public static void testCase3() {
        Persona[] personas = { new Persona(0, 0, 5), new Persona(5, 1, 5) };
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        sim.correrSimulacion();
        assert(igualdadDoubles(sim.getPromedioOcupacion(), 100.0));
        assert(igualdadDoubles(sim.getPromedioEspera(), 0.0));
    }

    public static void testCase4() {
        Persona[] personas = { new Persona(0, 0, 5), new Persona(5, 1, 5) };
        SimuladorFilas sim = new SimuladorFilas(2, personas, 10);
        sim.correrSimulacion();
        assert(igualdadDoubles(sim.getPromedioOcupacion(), 50.0));
        assert(igualdadDoubles(sim.getPromedioEspera(), 0.0));
    }

    public static void testCase5() {
        Persona[] personas = {
                new Persona(0, 0, 2),
                new Persona(0, 1, 2),
                new Persona(0, 2, 2)
        };
        SimuladorFilas sim = new SimuladorFilas(1, personas, 10);
        sim.correrSimulacion();
        assert(igualdadDoubles(sim.getPromedioOcupacion(), 60.0));
        assert(igualdadDoubles(sim.getPromedioEspera(), 2.0));
    }


   public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();

       System.out.println("Todas las pruebas unitarias pasaron con éxito.");
    }
}