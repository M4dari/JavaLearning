import java.util.Scanner;

public class Exercicio5_v3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		
		System.out.print("Lado A --> ");
		ladoA = entrada.nextDouble();
		System.out.print("Lado B --> ");
		ladoB = entrada.nextDouble();
		System.out.print("Lado C --> ");
		ladoC = entrada.nextDouble();
		
		// teste para verificar se os valores formam um triângulo
		if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			System.out.println("Os valores formam um triângulo");
			if(ladoA == ladoB && ladoB == ladoC) {
				System.out.println("Equilátero");
			}
			else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
					System.out.println("Isósceles");
				}
				else {
					System.out.println("Escaleno");
				}
			
		}
		else {
			System.out.println("Os valores não formam um triângulo");
		}		
	}
}
