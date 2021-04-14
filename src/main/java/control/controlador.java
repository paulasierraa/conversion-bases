/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Numeros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Formulario;

/**
 *
 * @author paula
 */
public class controlador implements ActionListener {

    Formulario frmprincipal;
    Numeros base64[];
    Numeros obj_modelo = new Numeros();
    
    public controlador() {
        this.frmprincipal = frmprincipal;
        this.frmprincipal = new Formulario();
        this.frmprincipal.getBtnCalcu().addActionListener(this);
        this.frmprincipal.getBtnProbar().addActionListener(this);
    }

    public void iniciar() {
        this.frmprincipal.setTitle("CONVERSOR DE BASES");
        this.frmprincipal.setLocationRelativeTo(null);
        this.frmprincipal.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

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
            if (i == 24) {
                obj = new Numeros(i, Character.toString('Ñ'));
                caracter--;
            } else {
                obj = new Numeros(i, Character.toString(caracter));
            }
            base64[i] = obj;
            i++;
        }
        for (char caracter = 'a'; caracter <= 'z'; caracter++) {
            Numeros obj;
            if (i == 51) {
                obj = new Numeros(i, Character.toString('ñ'));
                caracter--;
            } else {
                obj = new Numeros(i, Character.toString(caracter));
            }
            base64[i] = obj;
            i++;
        }
    }

}
