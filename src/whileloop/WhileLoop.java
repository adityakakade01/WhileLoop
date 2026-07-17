package whileloop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		while(a<10)
		{
			a++;
			System.out.println("a:"+a);
		}
		System.out.println("out side the loop:"+a);

	}

}
