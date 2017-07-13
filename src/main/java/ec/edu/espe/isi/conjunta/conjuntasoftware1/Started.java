 /* The MIT License
 *
 * Copyright 2017 Jonathan.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ec.edu.espe.isi.conjunta.conjuntasoftware1;

import java.util.Scanner;

/**
 * Clase principal.
 *
 * @author Jonathan
 */
public class Started {

    /**
     * @param args the command line arguments
     */
    private static Operaciones op = new Operaciones();

    public static void main(String[] args) {
        System.out.println("MENU PRINCIPAL");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        try {
                System.out.print("Ingrese el primer numero: ");
                a = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                b = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Ingrese solo numeros");
            }
            menu(a, b);
    }

    /**
     *
     * Metodo para la muestra del menu con numeros enteros.
     * @param a Numero 1.
     * @param b Numero 2.
     */
    public static void menu(int a, int b) {
        int aux = 0;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Ingrese la operacion deseada: ");
                System.out.println("1. Suma\n2. Resta\n3. Multiplicacion");
                System.out.println("\n4. Divicion\n5. Potencia\n6. Modulo\n7. Salir");
                aux = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Ingrese solo numeros");
            }
            switch (aux) {
                case 1:
                    System.out.println("Resultado: " + op.suma(a, b));
                    break;
                case 2:
                    System.out.println("Resultado: " + op.resta(a, b));
                    break;
                case 3:
                    System.out.println("Resultado: " + op.multiplicacion(a, b));
                    break;
                case 4:
                    System.out.println("Resultado: " + op.division(a, b));
                    break;
                case 5:
                    System.out.println("Resultado: " + op.potencia(a, b));
                    break;
                case 6:
                    System.out.println("Resultado: " + op.modulo(a, b));
                    break;
                case 7:
                    System.out.println("Fin del Programa");
                    break;
                default:

            }
        } while (aux == 5);
    }
}
