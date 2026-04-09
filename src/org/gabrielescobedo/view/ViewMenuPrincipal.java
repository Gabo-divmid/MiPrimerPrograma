package org.gabrielescobedo.view;
import java.util.Scanner;

public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner (System.in);
    
    public void mostrarMenu(){
       //Local
        while (opcionMenu == 0){
            System.out.println("Bienvenido, Seleccione una opcion: ");
            System.out.println("1. Operaciones Matematicas. ");
            System.out.println("2. Operaciones de texto.");
            System.out.println("3. Operaciones de Logica.");
            System.out.println("4. Salir del sistema.");
            opcionMenu = Integer.parseInt(leer.nextLine());
            
        }
    }
    
    public void mostrarMenuMatematica(){
        System.out.println("Menu de operaciones Matemáticas");
    }
}
