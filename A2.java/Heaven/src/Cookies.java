public class Cookies extends Dessertitem{
	float quantity;
	public Cookies(float q)
	{
		quantity=q;
	}

	public float getcost() {
		float cost = quantity*3f*7;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}