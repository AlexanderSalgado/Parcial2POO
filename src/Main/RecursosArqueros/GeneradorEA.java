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
public class GeneradorEA implements FactoryArqueros {
    
    public int vida = 200;
    public int ea;
    public boolean estado= false;
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
       this.estado= estado;
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getEA(){
        return ea;
    }
    
    public void setEA(int mana){
        this.ea = mana;
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
    public boolean entrenar() {
        return estado;
    }

    @Override
    public int vida() {
         return vida;
    }

    @Override
    public int recolectar() {
        int num;
        num=getEA();
        setEA(0);
        return num;
    }

    @Override
    public void generar() {
        setEA(ea+35);
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
