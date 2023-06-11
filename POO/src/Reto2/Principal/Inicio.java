package Reto2.Principal;
import Reto2.Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona datos = new Persona();
        datos.pedirDatos();
        datos.mayorEdad();
        datos.mostrarDatos();
        double pesoRedondeado = datos.calcularImc();
        if (pesoRedondeado<20){
            System.out.println("PESOBAJO");
        } else if(pesoRedondeado>=20 && pesoRedondeado<=25){
            System.out.println("PESOIDEAL");
        } else if(pesoRedondeado>25){
            System.out.println("SOBREPESO");
        }
    
    }

}
