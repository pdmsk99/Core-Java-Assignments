
public class Test {

	public static void main(String[] args) {
		Persistance p = new file();
		p.persist();
		Persistance p1 = new database();
		p1.persist();
		

	}

}
