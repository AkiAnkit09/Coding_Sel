import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Duplicatenumber 
{
public static void main(String[] args) 
{
HashSet m= new HashSet();
m.add("I");
m.add("am");
m.add("am");
m.add("am");
Iterator itr=m.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
		}
	
}


