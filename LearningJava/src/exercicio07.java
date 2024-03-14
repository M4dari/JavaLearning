import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variaveis 
		double x,y, P;
		Scanner entrada= new Scanner(System.in);
		DecimalFormat mascara= new DecimalFormat("#.000");
		// entrada de dados 
		System.out.println("Insira o valor de X-->");
		x= entrada.nextDouble();
		
		//processamento de dados 
		P= Math.pow(Math.pow(x, 4)-1/2*Math.pow(x, 2), 2);
		y= Math.sqrt(1+ P-Math.pow(x, 2)/2);
		
		//saida de dados 
		System.out.println("O valor de Y é:"+ mascara.format(y));
		entrada.close();
		
		
		
		
	}

}
