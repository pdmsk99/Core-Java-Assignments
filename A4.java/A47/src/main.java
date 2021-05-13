import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("tom", 1);
		m.put("jerry",2);
		m.put("motu",3);
		
		StringBuilder s = new StringBuilder();
		m.entrySet().forEach(n -> s.append(n.getKey()).append(n.getValue()));
		System.out.println(s.toString());
		
	}

}
