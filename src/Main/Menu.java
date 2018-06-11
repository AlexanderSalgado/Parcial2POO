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
    
    public void menuJugador(){
        int opc=0;
        do{
            System.out.println("BIENVENIDO A RODOLFO'S WORLD");
            System.out.println("\n********JUGADOR********");
            System.out.println("1. Recoger Oro");
            System.out.println("2. Recoger Gemas");
            System.out.println("3. Atacar al rival");
            System.out.println("4. Defender ataque");
            System.out.println("5. Crear generador de ");
            System.out.println("6. Crear generador de "); 
            System.out.println("7. Crear generador de "); 
            System.out.println("8. Crear edificacion para entrenar soldados y escuadrones");
            System.out.println("9. Crear edificación para vehiculos 1");
            System.out.println("10. Crear edificación para vehiculos tipo 2");
            System.out.println("11. Entrenar tropas");
            System.out.println("12. Mejorar centro de Mando");
            System.out.println("13. Fin del turno");
            AbstractFactory factory;
            factory = Recoleccion.getFactory("Magos");
            FactoryArqueros oro = factory.getArqueros("Generador de Oro");
            FactoryArqueros EA = factory.getArqueros("Generador de Elixir");
            FactoryArqueros mana = factory.getArqueros("Generador de Gema");
            
            
            /*if(contador==1){
                if(generador_oro.size()>0){
                    for (int i = 0; i < generador_oro.size(); i++) {
                        oro1=generador_oro.get(i);
                        oro1.generar();
                
                    }
                setContador(0);
                }
                
            }*/
            
            
        
            Scanner leer = new Scanner(System.in);
            
        
        
            
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){    
                case 1:
                    for (int i = 0; i <getPlayer1().getRecurso1().size(); i++) {
                        
                        oro = getPlayer1().getRecurso1().get(i);
                        int num = oro.recolectar();
                        System.out.println("Esto se obtuvo en "+i+" interaccion "+ num);
                        int num1 = getPlayer1().getMando().getOro();
                        int sum = num + num1;
                        getPlayer1().getMando().setOro(sum);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de oro " + getPlayer1().getMando().getOro());
      
                   
                    break;
                case 2:
                    for (int i = 0; i < getPlayer1().getRecurso3().size(); i++) {
                        EA = getPlayer1().getRecurso3().get(i);
                        int num = EA.recolectar();
                        int num1 = getPlayer1().getMando().getEA();
                        int sum = num + num1;
                        getPlayer1().getMando().setEA(sum);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de  EA " + getPlayer1().getMando().getEA());
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros oro1 = factory.getArqueros("Generador de Oro");
                    getPlayer1().getRecurso1().add(oro);
                    //generador_oro.add(oro);
                    System.out.println("Se construyó un generador de oro");
                    break;
                case 6:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros ea = factory.getArqueros("Generador de EA");
                    getPlayer1().getRecurso2().add(EA);
                    //generador_elixir.add(elixir);
                    System.out.println("Se construyó un generador de Elixir");
                    break;
                case 7:
                    factory = Recoleccion.getFactory("Magos");
                    FactoryArqueros mana1 = factory.getArqueros("Generador de Gema");
                    getPlayer1().getRecurso3().add(mana);
                    //generador_gema.add(gema);
                    System.out.println("Se construyó un generador de ea");
                    break;
                case 8:
                    factory = Recoleccion.getFactory("Magos");
                    FactoryArqueros entrena = factory.getArqueros("Entrenador");
                    entrena.estado();
                    getPlayer1().getEntrenamiento().add(entrena);
                    //entrenar.add(entrena);
                    System.out.println("Se construyó una edificación para entrenar");
                    
                    break;
                case 9:
                    factory = Recoleccion.getFactory("Magos");
                    FactoryArqueros veh1 = factory.getArqueros("Vehiculo1");
                    getPlayer1().getVehiculo1().add(veh1);
                    //vehiculo1.add(veh1);
                    System.out.println("Se construyó un vehiculo tipo 1");
                    break;
                    
                case 10:
                    factory = Recoleccion.getFactory("Magos");
                    FactoryArqueros veh2 = factory.getArqueros("Vehiculo2");
                    getPlayer1().getVehiculo2().add(veh2);
                    //vehiculo2.add(veh2);
                    System.out.println("Se construyó un vehiculo tipo 2");
                    break;
                case 11:
                    int cap1=getPlayer1().getMando().getCapacidad1();
                    int cap2=getPlayer1().getMando().getCapacidad2();
                    int cap3=getPlayer1().getMando().getCapacidad3();
                    double ca=cap1+(cap1*0.10); 
                    double ce=cap2+(cap2*0.30); 
                    double ci=cap3+(cap3*0.50); 
                    double sum= (ca+ce+ci);
                    sum=sum*0.25;
                    sum=(int)sum/3;
                    
                    System.out.println(sum);
                    
                    if (getPlayer1().getMando().getOro() >= sum && getPlayer1().getMando().getMana() >= sum && getPlayer1().getMando().getEA() >= sum) {
                        getPlayer1().getMando().level();
                        System.out.println("El valor ahora de Oro es de " + getPlayer1().getMando().getCapacidad1());
                        System.out.println("El valor ahora de Elixir es de " + getPlayer1().getMando().getCapacidad2());
                        System.out.println("El valor ahora de ea es de " + getPlayer1().getMando().getCapacidad3());
                    }
                    else{
                        System.out.println("No dispone de suficientes recursos");
                    }
                    break;
                    
                case 12:
                    int k = 0;
                    int sup=1000;
                    boolean sta = false;
                    factory = Recoleccion.getFactory("Magos");
                    FactoryArqueros entrenad = factory.getArqueros("Entrenador");
                    //sta=getJugador().getEntrenador().get(k).question();
                    System.out.println(getPlayer1().getEntrenamiento().size() > 0);
                    
                    if (getPlayer1().getEntrenamiento().size() > 0) {

                        while (k < getPlayer1().getEntrenamiento().size()) {
                            if (getPlayer1().getEntrenamiento().get(k).eleccion() != true) {
                                k = k + 1;
                            } else {
                                sup = k;
                                k=getPlayer1().getEntrenamiento().size();
                            }

                        }

                        if (sup!=1000) {
                            System.out.println("¿Qué numero de tropa desea entrenar?");
                            System.out.println("1. Escuadron M");
                            System.out.println("2. Merlin");
                            Scanner leer2 = new Scanner(System.in);
                            int op = leer2.nextInt();
                            if (op == 1) {
                                factory = Recoleccion.getFactory("Magos");
                                FactoryArqueros escua = factory.getArqueros("EscuadronM");
                                escua.entrenar();
                                escuadronm.add(escua);
                                getPlayer1().getEntrenamiento().get(sup).estado();
                                System.out.println("Se entrenó un EscuadonM");
                            } else if (op == 2) {
                                if (unicoM[0] == null) { 
                                    factory = Recoleccion.getFactory("Magos");
                                    FactoryArqueros me = factory.getArqueros("Merlin");
                                    unicoM[0] = me;
                                    System.out.println("Se entrenó a Merlin");
                                    getPlayer1().getEntrenamiento().get(sup).estado();
                                } else {
                                    System.out.println("Solo se puede tener a un Merlin entrenado");
                                }
                            } else {
                                System.out.println("No eligió ninguna opción");
                            }
                        } else {
                            System.out.println("No hay edificación para entrenar disponible");
                        }
                    } else {
                        System.out.println("No tiene edificaciones de entrenamiento");
                    }


                    
                    break;
                    
                case 13:
                    for (int i = 0; i < getPlayer1().getRecurso2().size(); i++) {
                        EA = getPlayer1().getRecurso2().get(i);
                        int num = EA.recolectar();
                        int num1 = getPlayer1().getMando().getEA();
                        int sum2 = num + num1;
                        getPlayer1().getMando().setEA(sum2);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Esta recogió y se obtuvo esta cantidad total en el centro de mando de elixir " + getPlayer1().getMando().getEA());
                    for (int i = 0; i < getPlayer1().getRecurso1().size(); i++) {
                        System.out.println("Se hizo la generacion "+i);
                        oro1=getPlayer1().getRecurso1().get(i);
                        oro1.generar();
                
                    }
                    for (int i = 0; i < getPlayer1().getRecurso2().size(); i++) {
                        ea=getPlayer1().getRecurso2().get(i);
                        ea.generar();
                
                    }
                    for (int i = 0; i < getPlayer1().getRecurso3().size(); i++) {
                        mana1=getPlayer1().getRecurso3().get(i);
                        mana1.generar();
                
                    }
                    System.out.println("Tienes "+ getPlayer1().getEntrenamiento().size() + " Para entrenar tropas");
                    System.out.println("Tienes "+ getPlayer1().getVehiculo1().size() + " vehiculo tipo 1");
                    System.out.println("Tienes "+ getPlayer1().getVehiculo2().size() + " vehiculo tipo 2 ");
                    //cont=cont+1;
                    //System.exit(0);
                    break;
                default:
                     System.out.println("");
            }
        }while(opc!=13);       
    }
}

