package whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i=1, fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		n=sc.nextInt();
		while(i<=n)
		{
			fact= fact*i;
			System.out.println(fact);
			i++;
		}
		System.out.println("out side the loop:"+fact);

	}

}
