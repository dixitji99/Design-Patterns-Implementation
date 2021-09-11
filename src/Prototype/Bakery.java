package prototype;
import java.util.Random;

public class Bakery implements Cloneable {
	String cakeType;
	int basePrice,totalPrice;
	
	public Bakery(String cakeType) {
		this.cakeType=cakeType;
	}
	
	public String getCakeType() {
		return cakeType;
	}
	
	public void setCakeType(String cakeType) {
		this.cakeType=cakeType;
	}
	
	public static int vatPrice() {
		Random r=new Random();		
		return r.nextInt(50);
	}
	
	public Bakery clone() throws CloneNotSupportedException {
		return (Bakery) super.clone();
		
	}
}
