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
public class RecolectorSangre implements Edificaciones {
    int vida = 1000;
    String name = "Recolector Sangre";
    int sangre=0, comida, armas;
   
    @Override
    public int getRecurso1(){
        return sangre;
    }
    
    @Override
    public int getRecurso2(){
        return comida;
    }
    
    @Override
    public int getRecurso3(){
        return armas;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida){
        this.sangre = recu1;
        this.comida = recu2;
        this.armas = recu3;
        this.vida = vida;
    }
    
    public String toString() {
            return "Recolector Sangre-> Recursos: Sangre("+sangre+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo recolector de recurso 1 de los BARBAROS");
    }
    @Override
    public String getName(){
        return name;
    }
}
