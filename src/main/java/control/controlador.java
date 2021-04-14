/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Numeros;

/**
 *
 * @author paula
 */
public class controlador {

    Numeros base64[];
    Numeros obj_modelo = new Numeros();

    public controlador() {
        generarBase64();
    }

    public void generarBase64() {
        int i = 0; // iterador para la posición del valor
        base64 = new Numeros[64];
        //generar los números de 0 a 9
        for (i = 0; i < 10; i++) {
            Numeros obj = new Numeros(i, String.valueOf(i));
            base64[i] = obj;
        }
        //generar los valores del 10 al 
        for (char caracter = 'A'; caracter <= 'Z'; caracter++) {
            Numeros obj;
            if(i==24)
            {
              obj  = new Numeros(i, Character.toString('Ñ'));
              caracter--;
            }
            else
            {
               obj = new Numeros(i, Character.toString(caracter));
            } 
            base64[i] = obj;
            i++;
        }
        for (char caracter = 'a'; caracter <= 'z'; caracter++) {
            Numeros obj;
            if(i==51)
            {
               obj  = new Numeros(i, Character.toString('ñ'));
               caracter--;
            }
            else
            {
               obj = new Numeros(i, Character.toString(caracter));
            } 
            base64[i] = obj;
            i++;
        }
    }
}
