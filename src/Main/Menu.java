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
    FactoryArqueros[] lista=new FactoryArqueros[1];
    public int contador;
    public Players Player1;
    public Players Player2;
    public static Menu menu;
    
     public Menu() {
    }

    public Menu(int contador, Players Player1, Players Player2) {
        this.contador = contador;
        this.Player1 = Player1;
        this.Player2 = Player2;
    }

    public Players getPlayer2() {
        return Player2;
    }

    public void setPlayer2(Players Player2) {
        this.Player2 = Player2;
    }
    
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     
    public Players getPlayer1() {
        return Player1;
    }

    public void setJugador(Players Player1) {
        this.Player1 = Player1;
    }
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
    public void SubMenu(){
        AbstractFactory factory;
        factory = Recoleccion.getFactory("Arqueros");
        FactoryArqueros oro = factory.getArqueros("Generador de Oro");
        FactoryArqueros esencia = factory.getArqueros("Generador de Esencia");
        FactoryArqueros mana = factory.getArqueros("Generador de Mana");
        FactoryArqueros es2 = factory.getArqueros("Escuadron Arquero");
        for (int i = 0; i < getPlayer1().getRecurso2().size(); i++) {
                        esencia=getPlayer1().getRecurso2().get(i);
                        esencia.generar();
                
                    }
        for (int i = 0; i < getPlayer1().getRecurso2().size(); i++) {
            esencia = getPlayer1().getRecurso2().get(i);
            int num = esencia.recolectar();
                        int num1 = getPlayer1().getMando().getEA();
                        int sum2 = num + num1; 
                        getPlayer1().getMando().setEA(sum2);
                        System.out.println("Esta esta cantidad de oro " + getPlayer1().getMando().getOro());

                    }
                    System.out.println("Esta recogió y se obtuvo esta cantidad total en el centro de mando de elixir " + getPlayer1().getMando().getEA());
                    for (int i = 0; i < getPlayer1().getRecurso1().size(); i++) {
                        System.out.println("Se hizo la generacion "+i);
                        oro=getPlayer1().getRecurso1().get(i);
                        oro.generar();
                
                    }
                    
                    for (int i = 0; i < getPlayer1().getRecurso3().size(); i++) {
                        mana=getPlayer1().getRecurso3().get(i);
                        mana.generar();
                
                    }
                    for (int i = 0; i < getPlayer1().getAtaque().size(); i++) {
                        es2 = getPlayer1().getAtaque().get(i);
                        if (es2.lista() == 1) {
                            int pos = es2.posicion();
                            getPlayer2().getRecurso1().get(pos).modificarvida(5);
                            if (getPlayer2().getRecurso1().get(pos).vida() < 1) {
                                System.out.println("Se destruyó el generador " + pos);
                                getPlayer2().getRecurso1().remove(pos);
                                System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                                getPlayer1().getEntrenado().add(es2);
                                getPlayer1().getAtaque().remove(i);

                            } else {
                                System.out.println("Sigue con vida el generador de oro numero " + pos);
                            }
                        }
                        else if(es2.lista()==2){
                            int pos=es2.posicion();
                            getPlayer2().getRecurso2().get(pos).modificarvida(5);
                            if (getPlayer2().getRecurso2().get(pos).vida() < 1) {
                                System.out.println("Se destruyó el generador " + pos);
                                getPlayer2().getRecurso2().remove(pos);
                                System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                                getPlayer1().getEntrenado().add(es2);
                                getPlayer1().getAtaque().remove(i);

                            } else {
                                System.out.println("Sigue con vida el generador de elixir numero " + pos);
                            }
                        }
                        else if(es2.lista()==3){
                            int pos=es2.posicion();
                            getPlayer2().getRecurso3().get(pos).modificarvida(5);
                            if (getPlayer2().getRecurso3().get(pos).vida() < 1) {
                                System.out.println("Se destruyó el generador " + pos);
                                getPlayer2().getRecurso3().remove(pos);
                                System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                                getPlayer1().getEntrenado().add(es2);
                                getPlayer1().getAtaque().remove(i);

                            } else {
                                System.out.println("Sigue con vida el generador de gemas número " + pos);
                            }
                        }
                        else if(es2.lista()==4){
                            int pos=es2.posicion();
                            getPlayer2().getEntrenamiento().get(pos).modificarvida(5);
                            if (getPlayer2().getEntrenamiento().get(pos).vida() < 1) {
                                System.out.println("Se destruyó el  edificio de entrenamiento " + pos);
                                getPlayer2().getEntrenamiento().remove(pos);
                                System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                                getPlayer1().getEntrenado().add(es2);
                                getPlayer1().getAtaque().remove(i);

                            } else {
                                System.out.println("Sigue con vida el edificio de entrenamiento numero " + pos);
                            }
                        }
                        else if(es2.lista()==5){
                            int pos=es2.posicion();
                            getPlayer2().getVehiculo1().get(pos).modificarvida(5);
                            if (getPlayer2().getVehiculo1().get(pos).vida() < 1) {
                                System.out.println("Se destruyó el  edificio de vehiculos tipo 1 numero " + pos);
                                getPlayer2().getVehiculo1().remove(pos);
                                System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                                getPlayer1().getEntrenado().add(es2);
                                getPlayer1().getAtaque().remove(i);

                            } else {
                                System.out.println("Sigue con vida el edificio de vehiculo tipo 1 numero " + pos);
                            }
                        }
                        else if(es2.lista()==6){
                            int pos=es2.posicion();
                            getPlayer2().getVehiculo2().get(pos).modificarvida(5);
                            if (getPlayer2().getVehiculo2().get(pos).vida() < 1) {
                                System.out.println("Se destruyó el  edificio de vehiculos tipo 2 numero " + pos);
                                getPlayer2().getVehiculo2().remove(pos);
                                System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                                getPlayer1().getEntrenado().add(es2);
                                getPlayer1().getAtaque().remove(i);

                            } else {
                                System.out.println("Sigue con vida el edificio de vehiculo tipo 2 numero " + pos);
                            }
                        }
                        else if(es2.lista()==7){
                            
                        }
                    }
        
    }
    
    public void menuJugador(){
        int opc=0;
        do{
            System.out.println("El Oro a su disposicion es "+getPlayer1().getMando().getOro());
            System.out.println("El Elixir a su disposicion es "+getPlayer1().getMando().getEA());
            System.out.println("Las Gemas a su disposicion es "+getPlayer1().getMando().getMana());
            System.out.println("\n********JUGADOR********");
            System.out.println("1. Recoger Oro");
            System.out.println("2. Recoger Mana");
            System.out.println("3. Atacar al rival");
            System.out.println("4. Defender ataque");
            System.out.println("5. Crear generador de Oro");
            System.out.println("6. Crear generador de Esencia"); 
            System.out.println("7. Crear generador de Mana"); 
            System.out.println("8. Crear edificacion para entrenar soldados y escuadrones");
            System.out.println("9. Crear edificación para vehiculos 1");
            System.out.println("10. Crear edificación para vehiculos tipo 2");
            System.out.println("11. Mejorar centro de Mando");
            System.out.println("12. Entrenar tropas");
            System.out.println("13. Fin del turno");
            AbstractFactory factory;
            factory = Recoleccion.getFactory("FactoryArqueross");
            FactoryArqueros oro1 = factory.getArqueros("Generador de Oro");
            FactoryArqueros ea1 = factory.getArqueros("Generador de Esencia");
            FactoryArqueros mana1 = factory.getArqueros("Generador de Mana");
            FactoryArqueros es2 = factory.getArqueros("Escuadron Arquero");

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
                        
                        oro1 = getPlayer1().getRecurso1().get(i);
                        int num = oro1.recolectar();
                        System.out.println("Esto se obtuvo en "+i+" interaccion "+ num);
                        int num1 = getPlayer1().getMando().getOro();
                        int sum = num + num1;
                        getPlayer1().getMando().setOro(sum);
                  
                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de oro " + getPlayer1().getMando().getOro());
                    break;
                case 2:
                    for (int i = 0; i < getPlayer1().getRecurso3().size(); i++) {
                        mana1 = getPlayer1().getRecurso3().get(i);
                        int num = mana1.recolectar();
                        int num1 = getPlayer1().getMando().getMana();
                        int sum = num + num1;
                        getPlayer1().getMando().setMana(sum);
                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de  mana " + getPlayer1().getMando().getMana());
                    break;
                case 3:
                    if (getPlayer1().getVehiculo2().size() > 0 || getPlayer1().getVehiculo1().size() > 0) {

                        if (getPlayer1().getEntrenado().size() > 0 || getPlayer1().getLista()[0] != null) {
                            System.out.println("¿Que desea atacar del rival?");
                            System.out.println("1. Generador de Oro");
                            System.out.println("2. Generador de Esencia");
                            System.out.println("3. Generador de Mana");
                            System.out.println("4. Edificación de entrenamiento");
                            System.out.println("5. Edificacion de vehiculos tipo 1");
                            System.out.println("6. Edificación vehiculos tipo 2");
                            System.out.println("7. Centro de mando");
                            Scanner leern = new Scanner(System.in);
                            Scanner leerv = new Scanner(System.in);
                            int o, v;
                            o = leern.nextInt();
                            int vida1 = 15;
                            int conta = 0;
                            int dis = 1000;
                            int num1=1;
                            int num2=2;
                            System.out.println("¿En qué tipo de vehiculo desea mandar a sus tropas?");
                            System.out.println("1. Vehiculo de tipo 1");
                            System.out.println("2. Vehiculo de tipo 2");
                            v = leerv.nextInt();
                            while (v != num1 && v != num2) {
                                System.out.println("¿En qué tipo de vehiculo desea mandar a sus tropas?");
                                System.out.println("1. Vehiculo de tipo 1");
                                System.out.println("2. Vehiculo de tipo 2");
                                v = leerv.nextInt();
                            }
                            
                            switch (o) {
                                case 1:
                                    if (getPlayer2().getRecurso1().size() > 0) {
                                        int cantidad = getPlayer2().getRecurso1().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " generadores de oro desea atacar?");
                                        int pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(1);
                                                es.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getRecurso1().get(pos).modificarvida(5);
                                                if (getPlayer2().getRecurso1().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros esa = factory.getArqueros("Especialista");
                                                esa.modificarlista(1);
                                                esa.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(esa);
                                                getPlayer2().getRecurso1().get(pos).modificarvida(20);
                                                if (getPlayer2().getRecurso1().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee generadores de Oro");
                                    }
                                    break;

                                case 2:
                                    if (getPlayer2().getRecurso2().size() > 0) {
                                        int cantidad = getPlayer2().getRecurso2().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " generadores de esencia desea atacar?");
                                        int pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(2);
                                                es.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getRecurso2().get(pos).modificarvida(5);
                                                if (getPlayer2().getRecurso2().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                getPlayer2().getRecurso2().get(pos).modificarvida(20);
                                                if (getPlayer2().getRecurso2().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee generadores de Elixir");
                                    }
                                    break;
                                case 3:
                                    if (getPlayer2().getRecurso3().size() > 0) {
                                        int cantidad = getPlayer2().getRecurso3().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " generadores de mana desea atacar?");
                                        int pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }
                                               int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(3);
                                                es.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getRecurso3().get(pos).modificarvida(5);
                                                if (getPlayer2().getRecurso3().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                getPlayer2().getRecurso3().get(pos).modificarvida(20);
                                                if (getPlayer2().getRecurso3().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee generadores de Mana");
                                    }
                                    break;

                                case 4:
                                    if (getPlayer2().getEntrenamiento().size() > 0) {
                                        int cantidad = getPlayer2().getEntrenamiento().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " edificios de entrenamiento desea atacar?");
                                        int pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(4);
                                                es.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getEntrenamiento().get(pos).modificarvida(5);
                                                if (getPlayer2().getEntrenamiento().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                getPlayer2().getEntrenamiento().get(pos).modificarvida(20);
                                                if (getPlayer2().getEntrenamiento().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee edificaciones de entrenamiento");
                                    }
                                    break;
                                case 5:
                                    if (getPlayer2().getVehiculo1().size() > 0) {
                                        int cantidad = getPlayer2().getVehiculo1().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " vehiculos tipo 1 desea atacar?");
                                        int pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(5);
                                                es.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getVehiculo1().get(pos).modificarvida(5);
                                                if (getPlayer2().getVehiculo1().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                getPlayer2().getVehiculo1().get(pos).modificarvida(20);
                                                if (getPlayer2().getVehiculo1().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee vehiculos de tipo 1");
                                    }
                                    break;
                                case 6:
                                    if (getPlayer2().getVehiculo2().size() > 0) {
                                        int cantidad = getPlayer2().getVehiculo2().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " vehiculos tipo 2 desea atacar?");
                                        int pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(6);
                                                es.modificarposicion(pos);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getVehiculo2().get(pos).modificarvida(5);
                                                if (getPlayer2().getVehiculo2().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros esa = factory.getArqueros("Especialista");
                                                esa.modificarlista(6);
                                                getPlayer1().getAtaque().add(esa);
                                                //getPlayer1().getEntrenado().remove(tam);
                                                getPlayer2().getVehiculo2().get(pos).modificarvida(20);
                                                if (getPlayer2().getVehiculo2().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee vehiculos de tipo 2");
                                    }
                                    break;
                                case 7:
                                    //Terminar este if
                                    if (getPlayer2().getEntrenamiento().size() == 0) {

                                        int o2;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Especialista");
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            //Este también
                                            if (getPlayer1().getEntrenado().size() > 0) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getPlayer1().getEntrenado().size();
                                                tam = tam - 1;
                                                factory = Recoleccion.getFactory("Arqueros");
                                                FactoryArqueros es = factory.getArqueros("Escuadron");
                                                es = getPlayer1().getEntrenado().get(tam);
                                                es.modificarlista(7);
                                                getPlayer1().getAtaque().add(es);
                                                getPlayer1().getEntrenado().remove(tam);
                                                int vida = getPlayer2().getMando().getVida();
                                                vida = vida - 5;
                                                getPlayer2().getMando().setVida(vida);
                                                //getPlayer2().getMando().getVida().modificarvida(5);
                                                if (getPlayer2().getMando().getVida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getPlayer1().getLista()[0] != null) {
                                                if (v == 1) {
                                                    if (getPlayer1().getVehiculo1().size() > 0) {
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getPlayer1().getVehiculo2().size() > 0) {
                                                        getPlayer1().getVehiculo2().remove(getPlayer1().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getPlayer1().getVehiculo1().remove(getPlayer1().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int vida = getPlayer2().getMando().getVida();
                                                vida = vida - 20;
                                                getPlayer2().getMando().setVida(vida);
                                                if (getPlayer2().getMando().getVida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Especialista disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("No has acabado con todas las edificaciones enemigas");
                                    }
                                    break;


                            }

                        } else {
                            System.out.println("No tiene tropas entrenadas");
                        }
                    } else {
                        System.out.println("No tiene vehiculos disponibles para atacar");
                    }
                    break;

                            
                case 4:
                    if (getPlayer2().getAtaque().size() > 0 /*&& getPlayer1().getEntrenado().size()>0*/) {
                        Scanner def = new Scanner(System.in);
                        System.out.println("¿Con qué desea defender?");
                        System.out.println("1. Un escuadron");
                        System.out.println("2. De Especialista");
                        int op4 = def.nextInt();
                        Scanner defop = new Scanner(System.in);
                        System.out.println("Cual de los " + getPlayer2().getAtaque().size() + " escuadrones del rival desea atacar");
                        int op41 = defop.nextInt();
                        op41=op41-1;

                        switch (op4) {
                            case 1:
                                if (getPlayer1().getEntrenado().size() > 0) {
                                    factory = Recoleccion.getFactory("Arqueros");
                                    FactoryArqueros esc = factory.getArqueros("Escuadron");
                                    esc = getPlayer1().getEntrenado().get(getPlayer1().getEntrenado().size() - 1);
                                    esc.modificarposicion(op41);
                                    esc.modificarlista(8);
                                    getPlayer2().getAtaque().get(op41).modificarvida(5);
                                    if (getPlayer2().getAtaque().get(op41).vida() < 1) {
                                        System.out.println("Se destruyó la tropa enemiga");
                                        getPlayer2().getAtaque().remove(op41);
                                        System.out.println("Su tropa vuelve a estar a su disposición nuevamente");
                                    } else {
                                        System.out.println("Sigue con vida");
                                    }
                                } else {
                                    System.out.println("No dispone de tropas entrenadas");
                                }
                                break;
                            case 2:
                                if (getPlayer1().getLista()[0] != null) {
                                    factory = Recoleccion.getFactory("FactoryArqueross");
                                    FactoryArqueros esc = factory.getArqueros("Especialista");
                                    esc = getPlayer1().getLista()[0];
                                    esc.modificarlista(8);
                                    esc.modificarposicion(op41);
                                    getPlayer2().getAtaque().get(op41).modificarvida(20);
                                    if (getPlayer2().getAtaque().get(op41).vida() < 1) {
                                        System.out.println("Se destruyó la tropa enemiga");
                                        getPlayer2().getAtaque().remove(op41);
                                        System.out.println("Su tropa vuelve a estar a su disposición nuevamente");
                                    } else {
                                        System.out.println("Sigue con vida");
                                    }
                                } else {
                                    System.out.println("No tiene entrenado a Especialista");
                                }
                                break;
                        }
                    } else {
                        System.out.println("El rival no tiene tropas en ataque");
                    }
                    break;
                case 5:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros oro = factory.getArqueros("Generador de Oro");
                    getPlayer1().getRecurso1().add(oro);
                    System.out.println("Se construyó un generador de oro");
                    break;
                case 6:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros elixir = factory.getArqueros("Generador de Elixir");
                    getPlayer1().getRecurso2().add(elixir);
                    //generador_elixir.add(elixir);
                    System.out.println("Se construyó un generador de Elixir");
                    break;
                case 7:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros gema = factory.getArqueros("Generador de Gema");
                    getPlayer1().getRecurso3().add(gema);
                    //generador_gema.add(gema);
                    System.out.println("Se construyó un generador de mana");
                    break;
                case 8:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros entrena = factory.getArqueros("Entrenador");
                    entrena.estado();
                    getPlayer1().getEntrenamiento().add(entrena);
                    //entrenar.add(entrena);
                    System.out.println("Se construyó una edificación para entrenar");
                    
                    break;
                case 9:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros veh1 = factory.getArqueros("Vehiculo 1");
                    getPlayer1().getVehiculo1().add(veh1);
                    //vehiculo1.add(veh1);
                    System.out.println("Se construyó un vehiculo tipo 1");
                    break;
                    
                case 10:
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros veh2 = factory.getArqueros("Vehiculo 2");
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
                    
                    if (getPlayer1().getMando().getOro() >= sum && getPlayer1().getMando().getEA() >= sum && getPlayer1().getMando().getMana() >= sum) {
                        getPlayer1().getMando().level(ca,ce,ci);
                        
                        int num1 = getPlayer1().getMando().getOro();
                        double res = num1 - sum;
                        getPlayer1().getMando().setOro((int)res);
                        int num2 = getPlayer1().getMando().getEA();
                        double res2 = num2 - sum;
                        getPlayer1().getMando().setEA((int)res2);
                        int num3 = getPlayer1().getMando().getMana();
                        double res3 = num3 - sum;
                        getPlayer1().getMando().setMana((int)res3);
                    
                        
                        System.out.println("El valor de almacenaje ahora de Oro es de " + getPlayer1().getMando().getCapacidad1());
                        System.out.println("El valor de almacenaje ahora de Esencia es de " + getPlayer1().getMando().getCapacidad2());
                        System.out.println("El valor de almacenaje ahora de Mana es de " + getPlayer1().getMando().getCapacidad3());
                    }
                    else{
                        System.out.println("No dispone de suficientes recursos");
                    }
                    break;
                    
                case 12:
                    int k = 0;
                    int sup=1000;
                    boolean sta = false;
                    factory = Recoleccion.getFactory("Arqueros");
                    FactoryArqueros entrenado = factory.getArqueros("Entrenador");
                    System.out.println(getPlayer1().getEntrenamiento().size() > 0);
                    
                    if (getPlayer1().getEntrenamiento().size() > 0) {

                        while (k < getPlayer1().getEntrenamiento().size()) {
                            if (getPlayer1().getEntrenamiento().get(k).pregunta() != true) {
                                k = k + 1;
                            } else {
                                sup = k;
                                k=getPlayer1().getEntrenamiento().size();
                            }

                        }

                        if (sup!=1000) {
                            System.out.println("¿Qué numero de tropa desea entrenar?");
                            System.out.println("1. Escuadron");
                            System.out.println("2. Especialista");
                            Scanner leer2 = new Scanner(System.in);
                            int op = leer2.nextInt();
                            if (op == 1) {
                                factory = Recoleccion.getFactory("Arqueros");
                                FactoryArqueros escua = factory.getArqueros("Escuadron");
                                escua.entrenar();
                                getPlayer1().getEntrenado().add(escua);
                                getPlayer1().getEntrenamiento().get(sup).estado();
                                System.out.println("Se entrenó un EscuadonM");
                            } else if (op == 2) {
                                if (getPlayer1().getLista()[0] == null) { 
                                    factory = Recoleccion.getFactory("Arqueros");
                                    FactoryArqueros me = factory.getArqueros("Especialista");
                                    getPlayer1().getLista()[0] = me;
                                    System.out.println("Se entrenó a Especialista");
                                    getPlayer1().getEntrenamiento().get(sup).estado();
                                } else {
                                    System.out.println("Solo se puede tener a un Especialista entrenado");
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