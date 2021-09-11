package builderpattern;

public class Integrator {
	Builder builder;
	public void construct(Builder builder)
	{
		this.builder=builder;
		builder.startIntegration();
		builder.addCpu();
		builder.addMonitor();
		builder.addKeyboard();
		builder.addMouse();
		builder.stopIntegration();
	}

}
