import java.util.Locale;
import java.util.Scanner;

public class Divisao {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double divisao;
		
		for (int i=0; i<N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			divisao = x/y;
			
			if (y==0) {
				System.out.println("DIVISÃO IMPOSSÍVEL!");
			}else {
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
	}

}
