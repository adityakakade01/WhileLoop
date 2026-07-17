package whileloop;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int i=1, sum=0;
		while(i<=n)
		{
			sum = sum+i;
			i++;
			System.out.println(sum);
		}
		System.out.println("out side the loop:"+sum);


	}

}
