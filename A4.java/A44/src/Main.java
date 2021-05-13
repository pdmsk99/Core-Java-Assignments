import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		ls.add("Anu");
		ls.add("Arya");
		ls.add("Ammuz");
		ls.add("Anugraha");
		ls.add("Arjun");
		ls.add("Paachu");
		
		ls.forEach(i -> {  
            if (i.length() % 2 == 0) { //check for even length of string  
                System.out.println(i); 
		//ls.removeIf(n -> n%2!=0);//check for odd length of string
		//System.out.println(ls);
            }  
        });  
    }  
} 