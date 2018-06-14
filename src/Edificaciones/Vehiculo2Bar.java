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
public class Vehiculo2Bar implements Edificaciones {
        int vida = 1000;
    String name = "Vehiculo2Bar";
    int comida, sangre, armas;
    @Override
    public void construir() {
System.out.println("Se esta construyendo un vehiculo2 de Barbaro");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRecurso1() {
        return comida;
    }

    @Override
    public int getRecurso2() {
        return sangre;

    }

    @Override
    public int getRecurso3() {
      return armas;

    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida) {
        this.comida = recu1;
        this.sangre = recu2;
        this.armas = recu3;
        this.vida = vida;
    }
    
}
