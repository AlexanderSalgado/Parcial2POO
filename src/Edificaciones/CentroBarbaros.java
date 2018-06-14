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
public class CentroBarbaros implements Edificaciones{
     int vida = 10000;
    String name = "Centro Mando Barbaros";
    int sangre = 800,  comida= 1000, armas = 600;
   
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
            return "Centro de Mando Barbaros--- Recursos: Sangre("+sangre+"), Comida(" +comida+ "), Armas("+armas+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo el Nexo de los Barbaros ");
    }
    @Override
    public String getName(){
        return name;
    }
}
