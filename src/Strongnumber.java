
public class Strongnumber 
{
	public static void main(String[] args) {
		
	
	int i=153,r,sum=0,n=i;
	while(i>0){
		r=i%10;
		sum=(sum)+r*r*r;
		i=i/10;}
		if(sum==n){
			System.out.println("it is strong number");
		}
		else{
			System.out.println("itis not strong number");
		}
		
	}}


