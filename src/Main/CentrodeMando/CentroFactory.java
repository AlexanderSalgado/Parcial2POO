/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.CentrodeMando;

import Main.AbstractFactory;
import Main.Arqueros.FactoryArqueros;
import Main.Barbaros.FactoryBarbaros;
import Main.Brujos.FactoryBrujos;

/**
 *
 * @author rodol
 */

public class CentroFactory implements AbstractFactory{

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
    return null;    
    }

    @Override
    public Mando getMandos(String type) {
    return null;   
    }
    
}