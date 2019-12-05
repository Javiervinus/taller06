/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		ComputadorDirector directorROG = new ComputadorDirector(new AsusROGbuilder());
		directorROG.ConstruirComputador();
		Computador roge = directorROG.getComputador();
		
		ComputadorDirector directorZenbook = new ComputadorDirector(new AsusZenbookBuilder());
		directorZenbook.ConstruirComputador();
		Computador zenbook = directorZenbook.getComputador();
		
		System.out.println(roge.getMarca()+ roge.getModelo() );
		System.out.println("marca: "+roge.getMarca()+"/n"+"modelo: "+roge.getModelo()+"/n"+"Ram: "+roge.getTipoRam()
				+roge.getRam()+"/n"+"almacenamiento: "+roge.getAlmacenamiento()+"gb"+ "  "+roge.getTipoAlmacenamiento()+"/n"
				+"Sistema operativo: "+roge.getOs().toString()
				+"mainboard: "+roge.getPlaca().toString());
		
		System.out.println(zenbook.getMarca()+ zenbook.getModelo() );
		System.out.println("marca: "+zenbook.getMarca()+"/n"+"modelo: "+zenbook.getModelo()+"/n"+"Ram: "+zenbook.getTipoRam()
				+zenbook.getRam()+"/n"+"almacenamiento: "+zenbook.getAlmacenamiento()+"gb"+ "  "+zenbook.getTipoAlmacenamiento()+"/n"
				+"Sistema operativo: "+zenbook.getOs().toString()
				+"mainboard: "+zenbook.getPlaca().toString());
	}

}
