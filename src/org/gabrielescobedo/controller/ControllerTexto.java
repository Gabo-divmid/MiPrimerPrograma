
package org.gabrielescobedo.controller;
    import java.util.Scanner;
/**
 *
 * @author informatica
 */
public class ControllerTexto {

   public class ConcatenadorNombre {

    public static String concatenarNombre(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public static void main(String[] args) {
        String resultado = concatenarNombre("Juan", "Perez");
        System.out.println(resultado); // Juan Perez
    }
}
      
        