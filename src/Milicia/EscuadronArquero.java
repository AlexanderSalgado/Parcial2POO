/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;


/**
 *
 * @author rodol
 */
public class EscuadronArquero implements Milicia {
    int vida = 1000, danio = 200;
    String name = "Escuadron Arquero";
    
    @Override
    public String getName(){
        return name;
    }
    
    public String toString(){
        return name+"  Vida = " +vida+ ", Danio = " +danio;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override
    public int getDanio(){
        return danio;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Entrenando escuadron de Arqueros");
    }
    
    @Override
    public void atacar(){
        System.out.println("Escuadron de arqueros atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Escuadron de arqueros defendiendo territorio");
    }


  
}
    
