/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Arqueros.FactoryArqueros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Menu {
    
     public ArrayList<FactoryArqueros> escuadronm=new ArrayList<FactoryArqueros>();
    FactoryArqueros[] unicoM=new FactoryArqueros[1];
    public int contador;
    public Players player1;
    public Players player2;
    public static Menu menu;
    
     public Menu() {
    }

    public Menu(int contador, Players player1, Players player2) {
        this.contador = contador;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Players getPlayer1() {
        return player1;
    }

    public void setPlayer1(Players player1) {
        this.player1 = player1;
    }
    
    public Players getPlayer2() {
        return player2;
    }

    public void setPlayer2(Players player2) {
        this.player2 = player2;
    }
    
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
}
    
    
