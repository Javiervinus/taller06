package emsamablajecomputadoras.creacional;

public class AsusROGbuilder extends ConstructorComputadora{

	@Override
	public void definirComputadora() {
		pc = new Computador();
		pc.setRam(32);
		pc.setTipoRam("ddr4");
		pc.setTipoAlmacenamiento("HDD");
		pc.setAlmacenamiento(1000);
		pc.setMarca("Asus");
		pc.setModelo("ROG");
	}

	@Override
	public void crearSO() {
		pc.setOs(new SistemaOperativo("Windows 10",64, "Pro"));
		
	}

	@Override
	public void crearMainboard() {
		pc.setPlaca(new Mainboard("Strix", "x99"));
		
	}

	@Override
	public void definirExtras() {
		pc.setCoolerExterno(false);
	}

}
