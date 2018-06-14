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
public class RecolectorLibros implements Edificaciones {
     int vida = 1000;
    String name = "Recolector Libros";
    int almas, pociones, libros=0;
   
    @Override
    public int getRecurso1(){
        return almas;
    }
    
    @Override
    public int getRecurso2(){
        return pociones;
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
        this.almas = recu1;
        this.pociones = recu2;
        this.libros = recu3;
        this.vida = vida;
    }
    
    public String toString() {
            return "Recursos: Libros("+libros+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo recolector de recurso 3  de los BRUJOS");
    }
    @Override
    public String getName(){
        return name;
    }
}
