package emsamablajecomputadoras.creacional;

public abstract class ConstructorComputadora {
	protected Computador pc;
	public Computador getComputador() {
		return pc;
	}
	public abstract void definirComputadora();
	public abstract void crearSO();
	public abstract void crearMainboard();
	public abstract void definirExtras();
}
