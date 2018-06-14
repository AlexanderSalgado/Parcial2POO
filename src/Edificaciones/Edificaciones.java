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
public interface Edificaciones {
     public void construir();
    public String getName();
    public int getRecurso1();
    public int getRecurso2();
    public int getRecurso3();
    public int getVida();
    public void actualizarRecursos(int recu1,int recu2,int recu3, int vida);
}
