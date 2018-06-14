/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import Main.AbstractFactory;
import Main.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author rodol
 */
public class GuardarEdificaciones {
public ArrayList<Edificaciones> edificio;

    public GuardarEdificaciones() {
        edificio = new ArrayList<>();
    }

    public void CentroBrujos() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centrobrujos = factoryE.getEdificacion("centroBru");
        edificio.add(centrobrujos);
    }
    
    public void CentroArqueros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centroarqueros = factoryE.getEdificacion("centroArq");
        edificio.add(centroarqueros);
    }
    
    public void CentroBarbaros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centrobarbaro = factoryE.getEdificacion("centroBar");
        edificio.add(centrobarbaro);
    }
    
    public void agregarRecolectorOro() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectororo = factoryE.getEdificacion("recolector1A");
        edificio.add(recolectororo);
    }
    
    public void agregarRecolectorMana() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectormana = factoryE.getEdificacion("recolector3A");
        edificio.add(recolectormana);
    }
    
    public void agregarRecolectorEsencia() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectoresencia = factoryE.getEdificacion("recolector2A");
        edificio.add(recolectoresencia);
    }
    
    public void agregarCuartelBrujos() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelbrujos = factoryE.getEdificacion("CuartelBrujos");
        edificio.add(cuartelbrujos);
    }
    
    public void agregarVehi1Bru() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricavehi1bru = factoryE.getEdificacion("vehiculo1Bru");
        edificio.add(fabricavehi1bru);
    }
    
    public void agregarVehi2Bru() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones agregarvehi2bru = factoryE.getEdificacion("vehiculo2Bru");
        edificio.add(agregarvehi2bru);
    }
    
    public void agregarRecolectorSangre() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorsangre = factoryE.getEdificacion("recolector3Bar");
        edificio.add(recolectorsangre);
    }
    
    public void agregarRecolectorComida() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorcomida = factoryE.getEdificacion("recolector1Bar");
        edificio.add(recolectorcomida);
    }
    
    public void agregarRecolectorArmas() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorarmas = factoryE.getEdificacion("recolector3Bar");
        edificio.add(recolectorarmas);
    }
    
    public void agregarCuartelArqueros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelarqueros = factoryE.getEdificacion("cuartelArq");
        edificio.add(cuartelarqueros);
    }
    
    public void agregarVehi1Arq() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones agregarvehi1arq = factoryE.getEdificacion("vehiculo1Arq");
        edificio.add(agregarvehi1arq);
    }
    
    public void agregarVehi2Arq() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones agregarvehi2arq = factoryE.getEdificacion("vehiculo2Arq");
        edificio.add(agregarvehi2arq);
    }
    
    public void agregarRecolectorPociones() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorpociones = factoryE.getEdificacion("recolector2Bru");
        edificio.add(recolectorpociones);
    }
    
    public void agregarRecolectorAlmas() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectoralmas = factoryE.getEdificacion("recolector1Bru");
        edificio.add(recolectoralmas);
    }
    
    public void agregarRecolectorLibros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorlibros = factoryE.getEdificacion("recolector3MU");
        edificio.add(recolectorlibros);
    }
    
    public void agregarCuartelBarbaro() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelbarbaro = factoryE.getEdificacion("CuartelBarbaros");
        edificio.add(cuartelbarbaro);
    }
    
    public void agregarVehi1Bar() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones agregarvehi1bar = factoryE.getEdificacion("Vehiculo1Bar");
        edificio.add(agregarvehi1bar);
    }
    
    public void agregarVeh2Bar() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones agregarvehi2bar = factoryE.getEdificacion("Vehiculo2Bar");
        edificio.add(agregarvehi2bar);
    }
    
    public void mostrarListaEdificaciones(){
        edificio.forEach((edf) -> {
            System.out.println(edf.toString());
        });
        System.out.println("\n");
    }
    
    public Edificaciones getRecursos(){      
        return edificio.get(0);
    }
    
    public boolean verificarEdificacion(String edif){
        int cont = 0, contE = edificio.size();
        boolean esta = false;
        while(cont<contE){
            if(edificio.get(cont).getName().equals(edif)){
                esta = true;
            }
            cont++;
        }
        return esta;
    }
    
    public int contarEdificacion(String edif){
        int cont = 0, contE = edificio.size(), canti = 0;
        while(cont<contE){
            if(edificio.get(cont).equals(edif)){
                canti++;
            }
            cont++;
        }
        return canti;
    }
    
    public int contarTodasEdificaciones(){
        int contE = edificio.size();
        return contE;
    }
}