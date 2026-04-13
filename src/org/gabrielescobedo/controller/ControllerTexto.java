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
public static boolean esVocal(char c){
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

public static String extraerIniciales(String nombre, String apellido) {
        return "" + nombre.charAt(0) + apellido.charAt(0);
    }

 public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }
