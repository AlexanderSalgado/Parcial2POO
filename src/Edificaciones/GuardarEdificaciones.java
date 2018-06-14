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
        Edificaciones centromandomago = factoryE.getEdificacion("CentroBrujos");
        edificio.add(centromandomago);
    }
    
    public void CentroBarbaros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centromandodark = factoryE.getEdificacion("CentroBarbaros");
        edificio.add(centromandodark);
    }
    
    public void CentroArqueros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centromandomuggle = factoryE.getEdificacion("CentroArqueros");
        edificio.add(centromandomuggle);
    }
    
    public void RecolectorOro() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorgaleon = factoryE.getEdificacion("recolector1A");
        edificio.add(recolectorgaleon);
    }
    
    public void RecolectorMana() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorsickle = factoryE.getEdificacion("recolector2A");
        edificio.add(recolectorsickle);
    }
    
    public void RecolectorEscencia() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorknut = factoryE.getEdificacion("recolector3A");
        edificio.add(recolectorknut);
    }
    
    public void CuartelArqueros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelmago = factoryE.getEdificacion("cuartelArq");
        edificio.add(cuartelmago);
    }
    
    public void Vehiculo1Arq() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricaescoba = factoryE.getEdificacion("Vehiculo1Arq");
        edificio.add(fabricaescoba);
    }
    
    public void Vehiculo2Arq() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricaauto = factoryE.getEdificacion("Vehiculo1Arq");
        edificio.add(fabricaauto);
    }
    
    public void RecolectorComida() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorsangre = factoryE.getEdificacion("recolector1Bar");
        edificio.add(recolectorsangre);
    }
    
    public void RecolectorSangre() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones red = factoryE.getEdificacion("recolector2Bar");
        edificio.add(red);
    }
    
    public void RecolectorArmas() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorveneno = factoryE.getEdificacion("recolector3Bar");
        edificio.add(recolectorveneno);
    }
    
    public void CuartelBarbaros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuarteldark = factoryE.getEdificacion("CuartelBarbaros");
        edificio.add(cuarteldark);
    }
    
    public void vehiculo1Bru() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricanave = factoryE.getEdificacion("Vehiculo1Bru");
        edificio.add(fabricanave);
    }
    
    public void vehiculo2Bru() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricajuggernaut = factoryE.getEdificacion("Vehiculo2Bru");
        edificio.add(fabricajuggernaut);
    }
    
    public void RecolectorAlmas() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectordinero = factoryE.getEdificacion("recolector1Bru");
        edificio.add(recolectordinero);
    }
    
    public void RecolectorPociones() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorcredito = factoryE.getEdificacion("recolector2Bru");
        edificio.add(recolectorcredito);
    }
    
    public void RecolectorLibros() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorcupon = factoryE.getEdificacion("recolector3Bru");
        edificio.add(recolectorcupon);
    }
    
    public void CuartelBrujos() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelmuggle = factoryE.getEdificacion("CuartelBrujos");
        edificio.add(cuartelmuggle);
    }
    
    public void Vehiculo1Bar() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricaavioneta = factoryE.getEdificacion("Vehiculo1Bar");
        edificio.add(fabricaavioneta);
    }
    
    public void Vehiculo2Bar() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricatanque = factoryE.getEdificacion("Vehiculo2Bar");
        edificio.add(fabricatanque);
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

    public void Vehiculo1Bru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Vehiculo2Bru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}