import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variaveis 
		double tempo, velocidade, combustivel;
		Scanner teclado = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("Qual a duração da viajem?");
		tempo= teclado.nextDouble();
		System.out.println("Qual foi velocidade?");
		velocidade = teclado.nextDouble();
		
		//processamento de dados
		combustivel = tempo* velocidade*10.5;
				
		//saida de dados
		System.out.println("Foram gastos "+combustivel+" durante a viajem" );
		teclado.close();
	}

}
