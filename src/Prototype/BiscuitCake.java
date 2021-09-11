package prototype;

public class BiscuitCake extends Bakery {
	public int basePrice=550;
	
	public BiscuitCake(String cakeType)
	{
		super(cakeType);
	}
	
	public Bakery clone() throws CloneNotSupportedException {
		return (BiscuitCake)super.clone();		
	}

}
