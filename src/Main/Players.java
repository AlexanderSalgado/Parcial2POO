/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author rodol
 */
public class Players {
   
    public int num;
    
    public Players(){
    }

    public Players(int num) {
        this.num = num;
    }
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int fase(int cont){
        System.out.println("Es turno del jugador "+ (cont%2));
        cont=cont+1;
        return cont;
    }
    
    
    
}
    
