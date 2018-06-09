/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Arqueros.CentroArqueros;
import Main.Barbaros.CentroBarbaro;
import Main.Brujos.CentroBrujos;

/**
 *
 * @author rodol
 */
public class Recoleccion {
        
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Arqueros":
                return new CentroArqueros();
            case "Barbaros":
                return new CentroBarbaro();
            case "Brujos":
                return new CentroBrujos();
        }
        return null;
    }
}

