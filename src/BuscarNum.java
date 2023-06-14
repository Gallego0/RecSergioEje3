import java.util.*;
public class BuscarNum {
	
	static Scanner sc = new Scanner (System.in);
	
	private int [] array = {11,3,28,4,1,12,111,2,14};

	/**
	 * 
	 * @param array
	 */
	public BuscarNum(int[] array) {
		super();
		this.array = array;
	}
	/**
	 * 
	 * @return
	 */
	
	public int[] getArray() {
		return array;
	}
	/**
	 * 
	 * @param array
	 */

	public void setArray(int[] array) {
		this.array = array;
	}

	/**
	 * Metodo para buscar el numero que se quiere buscar
	 * @param array
	 * @return
	 */
	public static int Comprobar (int[] array) {
		
		int numBuscado=0;
		
		System.out.println("Introduce el numero que se quiere buscar");
		numBuscado = sc.nextInt();
		for (int num : array) {
			if (numBuscado == num) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
		return numBuscado;
		
	}
	
}
