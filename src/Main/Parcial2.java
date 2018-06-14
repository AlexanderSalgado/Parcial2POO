/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Arqueros.FactoryArqueros;
import Main.CentrodeMando.CentroMando;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodol
 */

public class Parcial2 {
public static void main(String[] args) {
        int cont=0;
        CentroMando mando1=new CentroMando();
        CentroMando mando2=new CentroMando();
        ArrayList<FactoryArqueros> genoro=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> geneal=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genmana=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> entre=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> ve1=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> ve2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> atac=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> entrenadas=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> defendiendo=new ArrayList<FactoryArqueros>();
        FactoryArqueros[] array=new FactoryArqueros[1];
        ArrayList<FactoryArqueros> genoro2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genel2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> gengem2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> entre2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> ve12=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> ve22=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> atac2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> entrenadas2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> defendiendo2=new ArrayList<FactoryArqueros>();
        FactoryArqueros[] Lista=new FactoryArqueros[1];
        Scanner leer = new Scanner(System.in);
        System.out.println("        ****BIENVENIDO A RODOLFO'S WORDL*******");
        System.out.println("Escriba el nombre de la raza que desea que raza eligirá entre: ");
        System.out.println("       Arqueros     Barbaros     Brujos");
        String raza;
        raza=leer.next();
        
        while(!raza.equalsIgnoreCase("Arqueros")  && !raza.equalsIgnoreCase("Barbaros") && !raza.equalsIgnoreCase("Brujos")) {
            System.out.println("Por favor ingrese una raza valida para el jugador 1");
            raza=leer.next();
        }
        
        Players player1=new Players( 1 , raza, mando1,genoro,geneal,genmana,entre,ve1,ve2,entrenadas,atac,defendiendo,Lista);
        System.out.println("Ingrese que raza eligirá entre: ");
        System.out.println("       Arqueros     Barbaros     Brujos");
        raza=leer.next();
         while(!raza.equalsIgnoreCase("Arqueros")  && !raza.equalsIgnoreCase("Barbaros") && !raza.equalsIgnoreCase("Brujos")) {
            System.out.println("Por favor ingrese una raza valida para el jugador 2");
            raza=leer.next();
        }
        
        int contador=1;
        Players player2=new Players(2, raza,mando2,genoro2,genel2,gengem2,entre2,ve12,ve22, entrenadas2,atac2,defendiendo2,Lista);
        Menu menu = new Menu(contador, player1, player2);
        Menu menu2 = new Menu(contador, player2, player1);
        System.out.println("La raza del jugador "+ player1.getNum()+ " es "+ player1.getRaza());
        System.out.println("La raza del jugador "+ player2.getNum()+ " es "+ player2.getRaza());
        while(cont!=-1){
            if(cont%2==0){  
                menu.SubMenu();
                menu.menuJugador();
                cont=player1.fase(cont);
            }
            else{ 
                menu2.SubMenu();
                menu2.menuJugador();
                cont=player1.fase(cont);
            }
        }
    }
    
}   