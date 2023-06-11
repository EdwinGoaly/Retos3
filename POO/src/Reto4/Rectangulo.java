package Reto4;
import java.util.Scanner;
public class Rectangulo extends Figura {
    private int largo;
    private int ancho;
    public Rectangulo(){
    }
    public Rectangulo(int largo, int ancho) {
        super();
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    Scanner entrada = new Scanner(System.in);
    public void registrarDatos(){
        System.out.println("Ingrese el valor del largo");
        largo = entrada.nextInt();
        System.out.println("Ingrese el valor del ancho");
        ancho = entrada.nextInt();
    }
    public void calcularArea(){
        float area = largo * ancho;
        System.out.println("El valor del área es: "+area);
    }
}
