package Reto2.Salud;
import java.util.Scanner;
public class Persona {
    String tipoDoc;
    String nombre;
    String apellido;
    String sexo;
    int documento;
    int edad;
    Double estatura;
    Double peso;
    
    public void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Ingrese el tipo de documento");
        System.out.println("--------------------------------");
        tipoDoc = entrada.next().toUpperCase();
        System.out.println("--------------------------------");
        System.out.println("Ingrese el documento");
        System.out.println("--------------------------------");
        documento = entrada.nextInt();
        entrada.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su nombre");
        System.out.println("--------------------------------");
        nombre = entrada.nextLine().toUpperCase();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su apellido");
        System.out.println("--------------------------------");
        apellido = entrada.nextLine().toUpperCase();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su peso en Kg");
        System.out.println("--------------------------------");
        peso = entrada.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su estatura en m");
        System.out.println("--------------------------------");
        estatura = entrada.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su edad");
        System.out.println("--------------------------------");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su sexo");
        System.out.println("--------------------------------");
        sexo = entrada.nextLine().toUpperCase();
        entrada.close();
    }
    public void mostrarDatos(){
        System.out.println("--------------------------------");
        System.out.println("            DATOS:              ");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("Tipo Doc.: "+tipoDoc);
        System.out.println("Documento: "+documento);
        System.out.println("--------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("--------------------------------");
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
        System.out.println("--------------------------------");
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("--------------------------------");

    }
    public double calcularImc(){
        Double pesoActual = peso/(estatura*estatura);
        double pesoRedondeado = Math.round(pesoActual * 10.0)/10.0;
        return pesoRedondeado;
    }
    public void mayorEdad(){
        if (edad>18) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        System.out.println(edad);
    }
}
