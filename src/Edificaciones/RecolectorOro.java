/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author rodol
 */
public class RecolectorOro implements Edificaciones {
    int vida = 1000;
    String name = "Recolector Oro";
    int oro=0, mana, esencia;
   
    @Override
    public int getRecurso1(){
        return oro;
    }
    
    @Override
    public int getRecurso2(){
        return mana;
    }
    
    @Override
    public int getRecurso3(){
        return esencia;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida){
        this.oro = recu1;
        this.mana = recu2;
        this.esencia = recu3;
        this.vida = vida;
    }
    
    public String toString() {
            return " Recursos: Oro("+oro+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo recolector de recurso 1 de la raza Arqueros");
    }
    @Override
    public String getName(){
        return name;
    }
}

