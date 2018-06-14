/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Main.AbstractFactory;
import Main.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author rodol
 */
    public class GuardarVehiculos {
    public ArrayList<Vehiculos> vehiculo;

    public GuardarVehiculos() {
        vehiculo = new ArrayList<>();
    }

    public void FVehiculo1Bru() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos escoba = factoryV.getVehiculo("Vehiculo1Br");
        vehiculo.add(escoba);
    }
    
    public void FVehiculo2Bru() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos auto = factoryV.getVehiculo("Vehiculo2Br");
        vehiculo.add(auto);
    }
    
    public void FVehiculo1Bar() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos nave = factoryV.getVehiculo("Vehiculo1Bar");
        vehiculo.add(nave);
    }
    
    public void FVehiculo2Bar() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos jugger = factoryV.getVehiculo("Vehiculo2Bar");
        vehiculo.add(jugger);
    }
    
    public void FVehiculo1Arq() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos avioneta = factoryV.getVehiculo("Vehiculo1Arq");
        vehiculo.add(avioneta);
    }
    
    public void FVehiculo2Arq() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos tanque = factoryV.getVehiculo("Vehiculo2Arq");
        vehiculo.add(tanque);
    }
    
    public void mostrarListaVehiculos(){
        vehiculo.forEach((vhc) -> {
            System.out.println(vhc.toString());
        });
        System.out.println("\n");

    } 
    }

   