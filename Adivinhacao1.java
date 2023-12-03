package adivinhacao1;
import java.util.Scanner;
import java.util.Locale;
public class Adivinhacao1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		
				
		System.out.println("Digite o valor a ser adivinhado");
		x = sc.nextDouble();
		
		System.out.println("Digite o numero que voce acha que e o correto");
		y = sc.nextDouble();
		
		if(x != y) {
			do {
				System.out.println("Tente novamente");
				y = sc.nextDouble();
			} while (x != y);
		    
			}
		   
		  System.out.println("Acertou");
	
		
             		
		sc.close();

	}
}
