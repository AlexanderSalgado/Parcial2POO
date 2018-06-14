/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Edificaciones.Edificaciones;
import Main.AbstractFactory;
import Raza.Raza;
import Recursos.Recursos;
import Vehiculos.Vehiculos;

/**
 *
 * @author rodol
 */
public class FactoryMilicia implements AbstractFactory {
      public Edificaciones getEdificacion(String type){
        return null;
    }
    
    @Override 
    public Milicia getMilicia(String type){
        switch (type){
            case "escuadroarqueros":
                return new EscuadronArquero();
            case "especialistarqueros":
                return new EspecialistaArquero();
            case "escuadronbarbaros":
                return new EscuadronBarbaro();
            case "especialistabarbaros":
                return new EspecialistaBarbaro();
            case "escuadrobrujos":
                return new EscuadronBrujo();
            case "especialistabrujos":
                return new EspecialistaBrujo();
        }
        return null;
    }
    
    @Override
    public Raza getRaza(String type){
        return null;
    }
    
    @Override
    public Recursos getRecurso(String type){
        return null;
    }
    
    @Override 
    public Vehiculos getVehiculo(String type){
        return null;
    }
}

