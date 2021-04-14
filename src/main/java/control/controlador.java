/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Formulario;

/**
 *
 * @author paula
 */
public class controlador implements ActionListener{

    Formulario frmprincipal;

    public controlador(Formulario frmprincipal) {
        this.frmprincipal = frmprincipal;
        this.frmprincipal = new Formulario();
        this.frmprincipal.getBtnCalcu().addActionListener(this);
        this.frmprincipal.getBtnProbar().addActionListener(this);
    }
    
    
    
    public void iniciar(){
        this.frmprincipal.setTitle("CONVERSOR DE BASES");
        this.frmprincipal.setLocationRelativeTo(null);
        this.frmprincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
