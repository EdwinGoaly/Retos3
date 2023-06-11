package Reto4;
import java.util.Scanner;
public class Pentagono extends Figura{
    private double lado;
    private double apotema;
    public Pentagono(){

    }
    public Pentagono(double lado, double apotema){
        super();
        this.lado = lado;
        this.apotema = apotema;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    Scanner entrada = new Scanner(System.in);
    public void registrarDatos(){
        System.out.println("Ingrese el lado del Pentágono");
        lado = entrada.nextDouble();
        System.out.println("Ingrese la apotema del Pentágono");
        apotema = entrada.nextDouble();
    }
    public void calcularArea(){
        double area = (5 * lado * apotema) / 2;
        System.out.println("El área del Pentágono es: "+area);   
    }
    
}
