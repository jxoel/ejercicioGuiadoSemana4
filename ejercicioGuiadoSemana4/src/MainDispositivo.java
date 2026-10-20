
public class MainDispositivo {
    public static void main(String[] args) {

        System.out.println("Total antes de crear objetos: " + Dispositivo.getTotalCreados());


        Dispositivo dispositivo1 = new Dispositivo("Laptop Pro", "Computadora");
        System.out.println("Objeto 1 -> ID " + dispositivo1.getId() + " (" + dispositivo1.getNombre() + ")");

        Dispositivo dispositivo2 = new Dispositivo("Server X", "Servidor");
        System.out.println("Objeto 2 -> ID " + dispositivo2.getId() + " (" + dispositivo2.getNombre() + ")");

        Dispositivo dispositivo3 = new Dispositivo("Tablet Air", "Dispositivo Móvil");
        System.out.println("Objeto 3 -> ID " + dispositivo3.getId() + " (" + dispositivo3.getNombre() + ")");

        
        System.out.println("Total después de crear tres: " + Dispositivo.getTotalCreados());
    }
}