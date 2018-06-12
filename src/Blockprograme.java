
public class Blockprograme
{
static 
{
System.out.println("hi am in static block and i execute before main method so if u want to execute anything before main method then u can use static block");	

}
public void add (){
	System.out.println(" i am inside method");}
	Blockprograme()
	{
		System.out.println(" i am inside constructor");
	}

public static void main(String[] args) {
	Blockprograme b= new Blockprograme();
	b.add();

}
}