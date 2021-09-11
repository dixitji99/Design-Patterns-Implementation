package builderpattern;

public class GamingPC implements Builder {
	private String brandName;
	private Product product;

	public GamingPC(String brandName) {
		this.brandName=brandName;
		product=new Product();
	}

	@Override
	public void startIntegration() {
		product.add(String.format("Integration of:%s started\n",brandName));
		
	}

	@Override
	public void addMonitor() {
		product.add("Monitor with Screen Size & "
				+ "Aspect Ratio: 27 inches, 16:9\n "
				+ "Resolution: 1920 x 1080\n"
				+ "Panel Type: IPS\n"
				+ "Refresh Rate: 144 Hz\n"
				+ "Response Time (GTG): 1ms\n"
				+ "Adaptive-Sync: FreeSync Premium added\n");
	}

	@Override
	public void addKeyboard() {
		product.add("Keyboard with Switch: Corsair OPX\n"
				+ "Size: Full size \n"
				+ "Backlights: RGB \n"
				+ "Passthroughs: USB \n"
				+ "Media Controls: Dedicated \n"
				+ "Wristrest: Detachable \n"
				+ "Keycaps: PBT double-shot added\n");
		
	}

	@Override
	public void addMouse() {
		product.add("Mouse with Sensor:Laser \n"
				+ "DPI/CPI:20,000 DPI \n");
		
	}

	@Override
	public void addCpu() {
		product.add("CPU with Cores: 12 \n"
				+ "Threads: 24 \n"
				+ "Base Clock: 3.7 GHz\n "
				+ "Boost Clock: 4.8 GHz \n"
				+ "Overclocking: Yes \n"
				+ "L3 Cache: 64 MB added\n");
		
	}

	@Override
	public void stopIntegration() {
		product.add(String.format("\nIntegration of:%s Finished\n",brandName));
		
	}

	@Override
	public Product getProduct() {
		return product;
	}


}
