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
       String raza;
        CentroMando mando1=new CentroMando();
        CentroMando mando2=new CentroMando();
        ArrayList<FactoryArqueros> genoro=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genel=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genea=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> entre=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> vehi1=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> vehi2=new ArrayList<FactoryArqueros>();
       
        ArrayList<FactoryArqueros> entrenadas=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genoro2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genel2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> genea2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> entre2=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> vehi12=new ArrayList<FactoryArqueros>();
        ArrayList<FactoryArqueros> vehi22=new ArrayList<FactoryArqueros>();
        
        ArrayList<FactoryArqueros> entrenadas2=new ArrayList<FactoryArqueros>();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que raza eligirá"); 
        raza=leer.next();
        
        /*while(raza!="Magos") {
            System.out.println("Ingrese que raza eligirá");
            raza=leer.next();
        }*/
        
        Players jugador1=new Players( 1 , raza, mando1,genoro,genel,genea,entre,vehi1,vehi2,entrenadas);
        System.out.println("Ingrese que raza eligirá");
        raza=leer.next();
        /*while(raza!="Gigantes") {
            System.out.println("Ingrese que raza eligirá");
            raza=leer.next();
        }*/
        int contador=1;
        Players jugador2=new Players(2, raza,mando2,genoro2,genel2,genea2,entre2,vehi12,vehi22, entrenadas2);
        Menu menu = new Menu(contador, jugador1, jugador2);
        Menu menu2 = new Menu(contador, jugador2, jugador1);
        
        System.out.println("La raza del jugador "+ jugador1.getNum()+ " es "+ jugador1.getRaza());
        System.out.println("La raza del jugador "+ jugador2.getNum()+ " es "+ jugador2.getRaza());
        while(cont!=-1){
            if(cont%2==0){  
                menu.menuJugador();
                cont=jugador1.fase(cont);
            }
            else{ 
                menu2.menuJugador();
                cont=jugador2.fase(cont);
            }
        }
}
}
        
    
    