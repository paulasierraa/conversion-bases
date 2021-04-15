/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Numeros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import vista.Formulario;

/**
 *
 * @author paula
 */
public class controlador implements ActionListener {

    Formulario frmprincipal;
    ArrayList<String> base64;
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
        generarBase64();
        calcularPEntero("FB4",16,10);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmprincipal.getBtnCalcu())) {
            int baseActual, baseFinal, numInicial,p_entera, p_fraccionario;
            baseActual = Integer.parseInt(frmprincipal.getTxtBaseOr().getText());
            baseFinal = Integer.parseInt(frmprincipal.getTxtBaseFi().getText());
            //calcularPEntero(frmprincipal.getTxtNumOr().getText(), baseActual, baseFinal);
            frmprincipal.getTxtNumFi().setText(String.valueOf(calcularPEntero(frmprincipal.getTxtNumOr().getText(), baseActual, baseFinal)));
            
        }

    }
    public int calcularPEntero(String entero, int basei, int basef) {
        if (basei <= 10) {
            String valor="";
            int r = 0;
            int c = Integer.parseInt(entero);
            while (c != 0) {
                r = c % basef;
                c = c / basef;
                valor+=r;
            }
            return Integer.parseInt((revertirCadena(valor)));
        } else {
            int acum = 0;
            int i=0; // elevado a la i....
            for (int j = entero.length()-1; j >= 0; j--) {
                int num = base64.indexOf(Character.toString(entero.charAt(j)));
                acum += (Math.pow(basei, i)*num);
                i++;
            }
            return acum;
        }
    }

    public void generarBase64() {
        int i = 0; // iterador para la posición del valor
        base64 = new ArrayList<String>();
        //generar los números de 0 a 9
        for (i = 0; i < 10; i++) {
            base64.add(i, String.valueOf(i));
        }
        //generar los valores del 10 al 
        for (char caracter = 'A'; caracter <= 'Z'; caracter++) {
            Numeros obj;
            if (i == 24) {
                base64.add(i, Character.toString('Ñ'));
                caracter--;
            } else {
                base64.add(i, Character.toString(caracter));
            }
            i++;
        }
        for (char caracter = 'a'; caracter <= 'z'; caracter++) {
            Numeros obj;
            if (i == 51) {
                base64.add(i, Character.toString('ñ'));
                caracter--;
            } else {
                base64.add(i, Character.toString(caracter));
            }
            i++;
        }
    }

    public String revertirCadena(String cadena) {
        String nueva_cadena = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            nueva_cadena += cadena.charAt(i);
            System.out.println(cadena.charAt(i));
        }
        return nueva_cadena;
    }

}
