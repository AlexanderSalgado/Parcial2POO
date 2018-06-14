/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



import Edificaciones.Edificaciones;
import Edificaciones.GuardarEdificaciones;
import Milicia.GuardarMilicia;
import Vehiculos.GuardarVehiculos;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        
        return menu;
    }
    
    //PARA GUARDAR LO DEL MAGO
    GuardarMilicia listaMiliM = new GuardarMilicia();
    GuardarVehiculos listaVehiM = new GuardarVehiculos();
    GuardarEdificaciones listaEdiM = new GuardarEdificaciones(); 
    
    //PARA LO DEL ARQUERO
    GuardarMilicia listaMiliD = new GuardarMilicia();
    GuardarVehiculos listaVehiD = new GuardarVehiculos();
    GuardarEdificaciones listaEdiA = new GuardarEdificaciones(); 
    
    //PARA LOS BARBAROS
    GuardarMilicia listaMiliMu = new GuardarMilicia();
    GuardarVehiculos listaVehiBar = new GuardarVehiculos();
    GuardarEdificaciones listaEdiBar = new GuardarEdificaciones(); 
    
    boolean seguir = true;
    Players jugador1 = new Players();
    Players jugador2 = new Players();
    
    int n;
    
    public void random(){
        Random rand = new Random();
        n = rand.nextInt(2) + 1;
        if(n == 1){
            System.out.println("***Bienvenido jugador 1***");
            jugador1.CreadorJugador();
            System.out.println("***Bienvenido jugador 2***");
            jugador2.CreadorJugador();
            while(true){
                if(jugador1.getNombreRaza().equals(jugador2.getNombreRaza())){
                    System.out.println("Esta raza ya esta elegida. Escoja de nuevo");
                    jugador2.CreadorJugador();
                }
                else{
                    break;
                }
            }
        }
        else if(n == 2){
            System.out.println("***Bienvenido jugador 2***");
            jugador2.CreadorJugador();
            System.out.println("***Bienvenido jugador 1***");
            jugador1.CreadorJugador();
            while(true){
                if(jugador2.getNombreRaza().equals(jugador1.getNombreRaza())){
                    System.out.println("Esta raza ya esta elegida. Escoja de nuevo");
                    jugador1.CreadorJugador();
                }
                else{
                    break;
                }
            }
        }
    }
    
    
    
    public void escoger() {
        System.out.println("1. Construir");
        System.out.println("2. Recolectar");
        System.out.println("3. Armar vehiculo");
        System.out.println("4. Entrenar tropas");
        System.out.println("5. Atacar enemigo");
        System.out.println("6. Defender territorio");
        System.out.println("7. Mostrar");
        System.out.println("8. Terminar Turno");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
    }

    public void menu() {
        int x = 0;
        int y = 0;
        Scanner M = new Scanner(System.in);
        
        listaEdiM.CentroBrujos();
        
        while (x != 8) {
            escoger();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de brujos. ");
                        System.out.println("2. Construir recolector de pociones. ");
                        System.out.println("3. Construir recolector de almas. ");
                        System.out.println("4. Construir recolector de libros. ");
                        System.out.println("5. Construir fabrica de vehiculo 1. ");
                        System.out.println("6. Construir fabrica de vehiculo 2. ");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        Edificaciones recurso = listaEdiM.getRecursos();
                        int recu1,recu2,recu3,vida;
                        if(y == 1){
                            if(recurso.getRecurso1()>=200 && recurso.getRecurso3()>=300){
                                System.out.println("Construyendo cuartel de magos");
                                listaEdiM.agregarCuartelBrujos();
                                recu1=recurso.getRecurso1()-200;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-300;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 2){
                            if(recurso.getRecurso2()>=600 && recurso.getRecurso3()>=400){
                                System.out.println("Construyendo recolector de almas");
                                listaEdiM.agregarRecolectorAlmas();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-600;
                                recu3=recurso.getRecurso3()-400;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 3){
                            if(recurso.getRecurso1()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo recolector de pociones");
                                listaEdiM.agregarRecolectorPociones();
                                recu1=recurso.getRecurso1()-400;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                        }
                        else if(y == 4){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=300){
                                System.out.println("Construyendo recolector de libros");
                                listaEdiM.agregarRecolectorLibros();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-300;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 5){
                            if(recurso.getRecurso2()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo fabrica de Vehiculo 1");
                                listaEdiM.agregarVehi1Bru();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-400;
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 6){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=100){
                                System.out.println("Construyendo fabrica de Vehiculo 2");
                                listaEdiM.agregarVehi2Bru();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-100;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");                                
                            }
                        }
                        break;
                    case 2:
                        System.out.println("1. Recolectar pociones");
                        System.out.println("2. Recolectar almas");
                        System.out.println("3. Recolectar libros");
                        System.out.println("Deseo recolectar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Recolectando pociones");;
                        }
                        else if(y == 2){
                            System.out.println("Recolectando almas");
                        }
                        else if(y == 3){
                            System.out.println("Recolectando libros");;
                        }
                        break;
                    case 3:
                        System.out.println("1. Armar vehiculo1. ");
                        System.out.println("2. Armar vehiculo2. ");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        Edificaciones recurso1 = listaEdiM.getRecursos();
                        int recu11, recu22,recu33,vidaa;
                        if(y == 1){
                            if(listaEdiM.verificarEdificacion("Fabrica Vehiculo 1")){
                                if(recurso1.getRecurso1()>=200 && recurso1.getRecurso3()>=400){
                                    System.out.println("Armando Vehiculo 1");
                                    listaVehiM.FVehiculo1Bru();
                                    recu11 = recurso1.getRecurso1()-200;
                                    recu22 = recurso1.getRecurso2();
                                    recu33 = recurso1.getRecurso3()-400;
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else {
                                System.out.println("No existe todavia una fabrica de Vehiculo 1.");
                            }
                            
                        }
                        else if(y == 2){
                            if(listaEdiM.verificarEdificacion("Fabrica Auto Vehiculo 2")){
                                if(recurso1.getRecurso1()>=400 && recurso1.getRecurso2()>=100){
                                    System.out.println("Armando Vehiculo 2");
                                    listaVehiM.FVehiculo2Bru();
                                    recu11 = recurso1.getRecurso1()-400;
                                    recu22 = recurso1.getRecurso2()-100;
                                    recu33 = recurso1.getRecurso3();
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir este vehiculo.");
                                }
                            }
                            else{
                                System.out.println("No existe todavia una fabrica de vehiculos 2.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de Brujos. ");
                        System.out.println("2. Entrenar especialista Brujos.)");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        Edificaciones recurso2 = listaEdiM.getRecursos();
                        int recu111, recu222, recu333,vidaaa;
                        if(listaEdiM.verificarEdificacion("Cuartel Brujos")){
                            if(y == 1){
                                if(recurso2.getRecurso2()>=200 && recurso2.getRecurso3()>=100){
                                    System.out.println("Entrenando escuadron brujo");
                                    listaMiliM.EscuadronBrujos();
                                    recu111 = recurso2.getRecurso1();
                                    recu222 = recurso2.getRecurso2()-200;
                                    recu333 = recurso2.getRecurso3()-100;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                            else if(y == 2){
                                if(recurso2.getRecurso1()>=100 && recurso2.getRecurso3()>=400){
                                    System.out.println("Entrenando especialista brujo");
                                    listaMiliM.EspecialistaBrujos();
                                    recu111 = recurso2.getRecurso1()-100;
                                    recu222 = recurso2.getRecurso2();
                                    recu333 = recurso2.getRecurso3()-400;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                        }
                        else{
                            System.out.println("No existe todavia un cuartel de brujo.");
                        }
                        break;
                    case 5:
                        System.out.println("Atacando");
                        break;
                    case 6:
                        System.out.println("Defendiendo");
                        break;
                    case 7:
                        System.out.println("1. Ver edificaciones actuales");
                        System.out.println("2. Ver vehiculos actuales");
                        System.out.println("3. Ver tropas actuales");
                        System.out.println("Deseo ver: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Mostrando edificios");
                            listaEdiM.mostrarListaEdificaciones();
                        }
                        else if(y == 2){
                            System.out.println("Mostrando vehiculos");
                            listaVehiM.mostrarListaVehiculos();
                        }
                        else if(y == 3){
                            System.out.println("Mostrando tropas");
                            listaMiliM.mostrarListaMilicia();
                        }
                        break;
                    case 8:
                        System.out.println("***Termina turno***\n");
                        break;
                    default:
                        System.out.println("Por favor ingresa un valor valido");      
                }
            } catch (InputMismatchException E){
                System.err.println("Debe ingresar un numero entero");
                M.nextLine();
            }
        }
    }
    
    public void menud() {
            int x = 0;
            int y = 0;
            Scanner M = new Scanner(System.in);

            listaEdiA.CentroArqueros();

            while (x != 8) {
                escoger();
                try {

                    x = M.nextInt();

                    switch (x) {
                        case 1:
                            System.out.println("1. Construir cuartel de Arqueros. ");
                            System.out.println("2. Construir recolector de oro. ");
                            System.out.println("3. Construir recolector de mana. ");
                            System.out.println("4. Construir recolector de esencia. ");
                            System.out.println("5. Construir fabrica de vehiculo 1: ");
                            System.out.println("6. Construir fabrica de vehiculo 2. ");
                            System.out.println("Deseo construir: ");
                            y = M.nextInt();
                            Edificaciones recurso = listaEdiA.getRecursos();
                            int recu1,recu2,recu3,vida;
                            if(y == 1){
                                if(recurso.getRecurso1()>=200 && recurso.getRecurso3()>=300){
                                    System.out.println("Construyendo cuartel de Arqueros");
                                    listaEdiA.agregarCuartelArqueros();
                                    recu1=recurso.getRecurso1()-200;
                                    recu2=recurso.getRecurso2();
                                    recu3=recurso.getRecurso3()-300;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 2){
                                if(recurso.getRecurso2()>=600 && recurso.getRecurso3()>=400){
                                    System.out.println("Construyendo recolector de oro");
                                    listaEdiA.agregarRecolectorOro();
                                    recu1=recurso.getRecurso1();
                                    recu2=recurso.getRecurso2()-600;
                                    recu3=recurso.getRecurso3()-400;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 3){
                                if(recurso.getRecurso1()>=400 && recurso.getRecurso3()>=200){
                                    System.out.println("Construyendo recolector de esencia");
                                    listaEdiA.agregarRecolectorEsencia();
                                    recu1=recurso.getRecurso1()-400;
                                    recu2=recurso.getRecurso2();
                                    recu3=recurso.getRecurso3()-200;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                            }
                            else if(y == 4){
                                if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=300){
                                    System.out.println("Construyendo recolector de mana");
                                    listaEdiA.agregarRecolectorMana();
                                    recu1=recurso.getRecurso1()-300;
                                    recu2=recurso.getRecurso2()-300;
                                    recu3=recurso.getRecurso3();
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 5){
                                if(recurso.getRecurso2()>=400 && recurso.getRecurso3()>=200){
                                    System.out.println("Construyendo fabrica de vehiculos 1");
                                    listaEdiA.agregarVehi1Arq();
                                    recu1=recurso.getRecurso1();
                                    recu2=recurso.getRecurso2()-400;
                                    recu3=recurso.getRecurso3()-200;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 6){
                                if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=100){
                                    System.out.println("Construyendo fabrica de vehiculo 2");
                                    listaEdiA.agregarVehi2Arq();
                                    recu1=recurso.getRecurso1()-300;
                                    recu2=recurso.getRecurso2()-100;
                                    recu3=recurso.getRecurso3();
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");                                
                                }
                            }
                            break;
                        case 2:
                            System.out.println("1. Recolectar oro");
                            System.out.println("2. Recolectar mana");
                            System.out.println("3. Recolectar esencia");
                            System.out.println("Deseo recolectar: ");
                            y = M.nextInt();
                            if(y == 1){
                                System.out.println("Recolectando oro");;
                            }
                            else if(y == 2){
                                System.out.println("Recolectando mana");
                            }
                            else if(y == 3){
                                System.out.println("Recolectando esencia");;
                            }
                            break;
                        case 3:
                            System.out.println("1. Armar vehiculo 1.");
                            System.out.println("2. Armar vehiculo 2.");
                            System.out.println("Deseo armar vehiculo: ");
                            y = M.nextInt();
                            Edificaciones recurso1 = listaEdiA.getRecursos();
                            int recu11, recu22,recu33,vidaa;
                            if(y == 1){
                                if(listaEdiA.verificarEdificacion("Fabrica vehiculo 1")){
                                    if(recurso1.getRecurso1()>=200 && recurso1.getRecurso3()>=400){
                                        System.out.println("Armando vehiculo 1");
                                        listaVehiD.FVehiculo1Arq();
                                        recu11 = recurso1.getRecurso1()-200;
                                        recu22 = recurso1.getRecurso2();
                                        recu33 = recurso1.getRecurso3()-400;
                                        vidaa = recurso1.getVida();
                                        recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para construir este vehiculo.");
                                    }
                                }
                                else {
                                    System.out.println("No existe todavia una fabrica de naves.");
                                }

                            }
                            else if(y == 2){
                                if(listaEdiA.verificarEdificacion("Fabrica vehiculo 2")){
                                    if(recurso1.getRecurso1()>=400 && recurso1.getRecurso2()>=100){
                                        System.out.println("Armando vehiculo 2");
                                        listaVehiD.FVehiculo2Arq();
                                        recu11 = recurso1.getRecurso1()-400;
                                        recu22 = recurso1.getRecurso2()-100;
                                        recu33 = recurso1.getRecurso3();
                                        vidaa = recurso1.getVida();
                                        recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                    }
                                }
                                else{
                                    System.out.println("No existe todavia una fabrica de vehiculo2.");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("1. Entrenar escuadrones de Arqueros. ");
                            System.out.println("2. Entrenar especialista Arqueros. ");
                            System.out.println("Deseo entrenar: ");
                            y = M.nextInt();
                            Edificaciones recurso2 = listaEdiA.getRecursos();
                            int recu111, recu222, recu333,vidaaa;
                            if(listaEdiA.verificarEdificacion("Cuartel arqueros")){
                                if(y == 1){
                                    if(recurso2.getRecurso2()>=200 && recurso2.getRecurso3()>=100){
                                        System.out.println("Entrenando escuadron arqueros");
                                        listaMiliD.EscuadronArqueros();
                                        recu111 = recurso2.getRecurso1();
                                        recu222 = recurso2.getRecurso2()-200;
                                        recu333 = recurso2.getRecurso3()-100;
                                        vidaaa = recurso2.getVida();
                                        recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                    }
                                }
                                else if(y == 2){
                                    if(recurso2.getRecurso1()>=100 && recurso2.getRecurso3()>=400){
                                        System.out.println("Entrenando especialista arqueros");
                                        listaMiliD.EspecialistaArqueros();
                                        recu111 = recurso2.getRecurso1()-100;
                                        recu222 = recurso2.getRecurso2();
                                        recu333 = recurso2.getRecurso3()-400;
                                        vidaaa = recurso2.getVida();
                                        recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                    }
                                }
                            }
                            else{
                                System.out.println("No existe todavia un cuartel de Arqueros.");
                            }
                            break;
                        case 5:
                            System.out.println("Atacando");
                            break;
                        case 6:
                            System.out.println("Defendiendo");
                            break;
                        case 7:
                            System.out.println("1. Ver edificaciones actuales");
                            System.out.println("2. Ver vehiculos actuales");
                            System.out.println("3. Ver tropas actuales");
                            System.out.println("Deseo ver: ");
                            y = M.nextInt();
                            if(y == 1){
                                System.out.println("Mostrando edificios");
                                listaEdiA.mostrarListaEdificaciones();
                            }
                            else if(y == 2){
                                System.out.println("Mostrando vehiculos");
                                listaVehiD.mostrarListaVehiculos();
                            }
                            else if(y == 3){
                                System.out.println("Mostrando tropas");
                                listaMiliD.mostrarListaMilicia();
                            }
                            break;
                        case 8:
                            System.out.println("***Termina turno***\n");
                            break;
                        default:
                            System.out.println("Por favor ingresa un valor valido");      
                    }
                } catch (InputMismatchException E){
                    System.err.println("Debe ingresar un numero entero");
                    M.nextLine();
                }
            }
        }
    
    public void menum() {
        int x = 0;
        int y = 0;
        Scanner M = new Scanner(System.in);
        
        listaEdiBar.CentroBarbaros();
        
        while (x != 8) {
            escoger();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de barbaros. ");
                        System.out.println("2. Construir recolector de sangre. ");
                        System.out.println("3. Construir recolector de comida. ");
                        System.out.println("4. Construir recolector de armar. ");
                        System.out.println("5. Construir fabrica de vehiculo 1. ");
                        System.out.println("6. Construir fabrica de vehiculo 2. ");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        Edificaciones recurso = listaEdiBar.getRecursos();
                        int recu1,recu2,recu3,vida;
                        if(y == 1){
                            if(recurso.getRecurso1()>=200 && recurso.getRecurso3()>=300){
                                System.out.println("Construyendo cuartel de barbaros");
                                listaEdiBar.agregarCuartelBarbaro();
                                recu1=recurso.getRecurso1()-200;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-300;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 2){
                            if(recurso.getRecurso2()>=600 && recurso.getRecurso3()>=400){
                                System.out.println("Construyendo recolector de comida");
                                listaEdiBar.agregarRecolectorComida();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-600;
                                recu3=recurso.getRecurso3()-400;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 3){
                            if(recurso.getRecurso1()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo recolector de sangre");
                                listaEdiBar.agregarRecolectorSangre();
                                recu1=recurso.getRecurso1()-400;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                        }
                        else if(y == 4){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=300){
                                System.out.println("Construyendo recolector de armas");
                                listaEdiBar.agregarRecolectorArmas();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-300;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 5){
                            if(recurso.getRecurso2()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo fabrica de vehiculo1");
                                listaEdiBar.agregarVehi1Bar();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-400;
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 6){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=100){
                                System.out.println("Construyendo fabrica de vehiculos2");
                                listaEdiBar.agregarVeh2Bar();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-100;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");                                
                            }
                        }
                        break;
                    case 2:
                        System.out.println("1. Recolectar sangre");
                        System.out.println("2. Recolectar comida");
                        System.out.println("3. Recolectar armas");
                        System.out.println("Deseo recolectar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Recolectando sangre");;
                        }
                        else if(y == 2){
                            System.out.println("Recolectando comida");
                        }
                        else if(y == 3){
                            System.out.println("Recolectando armas");
                        }
                        break;
                    case 3:
                        System.out.println("1. Armar Vehiculo1. ");
                        System.out.println("2. Armar Vehiculo2. ");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        Edificaciones recurso1 = listaEdiBar.getRecursos();
                        int recu11, recu22,recu33,vidaa;
                        if(y == 1){
                            if(listaEdiBar.verificarEdificacion("Fabrica vehiculo2")){
                                if(recurso1.getRecurso1()>=200 && recurso1.getRecurso3()>=400){
                                    System.out.println("Armando vehiculo2");
                                    listaVehiBar.FVehiculo1Bar();
                                    recu11 = recurso1.getRecurso1()-200;
                                    recu22 = recurso1.getRecurso2();
                                    recu33 = recurso1.getRecurso3()-400;
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else {
                                System.out.println("No existe todavia una fabrica de  vehiculos2.");
                            }
                            
                        }
                        else if(y == 2){
                            if(listaEdiBar.verificarEdificacion("Fabrica Tanque")){
                                if(recurso1.getRecurso1()>=400 && recurso1.getRecurso2()>=100){
                                    System.out.println("Armando tanque");
                                    listaVehiBar.FVehiculo2Bar();
                                    recu11 = recurso1.getRecurso1()-400;
                                    recu22 = recurso1.getRecurso2()-100;
                                    recu33 = recurso1.getRecurso3();
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else{
                                System.out.println("No existe todavia una fabrica de tanques.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de barbaros. ");
                        System.out.println("2. Entrenar especialista barbaro.");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        Edificaciones recurso2 = listaEdiBar.getRecursos();
                        int recu111, recu222, recu333,vidaaa;
                        if(listaEdiBar.verificarEdificacion("Cuartel barbaro")){
                            if(y == 1){
                                if(recurso2.getRecurso2()>=200 && recurso2.getRecurso3()>=100){
                                    System.out.println("Entrenando escuadron barbaro");
                                    listaMiliMu.EscuadronBarbaros();
                                    recu111 = recurso2.getRecurso1();
                                    recu222 = recurso2.getRecurso2()-200;
                                    recu333 = recurso2.getRecurso3()-100;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                            else if(y == 2){
                                if(recurso2.getRecurso1()>=100 && recurso2.getRecurso3()>=400){
                                    System.out.println("Entrenando especialista barbaro");
                                    listaMiliMu.EspecialistaBarbaros();
                                    recu111 = recurso2.getRecurso1()-100;
                                    recu222 = recurso2.getRecurso2();
                                    recu333 = recurso2.getRecurso3()-400;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                        }
                        else{
                            System.out.println("No existe todavia un cuartel de barbaros.");
                        }
                        break;
                    case 5:
                        System.out.println("Atacando");
                        break;
                    case 6:
                        System.out.println("Defendiendo");
                        break;
                    case 7:
                        System.out.println("1. Ver edificaciones actuales");
                        System.out.println("2. Ver vehiculos actuales");
                        System.out.println("3. Ver tropas actuales");
                        System.out.println("Deseo ver: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Mostrando edificios");
                            listaEdiBar.mostrarListaEdificaciones();
                        }
                        else if(y == 2){
                            System.out.println("Mostrando vehiculos");
                            listaVehiBar.mostrarListaVehiculos();
                        }
                        else if(y == 3){
                            System.out.println("Mostrando tropas");
                            listaMiliMu.mostrarListaMilicia();
                        }
                        break;       
                    case 8:
                        System.out.println("***Termina turno***\n");
                        break;
                    default:
                        System.out.println("Por favor ingresa un valor valido");      
                }
            } catch (InputMismatchException E){
                System.err.println("Debe ingresar un numero entero");
                M.nextLine();
            }
        }
    }
    
    int cont = 1;
    
    public void menuPrincipal(){
        random();
        
        while(seguir){
            if(n == 1){
                System.out.println("**********Fase "+cont+"**********");
                if(jugador1.getNombreRaza().equals("brujos")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    menu();
                }
                else if(jugador1.getNombreRaza().equals("arqueros")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    menud();
                }
                else if(jugador1.getNombreRaza().equals("barbaros")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    menum();
                }
                if(jugador2.getNombreRaza().equals("brujos")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    menu();
                }
                else if(jugador2.getNombreRaza().equals("arqueros")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    menud();
                }
                else if(jugador2.getNombreRaza().equals("barbaros")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    menum();
                }
            } 
            else if(n == 2){
                System.out.println("**********Fase "+cont+"**********");
                if(jugador2.getNombreRaza().equals("brujos")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    menu();
                }
                else if(jugador2.getNombreRaza().equals("arqueros")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    menud();
                }
                else if(jugador2.getNombreRaza().equals("barbaros")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    menum();
                }
                if(jugador1.getNombreRaza().equals("brujos")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    menu();
                }
                else if(jugador1.getNombreRaza().equals("arqueros")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    menud();
                }
                else if(jugador1.getNombreRaza().equals("barbaros")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    menum();
                }
            }
            cont++;
        }
    }
}