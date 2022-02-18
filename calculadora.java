// Nombre: Alexis Pérez
// Matricula: 2942889
// Actividad 5: Variables y Operadores

import java.util.Scanner;

public class calculadora {
    //Atributos
    int x, y;

    //Metodo main
    public static void main(String[] args) {
        // Vamos a crear un lector de entrada
        Scanner entrada = new Scanner(System.in);
        // Llamamos a la clase para acceder a sus atributos
        calculadora c = new calculadora();

        System.out.println("Ingrese el primer valor númerico: ");
        System.out.println("Ingrese el segundo valor númerico: ");

        // Guardamos los datos como valores enteros
        c.x = entrada.nextInt();
        c.y = entrada.nextInt();

        // Realizamos las operaciones correspondientes
        int sumar = c.x + c.y;
        int restar = c.x - c.y;
        double multiplicar = c.x * c.y;
        double dividir = c.x / c.y;
        double modulo = c.x % c.y;

        // Mostramos en consola toda la información necesaria
        System.out.println();
        System.out.println("X = " + c.x);
        System.out.println("Y = " + c.y);
        System.out.println("Suma: " + sumar);
        System.out.println("Resta: " + restar);
        System.out.println("Multiplicación: " + multiplicar);
        System.out.println("División: " + dividir);
        System.out.println("Modulo: " + modulo);
    }
}
