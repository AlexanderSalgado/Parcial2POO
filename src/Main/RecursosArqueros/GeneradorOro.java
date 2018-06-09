/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.RecursosArqueros;
import Main.Arqueros.FactoryArqueros;



/**
 *
 * @author rodol
 */
public class GeneradorOro implements FactoryArqueros {
    
    public int vida=200;
    public int oro;
    public boolean estado=false;
    
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

     public int getOro() {
        return oro;
    }

    public void setOro(int Oro) {
        this.oro = Oro;
    }
    
    
     public int getVida() {
        return vida;
    }

    public void setVida(int Vida) {
        this.vida = Vida;
    }
     
    
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void construir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recolectar() {
        int num;
        num=getOro();
        setOro(0);
        return num;
    }

    @Override
    public void generar() {
        
           setOro(oro+50);
    }

    @Override
    public boolean entrenar() {
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
    public void vida() {
    }
    
   
    
}
