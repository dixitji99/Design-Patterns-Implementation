package Prototype;

public class BakeryShop {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bakery cake1=new PoundCake("Vanilla Flavoured Pound Cake");
		
		Bakery cake2=new BiscuitCake("Chocolate Flavoured Biscuit Cake");
		cake1.basePrice=600;
		cake2.basePrice=550;
		
		Bakery ck;

		//Biscuit cake
		ck=cake1.clone();	
		ck.totalPrice=cake1.basePrice+Bakery.vatPrice();
		System.out.println(ck.getCakeType()+":"+ck.totalPrice);
		

		//Pound cake
		ck=cake2.clone();	
		ck.totalPrice=cake2.basePrice+Bakery.vatPrice();
		System.out.println(ck.getCakeType()+":"+ck.totalPrice);
	}

}
