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
public class Vehiculo1Bru implements Edificaciones {
        int vida = 1000;
    String name = "Vehiculo1Bru";
    int almas, pociones, libros;
    @Override
    public void construir() {
System.out.println("Se esta construyendo un vehiculo1 de brujo");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRecurso1() {
        return almas;
    }

    @Override
    public int getRecurso2() {
        return pociones;

    }

    @Override
    public int getRecurso3() {
      return libros;

    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida) {
        this.almas = recu1;
        this.pociones = recu2;
        this.libros = recu3;
        this.vida = vida;
    }
    
}
