package Lista1;
import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1� sal�rio: ");
		double salario1 = entrada.nextDouble();
		System.out.print("Digite o 2� sal�rio: ");
		double salario2 = entrada.nextDouble();
		System.out.print("Digite o 3� sal�rio: ");
		double salario3 = entrada.nextDouble();
		double media = (salario1+salario2+salario3)/3;
		
		System.out.printf("O salario m�dio da empresa � %.2f", media);
		entrada.close();
	}
}
