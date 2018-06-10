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
public class EscuadronArquero implements FactoryArqueros {
     public boolean estado= false;
    public int vida=0;

    public int getVida() {
        return vida;
    }
    
     public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }
     @Override
    public void atacar() {
        System.out.println("% Daño");
    }
    @Override
    public void defender(){
        System.out.println("% de daño");
    }

      @Override
    public int vida() {
        return vida;
    }
    
    @Override
    public void construir() {
    }

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void generar() {
    }

    @Override
    public boolean entrenar() {
          if(estado==false){
            setEstado(true);
        }
        else{
            setEstado(false);
        }
        return estado;
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
    
