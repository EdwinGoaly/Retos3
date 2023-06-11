package Reto4;
import java.util.Scanner;
public class Triangulo extends Figura{
    private int base;
    private int altura;
    
    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    Scanner entrada = new Scanner(System.in);
    public void registrarDatos(){
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextInt();
    }

    public void calcularArea(){
        float area = (base*altura)/2;
        System.out.println("El área del triángulo es: "+area);
    }
    
}
