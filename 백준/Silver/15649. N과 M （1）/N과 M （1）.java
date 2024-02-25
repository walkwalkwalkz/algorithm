import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N,M;
	static int[] data;
	
	static void per(int depth, int flag) {
		if(depth==M) {
			for(int d : data) {
				System.out.print(d+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if((flag&1<<i)!=0) continue;
			data[depth]=i+1;
			per(depth+1,flag|1<<i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		data = new int[M];
		per(0,0);
	}

}