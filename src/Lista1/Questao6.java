package Lista1;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o produto: ");
		String produto = entrada.nextLine();
		System.out.print("Digite o endere�o: ");
		String endereco = entrada.nextLine();
		
		System.out.printf("O cliente %s solicitou o produto %s para o endere�o %s", nome, produto, endereco);
		entrada.close();
	}
}
