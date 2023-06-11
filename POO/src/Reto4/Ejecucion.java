package Reto4;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        //Declaramos variables
        int opcion;
        int respuesta=0;
        //Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("         BIENVENIDO       ");
        System.out.println("---------------------------");
        do {
            //Solicitamos la opción 
            System.out.println("Ingrese una opción");
            System.out.println("---------------------------");
            System.out.println("1)Círculo\n2)Rectángulo\n3)Triángulo\n4)Pentágono\n5)Salir");
            System.out.println("---------------------------");
            //Guardamos lo que atrape el objeto entrada en nuestra variable opcion
            opcion = entrada.nextInt();      
            System.out.println("---------------------------");
            //Dependiendo de la opción, ejecutará el case correspondiente al valor de la opción
            switch (opcion) {
                //En cada case instanciamos la clase correspondiente y llamamos los métodos para registrar y calcular el área de la figura elegida
                //por el usuario. También usamos ciclos do-while para preguntar si quiere volver a calcular otra area de la misma figura
                case 1:
                    do {
                        Circulo circulo = new Circulo();
                        circulo.registrarDatos();
                        System.out.println("------------------------------------------------------------------");
                        circulo.calcularArea();
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("¿Desea volver a calcular otra area de la misma figura?\n1)Si\n2)No");
                        respuesta = entrada.nextInt(); //Variable que dependiendo su valor, el ciclo continuará o se romperá
                        System.out.println("-------------------------------------------------------------------");
                    } while (respuesta==1);
                    break;
                case 2:
                    do {
                        Rectangulo rectangulo = new Rectangulo();
                        rectangulo.registrarDatos();
                        System.out.println("------------------------------------------------------------------");
                        rectangulo.calcularArea();
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("¿Desea volver a calcular otra area de la misma figura?\n1)Si\n2)No");
                        System.out.println("------------------------------------------------------------------");
                        respuesta = entrada.nextInt();
                        System.out.println("------------------------------------------------------------------");
                    } while (respuesta==1);
                    break;
                case 3:
                    do {
                        Triangulo triangulo = new Triangulo();
                        triangulo.registrarDatos();
                        System.out.println("------------------------------------------------------------------");
                        triangulo.calcularArea();
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("¿Desea volver a calcular otra area de la misma figura?\n1)Si\n2)No");
                        System.out.println("------------------------------------------------------------------");
                        respuesta = entrada.nextInt();
                        System.out.println("------------------------------------------------------------------");
                    } while (respuesta==1);
                    break;
                case 4:
                    do {
                        Pentagono pentagono = new Pentagono();
                        pentagono.registrarDatos();
                        System.out.println("------------------------------------------------------------------");
                        pentagono.calcularArea();
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("¿Desea volver a calcular otra area de la misma figura?\n1)Si\n2)No");
                        System.out.println("------------------------------------------------------------------");
                        respuesta = entrada.nextInt();  
                        System.out.println("------------------------------------------------------------------");
                    } while (respuesta==1);
                    break;
                case 5:
                    System.out.println("--------------------------------------");
                    //Si ingresa la opción 5 se sale del programa
                    System.out.println("Usted ha decidido salir del programa");
                    System.out.println("--------------------------------------");
                    break;        
                default:
                //Si ingresa opciones no validas, no avanzará hasta que digíte una opción valida.
                    while(opcion<0 || opcion>5){
                        System.out.println("---------------------------------------------");
                        System.out.println("OPCIÓN INVALIDA. Vuelva a digítar una opción");
                        System.out.println("---------------------------------------------");
                        opcion = entrada.nextInt();
                    }
                    break;
            }
        } while (opcion!=5);
        entrada.close();
    }
}
