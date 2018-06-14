/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import Edificaciones.Edificaciones;
import Main.AbstractFactory;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculos.Vehiculos;

/**
 *
 * @author rodol
 */
public class FactoryRecursos implements AbstractFactory {
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
        switch (type){
            case "oro":
                return new Oro();
            case "mana":
                return new Mana();
            case "esencia":
                return new Esencia();
            case "comida":
                return new Comida();
            case "sangre":
                return new Sangre();
            case "armas":
                return new Armas();
            case "almas":
                return new Pociones();
            case "pociones":
                return new Almas();
            case "libros":
                return new Libros();
            }
        return null;
    }

    @Override
    public Vehiculos getVehiculo(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
