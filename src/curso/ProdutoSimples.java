package curso;
import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroUm = teclado.nextInt();
		int numeroDois = teclado.nextInt();
		
		int prod = numeroUm * numeroDois;
		
		System.out.println("PROD = "  + prod);
		
		teclado.close();
		
		

	}

}
