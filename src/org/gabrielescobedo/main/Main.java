package org.gabrielescobedo.main;
import org.gabrielescobedo.view.ViewMenuPrincipal;

/**
 *
 * @author Gabriel Escobedo
 */
public class Main {

    public static void main(String[] args) {
        //tipo de dato, nombre, valores
        //Instanciar = new
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        
        System.out.println("Mi primer Programa");
        menu.mostrarMenu();
    }
}
