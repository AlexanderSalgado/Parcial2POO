/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

/**
 *
 * @author rodol
 */
public class Barbaro implements Raza{
    String raza = "barbaros";
    
    @Override
    public void seleccionar(){
        System.out.println("Conocemos la tecnologia actual.");
    }
    @Override
    public String mostrarRaza(String raza){
        return raza;
    }
    
}
