package com.prueba.ejemplo.prueba;

/**
 * Clase Maximo
 *
 */

public class Maximo
{
	  public int max;

		public void GetMaximo(int x,int y, int z){
	        
	        if (x>y && x>z)
	             this.max = x;
	        else
	             if (z>y)
	                this.max = z;
	             else
	                 this.max = y;
	        //System.out.println ("El maximo es " + this.max);
	            }
}
