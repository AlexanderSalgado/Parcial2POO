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
      public int vida=20;
      public int posicion = 0;
      public int lista = 0;

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

    @Override
    public int nommbre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int fase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificarvida(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarlista(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarpocision(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    }
    

