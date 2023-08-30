package curso_programacao;
import java.util.Locale;

public class Exercicio_00 {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo");
		
		int y = 32;
		System.out.println(y);
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);

	}

}
	