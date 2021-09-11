package proxypattern;

import java.util.Random;

interface OfficeInternetAccess {
	public void grantInternetAccess();
}

class RealInternetAccess implements OfficeInternetAccess {
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
	}
}

class ProxyInternetAccess implements OfficeInternetAccess {
	private String employeeName;
	private RealInternetAccess realaccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. " + employeeName + "'s job level is below 5");
		}
	}

	public static int getRandom(int y) {
		Random r = new Random();
		int x = r.nextInt(y);
		return x;
	}

	public int getRole(String emplName) {
		// Check role from the database based on Name and designation
		// return job level or job designation.
		return getRandom(10);
	}
}

class ProxyPatternClient {
	public static void main(String[] args) {
		String s = "";

		switch (ProxyInternetAccess.getRandom(5)) {
		case 0:
			s = "Ayush";
			break;
		case 1:
			s = "Dixit";
			break;
		case 2:
			s = "Rahul";
			break;
		case 3:
			s = "R. Ashwin";
			break;
		default:
			s = "Yash Raj";
			break;
		}

		OfficeInternetAccess access = new ProxyInternetAccess(s);
		access.grantInternetAccess();
	}
}