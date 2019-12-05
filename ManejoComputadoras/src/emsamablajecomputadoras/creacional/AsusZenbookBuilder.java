package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends ConstructorComputadora{

	@Override
	public void definirComputadora() {
		pc = new Computador();
		pc.setRam(16);
		pc.setTipoRam("ddr3");
		pc.setTipoAlmacenamiento("SSD");
		pc.setAlmacenamiento(500);
		pc.setMarca("Asus");
		pc.setModelo("Zenbook");
		
	}

	@Override
	public void crearSO() {
		pc.setOs(new SistemaOperativo("Windows 10",64, "Home"));
		
	}

	@Override
	public void crearMainboard() {
		pc.setPlaca(new Mainboard("Prime", "Z370"));
		
	}

	@Override
	public void definirExtras() {
		pc.setCoolerExterno(false);
		
	}

}
