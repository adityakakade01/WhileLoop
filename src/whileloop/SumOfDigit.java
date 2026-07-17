package whileloop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int rem;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("num:");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
