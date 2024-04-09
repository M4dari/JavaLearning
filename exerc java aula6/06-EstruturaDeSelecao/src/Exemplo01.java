import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Digite as duas notas do aluno:");
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("média final = " + String.format("%.2f", media));
		
		if(media >= 6) {
			System.out.println("Aprovado");
		} 
		else {
			System.out.println("Reprovado");
		}
		
		
		
	}
}
