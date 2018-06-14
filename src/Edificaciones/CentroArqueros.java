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
public class CentroArqueros implements Edificaciones {
     int vida = 10000;
    String name = "Centro Mando Arqueros";
    int oro = 800,  mana= 1000, esencia = 600;
   
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
            return "Centro de Mando Arqueros--- Recursos: Oro("+oro+"), Mana(" +mana+ "), Esencia("+esencia+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo el Nexo de los Arqueros ");
    }
    @Override
    public String getName(){
        return name;
    }
}
