package org.gabrielescobedo.controller;
/**
 *
 * @Gabriel Escobedo
 */
public class ControllerTexto {       
        public static void main(String[] args) {
            
    }
     public static String concatenarNombre(String nombre, String apellido) {
        return nombre + " " + apellido;
    }
     
    public static int contarLongitud(String palabra) {
        return palabra.length();
    }
}

  public static String invertirTexto(String texto) {
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        return invertido;
    }

