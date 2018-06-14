/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Edificaciones.Edificaciones;
import Main.AbstractFactory;
import Milicia.Milicia;
import Raza.Raza;
import Recursos.Recursos;

/**
 *
 * @author rodol
 */
public class FactoryVehiculos implements AbstractFactory {
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
        return null;
    }
    
    @Override
    public Recursos getRecurso(String type){
        return null;
    }
    
    @Override 
    public Vehiculos getVehiculo(String type){
        switch (type){
            case "Vehiculo1Arq":
                return new Vehiculo1Arq();
            case "Vehiculo2Arq":
                return new Vehiculo2Arq();
            case "Vehiculo1B":
                return new Vehiculo1B();
            case "Vehiculo2B":
                return new Vehiculo2B();
            case "Vehiculo1BR":
                return new Vehiculo1BR();
            case "Vehiculo2BR":
                return new Vehiculo2BR();
            
        }
        return null;
    }
}
