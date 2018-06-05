/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.CentrodeMando;

/**
 *
 * @author rodol
 */
public class CentroMando extends CentroFactory{
     public int vida;
     public int oro;
     public int elixir;
     public int esenciazul;
     public int fuego;

    
     public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
     public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }
     public int getGema() {
        return esenciazul;
    }

    public void setEsencia(int esenciazul) {
        this.esenciazul = esenciazul;
    }
    
     public int getFuego() {
        return fuego;
    }

    public void setFuego(int fuego ) {
        this.fuego = fuego;
    }
    
    public void level() {
        System.out.println("1000 de danio");
    }
}
    

