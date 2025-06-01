package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Modelo;
import views.Vista;

public class Controlador implements ActionListener {
    private Vista view;
    private Modelo modelo;

    public Controlador(Vista view, Modelo modelo) {
        this.view = view;
        this.modelo = modelo;
        this.view.btnSuma.addActionListener(this);
        this.view.btnResta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumeroUno(Integer.parseInt(view.cajaN1.getText()));
        modelo.setNumeroDos(Integer.parseInt(view.cajaN2.getText()));
        
        if (e.getSource() == view.btnSuma) {
            modelo.sumar();
            view.cajaRes.setText(String.valueOf(modelo.getResultado()));
        } else if (e.getSource() == view.btnResta) {
            modelo.restar();
            view.cajaRes.setText(String.valueOf(modelo.getResultado()));
        }
    }
    
    

}
