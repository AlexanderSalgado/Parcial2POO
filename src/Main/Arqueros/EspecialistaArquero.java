/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Arqueros;

/**
 *
 * @author rodol
 */
public class EspecialistaArquero implements FactoryArqueros {
    public int vida=0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
     @Override
    public void atacar() {
        System.out.println("100% Daño");
    }
    
    @Override
    public void defender(){
        System.out.println("100% Daño");
    }
   
}
    
   
