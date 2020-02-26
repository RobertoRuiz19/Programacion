package ejercicio6;

public class FacIngSub extends FacturaSubvencion {
	private String organismo;

	public FacIngSub(String concepto, String fecha, int importe, String codSub, String organismo) {
		super(concepto, fecha, importe, codSub);
		this.organismo = organismo;
	}
	
	public void muestraFacIngreso() {
		muestraFSub();
		System.out.println("Organismo: " + organismo);
	}

}
