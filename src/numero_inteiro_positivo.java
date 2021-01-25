import java.util.Locale;
import java.util.Scanner;

public class numero_inteiro_positivo {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
	
		
		for(int i=1; i<=N; i++) {
			int A = i;
			int B = i*i;
			int C = i*i*i;
			

			System.out.printf("%d,%d,%d\n", A,B,C);
		}
		
		sc.close();
	}

}
