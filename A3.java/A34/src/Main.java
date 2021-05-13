import java.util.HashSet;
import java.util.LinkedHashSet;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> n=new HashSet<>();
		n.add("a");
		n.add("b");
		n.add("d");
		n.add("c");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("a");
		ln.add("d");
		ln.add("b");
		ln.add("c");		
		System.out.println("Orderd "+ln);
		
	}

}
