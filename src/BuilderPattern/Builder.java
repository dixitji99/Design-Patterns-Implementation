package BuilderPattern;

public interface Builder {
	void startIntegration();
	void addMonitor();
	void addKeyboard();
	void addMouse();
	void addCpu();
	void stopIntegration();
	
	
	Product getProduct();
}
