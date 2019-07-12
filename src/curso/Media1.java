package curso;
import java.util.Scanner;
public class Media1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double numeroUm = teclado.nextDouble();
		double numeroDois = teclado.nextDouble();
		double peso1 = 3.5;
		double peso2 = 7.5;
		double var1 = (numeroUm*peso1) + (numeroDois*peso2);
		double var2 = (peso1 + peso2);
		double media = (var1) / (var2);
		
		
		System.out.printf("MEDIA  = %.2f %n", + media);
		
		teclado.close();
		

	}

}
