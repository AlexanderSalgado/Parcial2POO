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
public class CuartelBrujos implements Edificaciones{
    int vida = 1000;
    String name = "Cuartel Magos";
    int pociones, almas, libros;
   
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
    
    public String toString() {
            return "Cuartel Brujos-> Vida = "+vida;
    }

    @Override
    public void construir(){
        System.out.println("Construyendo entrenamiento de tropas");
    }
    @Override
    public String getName(){
        return name;
    }
}

