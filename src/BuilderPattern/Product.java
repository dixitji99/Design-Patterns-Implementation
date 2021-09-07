package BuilderPattern;
import java.util.LinkedList;
public class Product {
	LinkedList<String> products;
	public Product() {
		products=new LinkedList<String>();
	}
	public void add(String p)
	{
		products.addLast(p);		
	}
	public void showProduct() {
		for(String product:products)
		{
			System.out.println(product);
		}
	}
}
