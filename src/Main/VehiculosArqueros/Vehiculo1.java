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
public class Vehiculo1 implements FactoryArqueros {
   
    public boolean estado = false;
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
        System.out.println("Se ha construido un vehiculo1");
    }

    @Override
    public boolean entrenar() {
        return estado;
    }

    @Override
    public void vida() {
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
    
}
