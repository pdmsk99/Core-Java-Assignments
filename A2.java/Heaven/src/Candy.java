public class Candy extends Dessertitem {
	float quantity;
	public Candy(float q)
	{
		quantity=q;
	}

	@Override
	public float getcost() {
		float cost = quantity*2f*60;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}

