
public class Armstrongnumber
{
public static void main(String[] args) 
{
	int i=111,r ,sum=0,n=i;
	while(i>0){
		r=i%10;
		sum=(sum*10)+r;
		i=i/10;}
		if(n==sum){
			System.out.println("It is palyndrom number");
			
		}
		else{
			System.out.println("it is not even number");
		
	}

}}
