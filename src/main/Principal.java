package main;

import controllers.Controlador;
import models.Modelo;
import views.Vista;

public class Principal {

    public static void main(String[] args) {
        Vista vistaPrueba = new Vista();
        Modelo modeloPrueba = new Modelo();
        Controlador controladorPrueba = new Controlador(vistaPrueba, modeloPrueba);
        
        vistaPrueba.setVisible(true);
    }

}
