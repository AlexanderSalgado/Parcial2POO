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
public class EntrenamientoArqueros implements FactoryArqueros {

    
      public boolean estado=false;
      public int vida=0;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
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
 System.out.println("Se ha construido edificacion entrenamiento Arqueros");
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
    public int vida() {
        return vida;
    }

    @Override
    public boolean eleccion() {
        return estado;
    }

      
    }
    

