/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Arqueros;

import Main.AbstractFactory;
import Main.Barbaros.FactoryBarbaros;
import Main.Brujos.FactoryBrujos;
import Main.RecursosArqueros.GeneradorEA;
import Main.RecursosArqueros.GeneradorMana;
import Main.RecursosArqueros.GeneradorOro;
import Main.VehiculosArqueros.Vehiculo1;
import Main.VehiculosArqueros.Vehiculo2;


/**
 *
 * @author rodol
 */
public class CentroArqueros implements AbstractFactory {

    @Override
    public FactoryBarbaros getBarbaro(String type) {
        return null;
    }

    @Override
    public FactoryArqueros getArqueros(String type) {
        switch (type){
            case "Escuadron Arquero" :
                return new EscuadronArquero();
            case "Especialista Arquero":
                return new EspecialistaArquero();
            case "Vehiculo 1":
                return new Vehiculo1();
             case "Vehiculo 2":
                return new Vehiculo2();
             case "Entrenador":
                return new EntrenamientoArqueros();
            case "Generador de Elixir":
                return new GeneradorEA();
            case "Generador de Gema":
                return new GeneradorMana();
            case "Generador de Oro":
                return new GeneradorOro();
             
        }
        return null;
    }

    @Override
    public FactoryBrujos getBrujos(String type) {
        return null;
    }


    
    
}
