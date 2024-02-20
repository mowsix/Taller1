public class Taller1 {

    public static void main(String[] args) {
        StdOut.print("Por favor, ingresa tu edad: ");
        int cantidadPersonas = StdIn.readInt();
        Fila filaLlena = new Fila().llenarFila(cantidadPersonas);
        StdOut.print(filaLlena);
        System.out.println(filaLlena);

    }
}
