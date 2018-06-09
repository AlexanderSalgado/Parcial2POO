/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Arqueros.FactoryArqueros;
import Main.Barbaros.FactoryBarbaros;
import Main.Brujos.FactoryBrujos;
/**
 *
 * @author rodol
 */
public interface AbstractFactory {
    
   FactoryBarbaros getBarbaro(String type);
   FactoryArqueros getArqueros(String type);
   FactoryBrujos getBrujos(String type);
}
