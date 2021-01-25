import java.util.Locale;
import java.util.Scanner;

public class Media_Ponderada {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		double media1;
		double m1;
		double m2;
		double m3;
		int p1 = 2;
		int p2 = 3;
		int p3 = 5;
		int peso;
		double media = 0;
		for(int i=0; i<N; i++) {
			double x = sc.nextDouble();
			double z = sc.nextDouble();
			double y = sc.nextDouble();
			
			m1 = x*p1;
			m2 = z*p2;
			m3 = y*p3;
			media1 = m1+m2+m3;
			peso = p1+p2+p3;
			media = media1/peso;
			
			System.out.printf("%.1f%n", media);
			
		}
		
		sc.close();
	}

}
