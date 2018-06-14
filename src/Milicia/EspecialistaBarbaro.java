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
public class EspecialistaBarbaro implements Milicia{
    
     int vida = 1500, danio = 700;
    String name = "Especialista Arquero";
    
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
        System.out.println("Entrenando especialista Arquero");
    }
    
    @Override
    public void atacar(){
        System.out.println("Especialista Barbaro atacando al objetivo");
    }
    
    @Override
    public void defender(){
        System.out.println("Especialista Arquero defendiendo territorio");
    }
}
    

