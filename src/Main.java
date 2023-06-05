public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Ivan";
        cliente.edad = 30;
        cliente.credito = 1255.55;
        System.out.println("Nombre del cliente " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + "$" + cliente.credito);

        System.out.println("");

        trabajador.nombre = "ivan";
        trabajador.edad = 48;
        trabajador.telefono = 81158465;
        trabajador.salario = 10000;
        System.out.println("nombre del trabajdor: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("telefono: " + trabajador.telefono);
        System.out.println("credito: " + "$" + trabajador.salario);

    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;
}
class Cliente extends Persona {
    double credito;
}

class Trabajador extends  Persona{
    double salario;
}