package com.prueba.ejemplo.prueba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

import  com.prueba.ejemplo.prueba.*;


public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	public Maximo resultado;
	public int esperado;
	
    public AppTest(  )
    {
    	resultado = new Maximo();
		this.esperado = 8;
		resultado.GetMaximo(2, 8, 4); 
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int result = resultado.max;
		assertTrue(result == esperado);
    }
    
    
    
    
    
}
