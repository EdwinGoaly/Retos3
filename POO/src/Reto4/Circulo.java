package Reto4;
import java.util.Scanner;
public class Circulo extends Figura{
    private double radio;
    public Circulo(){

    }
    public Circulo(double radio){
        super();
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    Scanner entrada = new Scanner(System.in);
    public void registrarDatos(){
        System.out.println("Ingrese el valor del radio");
        radio = entrada.nextInt();
    }
    public void calcularArea(){
        double area = 3.14159 * (radio*radio);
        System.out.println("El área del círculo es: "+area);

    }
}
