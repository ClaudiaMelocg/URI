package curso;
import java.util.Scanner;
public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = teclado.nextDouble();
		double area = pi*(raio*raio);
		
		System.out.println(area);
		
		teclado.close();
		
		

	}

}
