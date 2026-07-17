#include<stdio.h>
void main()
{
	
	int num=143;
	int rem, sum=0;
	
	while(num!=0)
	{
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}
	printf("sum:%d",sum);
	
}
