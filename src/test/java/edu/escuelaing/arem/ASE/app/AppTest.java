package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
import org.junit.*;

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
	@org.junit.Test
	public void testOneMean() throws Exception {
		read = new Lectura("TestOne.txt");
		meanTestOne = new Mean(read.getN());
		meanTestOne.fillLinkedList(read.getData());
		double expected=550.60;
		double mediana=meanTestOne.calculateMean();
		assertEquals(mediana, expected);
		
	}
	/**
	 * Este test se realiza para la desviacion estandar de la columna uno
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	@org.junit.Test
	public void testOneDesv() throws Exception {
		read = new Lectura("TestOne.txt");
		double expected=572.03;
		desvEstandarTestOne = new devStand(read.getN());
		desvEstandarTestOne.fillLinkedList(read.getData());
		double desviacion = desvEstandarTestOne.calculatedevStand();
		assertEquals(desviacion, expected);
	}
	
	
	/**
	 * Este test se realiza para la mediana de la columna dos
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	
	@org.junit.Test
	public void testTwoMean() throws Exception {
		double expected=60.32;
		read = new Lectura("TestTwo.txt");
		meanTestTwo = new Mean(read.getN());
		meanTestTwo.fillLinkedList(read.getData());
		double mediana=meanTestTwo.calculateMean();
		assertEquals(mediana,expected);
		
	}
	
	/**
	 * Este test se realiza para la desviacion estandar de la columna dos
	 * usando un error de dos decimales
	 * @throws Exception - Excepcion que se genera por los Buffers
	 */
	
	@org.junit.Test
	public void testTwoDesv() throws Exception {
		read = new Lectura("TestTwo.txt");
		double expected=62.26;
		desvEstandarTestTwo = new devStand(read.getN());
		desvEstandarTestTwo.fillLinkedList(read.getData());
		double desviacion = desvEstandarTestTwo.calculatedevStand();
		assertEquals(desviacion,expected);

	}
	
}
