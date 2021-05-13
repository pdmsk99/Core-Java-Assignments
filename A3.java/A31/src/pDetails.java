import java.util.*;

public class pDetails implements Comparable {
	int Weight;
	int Height;
	String name;

	pDetails(int Weight, int Height, String name) {
		this.Height = Height;
		this.Weight = Weight;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [Weight=" + Weight + ", Height=" + Height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int Weight1 = this.Weight;
		int Height1 = this.Height;
		pDetails p = (pDetails) o;
		int Weight2 = p.Weight;
		int Height2 = p.Height;
		if (Weight1 < Weight2) {
			return -1;
		} else if (Weight1 > Weight2) {
			return +1;
		} else {
			if (Height1 < Height2) {

				return -1;
			} else if (Height1 > Height2) {
				return 1;
			}

		}
		return Height2;

	}
}
 class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pDetails p1 = new pDetails(59, 5, "Hulk");
		pDetails p2 = new pDetails(66, 7, "Spidy");
		pDetails p3 = new pDetails(45, 8, "Thor");
		pDetails p4 = new pDetails(45, 6, "Tom");
		pDetails p5 = new pDetails(45, 4, "Jerry");

		TreeSet<pDetails> n = new TreeSet<>();
		n.add(p1);
		n.add(p2);
		n.add(p3);
		n.add(p4);
		n.add(p5);
		System.out.println(n);
	}

}
