/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Edificaciones.FactoryEdificacion;
import Milicia.FactoryMilicia;
import Raza.FactoryRaza;
import Recursos.FactoryRecursos;
import Vehiculos.FactoryVehiculos;

/**
 *
 * @author rodol
 */
    public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "edificacion":
                return new FactoryEdificacion();
            case "milicia":
                return new FactoryMilicia();
            case "raza":
                return new FactoryRaza();
            case "recurso":
                return new FactoryRecursos();
            case "vehiculo":
                return new FactoryVehiculos();
        }
        return null;
    }
}
    

