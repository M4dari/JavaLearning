import java.util.Scanner;
public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variaveis
		double tc, tf;
		Scanner teclado = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Insira a temperatura em graus celsius");
		tc = teclado.nextDouble();
		
		//processamento de dados 
		tf= tc*9/5+32;
		
		//saida de dados
		System.out.println(tc+ "°C="+tf+"°F");
		teclado.close();
	}

}
