/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Players {
   
    private String nombre, nombreRaza;
    private int n;
    int raza;
    
    public void introduccion(){
        System.out.println("BIENVENIDO A RODOLFOS WORLD");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
    
    public void CreadorJugador(){
        AbstractFactory factoryR;
        factoryR =  FactoryProducer.getFactory("raza");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Elige tu raza: ");
        System.out.println("1. Brujos");
        System.out.println("2. Arqueros");
        System.out.println("3. Barbaros");
        System.out.println("Eleccion: ");
        raza = leer.nextInt();
        
        
        if(raza == 1){
            nombreRaza = "brujos";
        }
        else if(raza == 2){
            nombreRaza = "arqueros";
                    }
        else if(raza == 3){
            nombreRaza = "barbaros";
        }
        
    }
    
    
    
    
}
    
