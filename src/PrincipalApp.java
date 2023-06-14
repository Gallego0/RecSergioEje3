import java.util.*;
public class PrincipalApp {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String [] args) {
		
		int [] num = {11,3,28,4,1,12,111,2,14};
		
		BuscarNum buscarNum = new BuscarNum(num);
		
		int numIntroducido = BuscarNum.Comprobar(num);
		
		
	}
}
