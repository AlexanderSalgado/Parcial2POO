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
public class CentroBrujos implements Edificaciones {
     int vida = 10000;
    String name = "Centro Mando Brujo";
    int pociones = 800,  almas= 1000, libros = 600;
   
    @Override
    public int getRecurso1(){
        return pociones;
    }
    
    @Override
    public int getRecurso2(){
        return almas;
    }
    
    @Override
    public int getRecurso3(){
        return libros;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida){
        this.pociones = recu1;
        this.almas = recu2;
        this.libros = recu3;
        this.vida = vida;
    }
    
     @Override
    public String toString() {
            return "Centro de Mando Brujos--- Recursos: Pociones("+pociones+"), Almas(" +almas+ "), Libros("+libros+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo el Nexo de los Brujos ");
    }
    @Override
    public String getName(){
        return name;
    }
    
}
