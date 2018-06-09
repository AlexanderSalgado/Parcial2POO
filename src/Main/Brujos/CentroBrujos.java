/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Brujos;

import Main.AbstractFactory;
import Main.Arqueros.FactoryArqueros;
import Main.Barbaros.FactoryBarbaros;

/**
 *
 * @author rodol
 */
public class CentroBrujos implements AbstractFactory{

    @Override
    public FactoryBarbaros getBarbaro(String type) {
        return null;
    }

    @Override
    public FactoryArqueros getArqueros(String type) {
        return null;
    }

    @Override
    public FactoryBrujos getBrujos(String type) {
          switch(type){
              case "Escuadron Brujo":
                  return new EscuadronBrujo();
              case "Especialista Brujo":
                  return new EspecialistaBrujo();
              
          }
        return null;
    }

    
    
}
