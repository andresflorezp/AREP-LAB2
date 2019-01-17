package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;


/**
 * Esta clase permite ejecutar los Tests
 * @author Andres Giovanne Florez Perez
 *
 */
public class AppTest extends TestCase

{

	public Lectura read;//Permite hacer la lectura de datos
	public Mean meanTestOne;//Permite calcular la media para los test 1
	public devStand desvEstandarTestOne;//Permite calcular la desviacion estandar para los test 1
	public Mean meanTestTwo;//Permite calcular la media para los test 2
	public devStand desvEstandarTestTwo;//Permite calcular la desviacion estandar para los test 2
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Este test se realiza para la mediana de la columna uno 
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	public void testOneMean() throws Exception {
		read = new Lectura("TestOne.txt");
		meanTestOne = new Mean(read.getN());
		meanTestOne.fillLinkedList(read.getData());
		float mediana=meanTestOne.calculateMean();
		assertTrue(Math.abs(mediana-550.6)<=1e-2);
		
	}
	/**
	 * Este test se realiza para la desviacion estandar de la columna uno
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	public void testOneDesv() throws Exception {
		read = new Lectura("TestOne.txt");
		desvEstandarTestOne = new devStand(read.getN());
		desvEstandarTestOne.fillLinkedList(read.getData());
		float desviacion = desvEstandarTestOne.calculatedevStand();
		assertTrue(Math.abs(desviacion-572.03)<=1e-2);
	}
	
	
	/**
	 * Este test se realiza para la mediana de la columna dos
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	public void testTwoMean() throws Exception {
		read = new Lectura("TestTwo.txt");
		meanTestTwo = new Mean(read.getN());
		meanTestTwo.fillLinkedList(read.getData());
		float mediana=meanTestTwo.calculateMean();
		assertTrue(Math.abs(mediana-60.32)<=1e-2);
		
	}
	
	/**
	 * Este test se realiza para la desviacion estandar de la columna dos
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	public void testTwoDesv() throws Exception {
		read = new Lectura("TestTwo.txt");
		desvEstandarTestTwo = new devStand(read.getN());
		desvEstandarTestTwo.fillLinkedList(read.getData());
		float desviacion = desvEstandarTestTwo.calculatedevStand();
		assertTrue(Math.abs(desviacion-62.26)<=1e-2);

	}

}
