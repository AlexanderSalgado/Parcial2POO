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
public class FVehiculo2Arq implements Edificaciones {
        int vida = 1000;
    String name = "FVehiculo2Arq";
    int oro, esencia, mana;
    @Override
    public void construir() {
System.out.println("Se esta construyendo un vehiculo2 de Arqueros");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRecurso1() {
        return oro;
    }

    @Override
    public int getRecurso2() {
        return esencia;

    }

    @Override
    public int getRecurso3() {
      return mana;

    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida) {
        this.oro = recu1;
        this.esencia = recu2;
        this.mana = recu3;
        this.vida = vida;
    }
    
}
