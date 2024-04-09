import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double prova1, prova2, mediaProva;
		double trabalho1, trabalho2, trabalho3, mediaTrabalho;
		double mediaFinal;
		double tolerancia = 0.000001;
		
		System.out.print("Digite a nota da 1a prova: ");
		prova1 = entrada.nextDouble();
		System.out.print("Digite a nota da 2a prova: ");
		prova2 = entrada.nextDouble();
		System.out.print("Digite a nota do 1o trabalho: ");
		trabalho1 = entrada.nextDouble();
		System.out.print("Digite a nota do 2o trabalho: ");
		trabalho2 = entrada.nextDouble();
		System.out.print("Digite a nota do 3o trabalho: ");
		trabalho3 = entrada.nextDouble();		
		
		mediaProva = (prova1 + prova2) / 2;
		mediaTrabalho = (trabalho1 + trabalho2 + trabalho3) / 3;
		mediaFinal = mediaProva * 0.7 + mediaTrabalho * 0.3;
		
		System.out.println("média final = " + String.format("%.2f", mediaFinal));
		System.out.println("média final = " + mediaFinal);
		
		if(mediaFinal >= 6 - tolerancia) {
			System.out.println("Aprovado");
		} 
		else {
			System.out.println("Reprovado");
		}
		
		
		
	}
}
