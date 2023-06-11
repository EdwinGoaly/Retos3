package Reto1.Principal;
import Reto1.Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona datos = new Persona();
        datos.pedirDatos();
        datos.mostrarDatos();
        datos.mayorEdad();
        datos.calcularImc();
    }
}
