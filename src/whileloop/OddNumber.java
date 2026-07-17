package whileloop;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		
		while(a<50)
		{
			a++;
			
			if(a%2==0)
				
			{
				
				System.out.println("Even number:"+a);
				
			}
			else if(a%2!=0)
			{
				System.out.println("Odd Number:"+a);
			}
			
			
		}
		System.out.println("out side the loop:"+a);
		
	}

}
