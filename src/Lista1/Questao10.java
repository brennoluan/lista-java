package Lista1;
import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int numero1 = entrada.nextInt();
		System.out.print("Digite um valor: ");
		int numero2 = entrada.nextInt();
		int multiplicacao = numero1*numero2;
		
		System.out.printf("A multiplica��o de %d com %d � %d", numero1, numero2, multiplicacao);
		entrada.close();
	}
}