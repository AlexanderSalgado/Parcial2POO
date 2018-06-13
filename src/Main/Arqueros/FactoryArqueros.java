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
public interface FactoryArqueros{
    void atacar();
    void defender();
    void construir();
    boolean entrenar();
    boolean eleccion();
    int vida();
    int recolectar();
    void generar();
    boolean estado();
    int nombre(); 
    int fase();
    int modificarvida(int valor);
    int lista();
    int lugar();
    void modificarlista(int num);
    public void modificarposicion(int pos);
    public int posicion();
    public boolean pregunta();
    

   
    
    
    
}

