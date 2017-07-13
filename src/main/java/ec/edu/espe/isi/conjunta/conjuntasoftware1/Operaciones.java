/*
 * The MIT License
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

/**
 * Clase para el control de operaciones entre dos números.
 * @author DiegoYandun
 * @author Pablo Guallichico
 */
public class Operaciones {
     /**
     * Metodo para realizar la suma entre dos numeros enteros.
     * @param a operando a de la suma.
     * @param b operando b de la suma.
     * @return resultado de la operacion.
     */
    public int suma(int a, int b){
        return a+b;
    }
    /**
     * Metodo para realizar la resta entre dos numeros enteros.
     * @param a operando a de la resta.
     * @param b operando b de la resta.
     * @return resultado de la operacion.
     */
    public int resta(int a, int b){
        return a-b;
    }
    /**
     * Metodo para la hacer una multiplicacion entre dos numeros.
     * @param a multiplicando de la operacion.
     * @param b multiplicador de la opracion.
     * @return resultado de la operacion.
     */
    public int multiplicacion(int a, int b){
        return a*b;
    }
    /**
     * Metodo para la hacer una division entre dos numeros.
     * @param a dividendo de la operacion.
     * @param b divisor de la opracion.
     * @return resultado de la operacion.
     */
    public int division(int a, int b){
        return a/b;
    }
}
