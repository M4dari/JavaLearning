import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variaveis
		double salario, quilowatts;
		double valorQ,valorR, valorD;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("#.00");
		
		//entrada de dados
		System.out.println("Digite o salario minimo atual R$");
		salario= teclado.nextDouble();
		System.out.println("Quantos quilowatts fora gastos");
		quilowatts= teclado.nextDouble();
		
		//processamento de dados
		valorQ= salario* 1/7/100;
		valorR= valorQ*quilowatts;
		valorD= valorR * 0.90;
		
		//saida de dados
		System.out.println("O valor do quilowatt é R$"+ mascara.format(valorQ));
		System.out.println("O valor a ser pago é R$"+ mascara.format(valorR));
		System.out.println("O valor com desconto é R$"+ mascara.format(valorD));
		teclado.close();
	}

}
