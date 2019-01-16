package edu.escuelaing.arem.ASE.app;


import java.util.*;

/**
 * Esta clase se encarga de la Media
 * @author Andres Giovanne Florez Perez
 *
 */
public class Mean {
	public LinkedList<Float> Data;//Lista enlazada para almacenar los datos
	public float N;//Numero de datos que van a entrar para calcular la desviacion estandar

	/**
	 * @param n - Entra el numero de datos para calcular la media
	 */
	public Mean(int n) {
	
		this.N = (float) n;
		Data = new LinkedList<Float>();

	}

	/**
	 * Este metodo permite calcular la media
	 * @return float
	 */
	public float calculateMean() {
		float sum = 0;
		for (Float number : Data) {
			
			sum += number;

		}
		
		float ultimoValor = (sum / N);
		return (float) ultimoValor;

	}
	/**
	 * Este metodo permite llenar la lista enlazada con otra lista 
	 * @param Datax-Datos para llenar la lista enlazada
	 */
	public void fillLinkedList(List<Float> Datax) {
		for(float num:Datax) {
			this.Data.add(num);
			
		}
	}

	public LinkedList<Float> getData() {
		return Data;
	}

	
	public void setData(LinkedList<Float> data) {
		Data = data;
	}

	public float getN() {
		return N;
	}


	public void setN(int n) {
		N = n;
	}

}
