package prototype;

public class PoundCake extends Bakery {
	public int basePrice=600;
	
	public PoundCake(String cakeType)
	{
		super(cakeType);
	}
	
	public Bakery clone() throws CloneNotSupportedException {
		return (PoundCake)super.clone();
		
	}

}
