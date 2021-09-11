package statepattern;

//This is an interface.  

interface Connection {

	public void open();

	public void close();

	public void log();

	public void update();
}// End of the Connection interface.

class Accounting implements Connection {

	@Override
	public void open() {
		System.out.println("open database for accounting");
	}

	@Override
	public void close() {
		System.out.println("close the database");
	}

	@Override
	public void log() {
		System.out.println("log activities");
	}

	@Override
	public void update() {
		System.out.println("Accounting has been updated");
	}
}// End of the Accounting class.

class Sales implements Connection {

	@Override
	public void open() {
		System.out.println("open database for sales");
	}

	@Override
	public void close() {
		System.out.println("close the database");
	}

	@Override
	public void log() {
		System.out.println("log activities");
	}

	@Override
	public void update() {
		System.out.println("Sales has been updated");
	}

}// End of the Sales class.

class Management implements Connection {

	@Override
	public void open() {
		System.out.println("open database for Management");
	}

	@Override
	public void close() {
		System.out.println("close the database");
	}

	@Override
	public void log() {
		System.out.println("log activities");
	}

	@Override
	public void update() {
		System.out.println("Management has been updated");
	}

}
// End of the Management class.  

class Controller {

	public static Accounting acct;
	public static Sales sales;
	public static Management management;

	private static Connection con;

	Controller() {
		acct = new Accounting();
		sales = new Sales();
		management = new Management();
	}

	public void setAccountingConnection() {
		con = acct;
	}

	public void setSalesConnection() {
		con = sales;
	}

	public void setManagementConnection() {
		con = management;
	}

	public void open() {
		con.open();
	}

	public void close() {
		con.close();
	}

	public void log() {
		con.log();
	}

	public void update() {
		con.update();
	}

}// End of the Controller class.

public class StatePatternDemo {

	Controller controller;

	StatePatternDemo(String con) {
		controller = new Controller();
		// the following trigger should be made by the user
		if (con.equalsIgnoreCase("management"))
			controller.setManagementConnection();
		if (con.equalsIgnoreCase("sales"))
			controller.setSalesConnection();
		if (con.equalsIgnoreCase("accounting"))
			controller.setAccountingConnection();
		controller.open();
		controller.log();
		controller.close();
		controller.update();
	}

	public static void main(String args[]) {

		new StatePatternDemo("sales");

	}

}// End of the StatePatternDemo class.