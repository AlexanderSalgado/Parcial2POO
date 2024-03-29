/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import Main.AbstractFactory;
import Milicia.Milicia;
import Raza.Raza;
import Recursos.Recursos;
import Vehiculos.Vehiculos;

/**
 *
 * @author rodol
 */
public class FactoryEdificacion implements AbstractFactory {

    @Override
    public Edificaciones getEdificacion(String type) {
         switch (type){
            case "recolector1A":
                return new RecolectorOro();
            case "recolector2A":
                return new RecolectorEscencia();
            case "recolector3A":
                return new RecolectorMana();
            case "vehiculo1Arq":
                return new FVehiculo1Arq();
            case "vehiculo2Arq":
                return new FVehiculo2Arq();
            case "cuartelArq":
                return new CuartelArqueros();
            case "centroArq":
                return new CentroArqueros();
            case "recolector1Bar":
                return new RecolectorComida();
            case "recolector2Bar":
                return new RecolectorSangre();
            case "recolector3Bar":
                return new RecolectorArmas();
            case "Vehiculo1Bar":
                return new FVehiculo1Bar();
            case "Vehiculo2Bar":
                return new FVehiculo2Bar();
            case "CuartelBarbaros":
                return new CuartelBarbaros();
            case "centroBar":
                return new CentroBarbaros();
            case "recolector1Bru":
                return new RecolectorAlmas();
            case "recolector2Bru":
                return new RecolectorPociones();
            case "recolector3Bru":
                return new RecolectorLibros();
            case "vehiculo1Bru":
                return new FVehiculo1Bru();
            case "vehiculo2Bru":
                return new FVehiculo2Bru();
            case "CuartelBrujos":
                return new CuartelBrujos();
            case "centroBru":
                return new CentroBrujos();
        }
        return null;
    }

    @Override
    public Raza getRaza(String type) {
        return null;
    }

    @Override
    public Recursos getRecurso(String type) {
        return null;
    }

    @Override
    public Vehiculos getVehiculo(String type) {
        return null;
    }

    @Override
    public Milicia getMilicia(String type) {
        return null;
    }

    
    
}
