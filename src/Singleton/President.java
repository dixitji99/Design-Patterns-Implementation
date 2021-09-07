package Singleton;

final class CPresident{
	private static CPresident cPresident;
	private CPresident() {	}
	public static synchronized CPresident getPresident()
	//Synchronized keyword is used to make it thread safe
	{
		if(cPresident==null)
		{
			cPresident=new CPresident();
			System.out.println("President Elected Successfully");
		}
		else
		{
			System.out.println("We already have President");
		}
		return cPresident;
	}	
}
public class President {

	public static void main(String[] args) {
		CPresident.getPresident();
		CPresident.getPresident();
	}

}
