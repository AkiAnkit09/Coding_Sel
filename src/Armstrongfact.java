
public class Armstrongfact 
{
	public static void main(String[] args) {
		int i=145,r,fact,n=i,sum=0;
		while(i>0)
		{
			r=i%10;
			fact=1;
			while(r>0){
				
			
				fact=fact*r;
				r--;}
				sum=sum+fact;
				i=i/10;}
		
			if(sum==n){
				System.out.println("it is armstrong number");
			}
			else{
				System.out.println("it is not armstrong number");
		}}
	}

