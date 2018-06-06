/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Parcial2 {

    public static void main(String[] args) {
      int cont=0;
          int codigo;
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 1 si es el jugador 1");
        codigo=leer.nextInt();
        Players player1=new Players(codigo);
        System.out.println("Ingrese 2 si es el jugador 2");
        codigo=leer.nextInt();
        Players player2=new Players(codigo);
        
        
        
    }
    
}