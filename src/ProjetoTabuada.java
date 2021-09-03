import java.util.Scanner;

public class ProjetoTabuada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int multiplicando;
		int maxMultiplicador;
		int contador = 0;
		
		System.out.print("Digite o multiplicando desejado: ");
		multiplicando = leitor.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o máximo multiplicador desejado: ");
		maxMultiplicador = leitor.nextInt();
		
		System.out.println();
		
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("------------------");
		
		while (contador <= maxMultiplicador) {
			System.out.println(multiplicando + " x " + contador + " = " + multiplicando * contador );
			contador++;
			
		}
	

	}

}
