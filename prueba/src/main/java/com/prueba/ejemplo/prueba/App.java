package com.prueba.ejemplo.prueba;

/**
 * Clase App(Principal)
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )throws IOException
    {
    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

    int x,y,z;

    System.out.println("Introduce x,y,z: ");
    x =  Integer.parseInt (entrada.readLine()); 
    y =  Integer.parseInt (entrada.readLine());
    z =  Integer.parseInt (entrada.readLine());
    
    Maximo M= new Maximo();
    M.GetMaximo(x,y,z);
    }
}
