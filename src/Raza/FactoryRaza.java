/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

import Edificaciones.Edificaciones;
import Main.AbstractFactory;
import Milicia.Milicia;
import Recursos.Recursos;
import Vehiculos.Vehiculos;

/**
 *
 * @author rodol
 */
public class FactoryRaza implements AbstractFactory {
    @Override
    public Edificaciones getEdificacion(String type){
        return null;
    }
    
    @Override 
    public Milicia getMilicia(String type){
        return null;
    }
    
    @Override
    public Raza getRaza(String type){
        switch (type){
            case "arqueros":
                return new Arquero();
            case "barbaros":
                return new Barbaro();
            case "brujos":
                return new Brujo();
        }
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

