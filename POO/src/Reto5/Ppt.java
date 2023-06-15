package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego {
    private String nombre;
    private int opcionJugador;
    private int numAle;
    
    public Ppt() {
    }
    public Ppt(String nombre, int opcionJugador, int numAle) {
        this.nombre = nombre;
        this.opcionJugador = opcionJugador;
        this.numAle = numAle;
    }

    Scanner entrada = new Scanner(System.in);
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre = entrada.next();
        
    }
    public void jugar() {
        System.out.println(nombre+" Realice su eleccion 1. Piedra 2. Papel 3. Tijera");
        opcionJugador = entrada.nextInt();
        Random aleatorio = new Random();
        numAle = aleatorio.nextInt(3)+1;
        System.out.println("Esperando resultado");
    }
    public void finalizar() {
        System.out.println("num"+numAle);
        if (numAle==1 && opcionJugador==1) {
            System.out.println("Ambos eligieron Piedra, hay un empate");
        }
        else if (numAle==2 && opcionJugador==2){
            System.out.println("Ambos eligieron Papel, hay un empate");
        }
        else if (numAle==3 && opcionJugador==3){
            System.out.println("Ambos eligieron Tijera, hay un empate");
        }
        else if ( numAle==1 && opcionJugador==2){
            System.out.println("La maquina eligió Piedra y "+nombre+" eligió Papel. has ganado");
        }
        else if ( numAle==1 && opcionJugador==3){
            System.out.println("La maquina eligió Piedra y "+nombre+" eligió Tijera. has perdido");
        }
        else if ( numAle==2 && opcionJugador==1){
            System.out.println("La maquina eligió Papel y "+nombre+" eligió Piedra. has perdido");
        }
        else if ( numAle==2 && opcionJugador==3){
            System.out.println("La maquina eligió Papel y "+nombre+" eligió Tijera. has ganado");
        }
        else if ( numAle==3 && opcionJugador==1){
            System.out.println("La maquina eligió Tijera y "+nombre+" eligió Piedra. has ganado");
        }
         else if ( numAle==3 && opcionJugador==2){
            System.out.println("La maquina eligió Tijera y "+nombre+" eligió Papel. has perdido");
        }
    }
    
}
