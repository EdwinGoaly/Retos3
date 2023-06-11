package Reto3.Principal;
import java.util.Scanner;

import Reto3.Salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado empleado1 = new Empleado();
        System.out.println("--------------------------------");
        System.out.println("Ingrese el tipo de documento");
        System.out.println("--------------------------------");
        empleado1.setTipoDoc(entrada.next().toUpperCase());
        System.out.println("--------------------------------");
        System.out.println("Ingrese el documento");
        System.out.println("--------------------------------");
        empleado1.setDocumento(entrada.nextInt());
        entrada.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Ingrese su nombre");
        System.out.println("--------------------------------");
        empleado1.setNombre(entrada.nextLine().toUpperCase());
        System.out.println("--------------------------------");
        System.out.println("Ingrese su apellido");
        System.out.println("--------------------------------");
        empleado1.setApellido(entrada.nextLine().toUpperCase());
        System.out.println("--------------------------------");
        System.out.println("Ingrese el cargo que desempeña");
        System.out.println("--------------------------------");
        empleado1.setCargo(entrada.nextLine().toUpperCase());
        System.out.println("--------------------------------");
        System.out.println("Ingrese el valor por hora");
        System.out.println("--------------------------------");
        empleado1.setValorHora(entrada.nextDouble());
        System.out.println("--------------------------------");
        System.out.println("Ingrese las horas trabajadas");
        System.out.println("--------------------------------");
        empleado1.setHorasTrabajadas(entrada.nextInt());
        entrada.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Ingrese el departamento");
        System.out.println("--------------------------------");
        empleado1.setDepartamento(entrada.nextLine().toUpperCase());

        empleado1.mostrarEmpleado();
        entrada.close();
    }
}
