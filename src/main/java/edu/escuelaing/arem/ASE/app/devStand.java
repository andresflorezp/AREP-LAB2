package edu.escuelaing.arem.ASE.app;
import java.util.*;

/**
 * Esta clase se encarga de la Desviacion Estandar
 * @author Andres Giovanne Florez Perez
 *
 */
public class devStand {
	public LinkedList<Float> Data;//Lista enlazada para almacenar los datos
	public float N;//Numero de datos que van a entrar para calcular la desviacion estandar
	public Mean mean;//La media que permite calcular la desviacion
	/**
	 * @param N - Numero de datos que van a entrar para calcular la desviacion estandar
	 */
	public devStand(int N) {
	
		this.N=(int)N;
		Data=new LinkedList<Float>();
		mean = new Mean((int) N);
		
	}
	
	/**
	 * Este metodo calcula la desviacion estandar
	 * @return float
	 */
	public float calculatedevStand() {
		mean.setData(Data);
		float avg = mean.calculateMean();
		int sum=0;
		for(Float number:Data) {
			sum+=Math.pow(number-avg, 2);
			
		}
		float valorParcial = sum/(N-1);
		valorParcial=(float) Math.sqrt(valorParcial);
		return valorParcial;
		
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

	public void setN(float n) {
		N = (float) n;
	}
	

}
