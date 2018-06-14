/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Arqueros.FactoryArqueros;
import Main.CentrodeMando.CentroMando;
import java.util.ArrayList;

/**
 *
 * @author rodol
 */
public class Players {
   
    public int num;
    public CentroMando mando;
    public String raza;
    public ArrayList<FactoryArqueros> recurso1;
    public ArrayList<FactoryArqueros> recurso2;
    public ArrayList<FactoryArqueros> recurso3;
    public ArrayList<FactoryArqueros> vehiculo1;
    public ArrayList<FactoryArqueros> ataque;
    public ArrayList<FactoryArqueros> defensa;
    public ArrayList<FactoryArqueros> vehiculo2;
    public ArrayList<FactoryArqueros> entrenamiento;
    public ArrayList<FactoryArqueros> entrenado;
    public FactoryArqueros[] Lista;

    public Players(){
    }

   /* public Players(int num,String raza,CentroMando mando, ArrayList<FactoryArqueros> recurso1,ArrayList<FactoryArqueros> recurso2,ArrayList<FactoryArqueros> recurso3,ArrayList<FactoryArqueros> vehiculo1,ArrayList<FactoryArqueros> vehiculo2,ArrayList<FactoryArqueros> entrenamiento,ArrayList<FactoryArqueros> ataque) {
        this.num = num;
        this.raza = raza;
        this.mando = mando;
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.ataque= ataque; 
        this.defensa =defensa;
        this.recurso1 = recurso3;
        this.vehiculo1= vehiculo1;
        this.vehiculo2= vehiculo2;
        this.entrenamiento = entrenamiento;
        this.entrenado= entrenado;
        this.lista =lista;
      
       
    }*/

    public Players(int num, String raza, CentroMando mando, ArrayList<FactoryArqueros> recurso1, ArrayList<FactoryArqueros> recurso2, ArrayList<FactoryArqueros> recurso3, ArrayList<FactoryArqueros> entrenamiento, ArrayList<FactoryArqueros> vehiculo1, ArrayList<FactoryArqueros> vehiculo2, ArrayList<FactoryArqueros> entrenado, ArrayList<FactoryArqueros> ataque, ArrayList<FactoryArqueros> defensa, FactoryArqueros[] Lista) {
         this.num = num;
        this.raza = raza;
        this.mando = mando;
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.ataque= ataque; 
        this.defensa =defensa;
        this.recurso1 = recurso3;
        this.vehiculo1= vehiculo1;
        this.vehiculo2= vehiculo2;
        this.entrenamiento = entrenamiento;
        this.entrenado= entrenado;
        this.Lista =Lista;
    }

    public ArrayList<FactoryArqueros> getRecurso1(){
        return recurso1;
    }

    public void SetRecurso1(ArrayList<FactoryArqueros> recurso1) {
        this.recurso1 = recurso1;
    }

    public ArrayList<FactoryArqueros> getRecurso2() {
        return recurso2;
    }

    public void setRe2(ArrayList<FactoryArqueros> recurso2) {
        this.recurso2 = recurso2;
    }

    public ArrayList<FactoryArqueros> getRecurso3() {
        return recurso3;
    }

    public void setRe3(ArrayList<FactoryArqueros> recurso3) {
        this.recurso3 = recurso3;
    }

    public ArrayList<FactoryArqueros> getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenador(ArrayList<FactoryArqueros> entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
    
    public ArrayList<FactoryArqueros> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<FactoryArqueros> ataque) {
        this.ataque = ataque;
    }

    public ArrayList<FactoryArqueros> getVehiculo1() {
        return vehiculo1;
    }

    public void setVehiculo1(ArrayList<FactoryArqueros> vehiculo1) {
        this.vehiculo1 = vehiculo1;
    }

    public ArrayList<FactoryArqueros> getVehiculo2() {
        return vehiculo2;
    }

    public void setVehiculo2(ArrayList<FactoryArqueros> vehiculo2) {
        this.vehiculo2 = vehiculo2;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public ArrayList<FactoryArqueros> getEntrenado(){
        return entrenamiento;
    }
     public void  setEntrenado(ArrayList<FactoryArqueros> entrenado){
        this.entrenamiento = entrenado;
    }
    
    
    
    public CentroMando getMando() {
        return mando;
    }

    public void setMando(CentroMando mando) {
        this.mando = mando;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
     public ArrayList<FactoryArqueros> getDefensa() {
        return defensa;
    }

    public void setDefendiendo(ArrayList<FactoryArqueros> defendiendo) {
        this.defensa = defensa;
    }
    
    
    public FactoryArqueros[] getLista() {
        return Lista;
    }

    public void setLista(FactoryArqueros[] Lista) {
        this.Lista = Lista;
    }
   

    
    
    public int fase(int cont){
        if(cont%2==0){
        System.out.println("Le toca al jugador: "+ (cont%2)+2);
        }
        else{
            System.out.println("Le toca al jugador: "+(cont%2));
        }
        cont=cont+1;
        return cont;
    }

    
    
    
}
    
