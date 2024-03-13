import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x ,y;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat ("#.000");
		
		System.out.println("Digite o valor de X");
		x = teclado.nextDouble();
		
		
		y= Math.sqrt(Math.pow(x-1.0/2, 1.0/3));
		
		System.out.println("Resultado:"+ mascara.format(y));
			teclado.close();				
		
		
		
		
	}

}
