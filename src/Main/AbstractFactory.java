/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Edificaciones.Edificaciones;
import Milicia.Milicia;
import Raza.Raza;
import Recursos.Recursos;
import Vehiculos.Vehiculos;


/**
 *
 * @author rodol
 */
public interface AbstractFactory {
   Edificaciones getEdificacion(String type);
   Raza getRaza(String type);
   Recursos getRecurso(String type);
   Vehiculos getVehiculo(String type);
   Milicia getMilicia(String type);
}
