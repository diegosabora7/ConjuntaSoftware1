/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isi.conjunta.conjuntasoftware1;

/**
 * Clase para el control de operaciones entre dos números.
 * @author DiegoYandun
 * @author Pablo Guallichico
 */
public class OperacionesFloat {
     /**
     * Metodo para realizar la suma entre dos numeros flotantes.
     * @param a operando a de la suma.
     * @param b operando b de la suma.
     * @return resultado de la operacion.
     */
    public float suma(float a, float b){
        return a+b;
    }
    /**
     * Metodo para realizar la resta entre dos numeros enteros.
     * @param a operando a de la resta.
     * @param b operando b de la resta.
     * @return resultado de la operacion.
     */
    public float resta(float a, float b){
        return a-b;
    } 
    /**
     * Metodo para la hacer una multiplicacion entre dos numeros flotantes.
     * @param a multiplicando de la operacion.
     * @param b multiplicador de la opracion.
     * @return resultado de la operacion.
     */
    public float multiplicacion(float a, float b){
        return a*b;
    }
    /**
     * Metodo para la hacer una division entre dos numeros flotantes.
     * @param a dividendo de la operacion.
     * @param b divisor de la opracion.
     * @return resultado de la operacion.
     */
    public float division(float a, float b){
        return a/b;
    }
}
