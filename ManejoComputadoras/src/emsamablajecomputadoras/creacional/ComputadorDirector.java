package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	private ConstructorComputadora builder;
	
	
	public ComputadorDirector(ConstructorComputadora builder) {
		this.builder = builder;
	}
	
	
	public void ConstruirComputador() {
		builder.definirComputadora();
		builder.crearMainboard();
		builder.crearSO();
		builder.definirExtras();
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
