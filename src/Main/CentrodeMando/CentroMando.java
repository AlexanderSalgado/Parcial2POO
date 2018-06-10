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
public class CentroMando{
     public int vida=150000;
     public int oro=300;
     public int esenciazul=300;
     public int mana=300;
     public int capacidad1=1000;
     public int capacidad2=5000;
     public int capacidad3=3000;
     public int capacidadx1=10000;
     public int capacidadx2=50000;
     public int capacidadx3=30000;
     public int capacidadx11=5000000;
     public int capacidadx22=2500000;
     public int capacidadx33=1500000;
     

    

     public int getCapacidad1() {
        return capacidad1;
    }

    public void setCapacidad1(int capacidad1) {
        this.capacidad1 = capacidad1;
    }

    public int getCapacidad2() {
        return capacidad2;
    }

    public void setCapacidad2(int capacidad2) {
        this.capacidad2 = capacidad2;
    }

    public int getCapacidad3() {
        return capacidad3;
    }

    public void setCapacidad3(int capacidad3) {
        this.capacidad3 = capacidad3;
    }

     
    public int getEsenciazul() {
        return esenciazul;
    }

    public void setEsenciazul(int esenciazul) {
        this.esenciazul = esenciazul;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    
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

    
    public void level() {
        setCapacidad1(capacidadx1);
        setCapacidad2(capacidadx2);
        setCapacidad3(capacidadx3);
    }
}
    

