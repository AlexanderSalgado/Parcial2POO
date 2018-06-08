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
    
     public int getVida() {
        return vida;
    }

    public void setVida(int Vida) {
        this.vida = Vida;
    }
    

    public int getOro() {
        return oro;
    }

    public void setOro(int Oro) {
        this.oro = Oro;
    }
    

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
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
        setOro(oro+30);
    }

    @Override
    public void entrenar() {
    }

  
    
}
