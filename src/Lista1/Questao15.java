package Lista1;
import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o sal�rio: ");
		double salario = entrada.nextDouble();

		double valor1 = (50*salario)/100;
		double valor2 = (30*salario)/100;
		double valor3 = (20*salario)/100;
		
		System.out.printf("O seu sal�rio � %.2f.\nVoc� deve usar %.2f para as necessidades.\nDeve usar %.2f para seus desejos pessoais.\nE %.2f para investimento ou pagar as d�vidas;", salario, valor1, valor2, valor3);
		entrada.close();
	}
}
