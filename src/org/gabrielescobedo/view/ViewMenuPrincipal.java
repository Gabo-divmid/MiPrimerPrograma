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
            opcionMenu = Integer.parseInt(leer.nextLine());
            
        }
    }
    
    public void mostrarMenuMatematica(){
        System.out.println("Menu de operaciones Matemáticas");
    }
}
