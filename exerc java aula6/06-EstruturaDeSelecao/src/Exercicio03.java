import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double valorCompra, valorDesconto, valorFinal;
		
		System.out.print("Valor total das compras --> R$ ");
		valorCompra = entrada.nextDouble();
		
		if(valorCompra <= 1000) {
			valorFinal = valorCompra * 0.92;			
		}
		else {
			valorFinal = valorCompra * 0.85;			
		}
		
		valorDesconto = valorCompra - valorFinal;
		System.out.println("Valor a pagar R$ " + valorFinal);
		System.out.println("Valor do desconto R$ " + valorDesconto);

	}

}
