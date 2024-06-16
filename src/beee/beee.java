package beee;

import java.util.*;

public class beee{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 1;
		int ten = 2;
		int sun =num;
		int d = 2*num-3;
		
		for(int i =0; i < 2*num-1; i++) {
			for(int t = 1; t <sun; t++ ) {
				System.out.print(" ");
			}
			if(sun == 0) {
				for(int g = 1; g < ten; g++) {
					System.out.print(" ");
					
				}
				if(ten == 2*num-1) {
					break;
				}
				++ten;
			}
			else {
				--sun;
			}
			
			
			
			if(sum == 2*num+1) {
				for(int g = 0; g < d; g++) {
					System.out.print("*");
					
				}
				if(d == 1) {
					break;
				}
				d = d-2;
			}
			else {
				for(int j =0; j < sum; j++) {
					System.out.print("*");
				}
				sum = sum +2;
			}
			
			System.out.println();
		}
	}
}