package ejercicio6;

public class FacturaSubvencion extends Factura{
	private String codSub;
	
	public FacturaSubvencion(String concepto, String fecha, int importe, String codSub) {
		super(concepto, fecha, importe);
		this.codSub = codSub;
	}
	
	public void muestraFSub() {
		muestraFactura();
		System.out.println("C�digo de subvenci�n: " + codSub);
	}
}
