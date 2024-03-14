import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variaveis
		double horaaula, horaT, desconto, SB, SL;
		double faixa1 = 1045.00;
        double faixa2 = 2089.60;
        double faixa3 = 3134.40;
        double faixa4 = 6101.06;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat mascara = new DecimalFormat ("#.00");
		
		// entrada de dados 
		System.out.println("Insira o valor da hora-aula-->R$");
		horaaula= teclado.nextDouble();
		System.out.println("Insira o número de horas trabalhadas-->");
		horaT = teclado.nextDouble();
		
		//processamento de dados
		SB= horaaula*horaT;
		desconto= SB*0.12;
		
		if (SB <= faixa1) {
			desconto= SB*0.075;
		} else if (SB<= faixa2) {
			desconto = SB*0.09;
		} else if (SB <= faixa3) {
			desconto = SB*0.12;
		} else if (SB <= faixa4) {
			desconto = SB*0.14;
		} else {
			System.out.println("teto máximo");
		}
		
		
		SL= SB- desconto;
		
		System.out.println("O salário líquido é R$"+ mascara.format(SL));
		teclado.close();
		return;
				
			
		
		
	}

}
