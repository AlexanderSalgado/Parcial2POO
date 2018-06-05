/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Barbaros;

import Main.AbstractFactory;
import Main.Arqueros.FactoryArqueros;
import Main.Brujos.FactoryBrujos;
import Main.CentrodeMando.Mando;

/**
 *
 * @author rodol
 */
public class CentroBarbaro implements AbstractFactory {

    @Override
    public FactoryBarbaros getBarbaro(String type) {
        switch (type){
            case "Escuadron Barbaro":
                return new EscuadronBarbaro();
            case "Especialista Barbaro":
                return new EspecialistaBarbaro();
        }
        return null;
    }

    @Override
    public FactoryArqueros getArqueros(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FactoryBrujos getBrujos(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mando getMandos(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
