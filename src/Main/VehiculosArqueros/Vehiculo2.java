/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.VehiculosArqueros;

import Main.Arqueros.FactoryArqueros;

/**
 *
 * @author rodol
 */
public class Vehiculo2 implements FactoryArqueros {
        public boolean estado = false;
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
     public int vida=0;

    public int getVida() {
       return vida;
   }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
        System.out.println("Se ha construido un vehiculo2");
    }

    @Override
    public boolean entrenar() {
        return estado;
    }

    @Override
    public int vida() {
        return vida;
    }

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void generar() {
    }

    @Override
    public boolean estado() {
          if(estado==false){
            setEstado(true);
        }
        else{
            setEstado(false);
        }
        return estado;
    }

    @Override
    public boolean eleccion() {
          return estado;
    }
    
}
