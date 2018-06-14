/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Main.AbstractFactory;
import Main.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author rodol
 */
public class GuardarMilicia {
        public ArrayList<Milicia> milicia;

    public GuardarMilicia() {
        milicia = new ArrayList<>();
    }

    public void EscuadronBrujos() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia escuadronbrujos = factoryM.getMilicia("escuadronbrujos");
        milicia.add(escuadronbrujos);
    }
    
    public void EspecialistaBrujos() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia especialistabrujos = factoryM.getMilicia("especialistabrujos");
        milicia.add(especialistabrujos);
    }
   
    public void EscuadronBarbaros() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia escuadrondark = factoryM.getMilicia("escuadrondark");
        milicia.add(escuadrondark);
    }
    
    public void EspecialistaBarbaros() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia especialistabarbaros = factoryM.getMilicia("especialistabarbaros");
        milicia.add(especialistabarbaros);
    }
    
    public void EscuadronArqueros() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia escuadronarqueros = factoryM.getMilicia("escuadronarqueros");
        milicia.add(escuadronarqueros);
    }
    
    public void EspecialistaArqueros() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia especialistaarqueros = factoryM.getMilicia("especialistaarqueros");
        milicia.add(especialistaarqueros);
    }
    
    public void mostrarListaMilicia(){
        milicia.forEach((mca) -> {
            System.out.println(mca.toString());
        });
        System.out.println("\n");

    }
    
    public boolean verificarTropas(String tropa){
        int cont = 0; int contM = milicia.size();
        boolean esta = false;
        while(cont<contM){
            if(milicia.get(cont).getName().equals(tropa)){
                esta = true;
            }
            cont++;
        }
        return esta;
    }

    public void EscuadronBarbaro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
