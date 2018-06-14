/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author rodol
 */
public interface Vehiculos {
   public void armar();
    public String getName();
    public int getVida();
    public void actualizarVida(int vida);
    public int getDanio(); 
}
