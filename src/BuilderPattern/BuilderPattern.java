package BuilderPattern;

public class BuilderPattern {
	public static void main(String args[])
	{
		Integrator i1=new Integrator();
		Builder HpGamePC=new GamingPC("HP");
		Builder DellOfficePC=new OfficePC("Dell");

		//Let's integrate HP pc
		i1.construct(HpGamePC);
		Product p1=HpGamePC.getProduct();
		p1.showProduct();

		//Let's integrate Dell pc
		i1.construct(DellOfficePC);
		Product p2=DellOfficePC.getProduct();
		p2.showProduct();
	}

}
