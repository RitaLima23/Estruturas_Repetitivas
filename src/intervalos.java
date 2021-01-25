import java.util.Scanner;

public class intervalos {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		int X;
		int in = 0;
		int out = 0;
		
		N = sc.nextInt();
		
		for(int i=0; i<N; i++){
			X = sc.nextInt();
			if(X>=10 && X<=20) {
				in = in + 1;
			}else{
				out = out + 1;
			}
		}
		
		System.out.println(in + "in");
		System.out.println(out + "out");
		
		sc.close();
			
		}

	}

