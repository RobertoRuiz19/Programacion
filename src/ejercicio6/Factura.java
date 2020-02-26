package ejercicio6;

public class Factura {
	private static int nFactura = 1;
	private String concepto;
	private String fecha;
	private int importe;

	public Factura(String concepto, String fecha, int importe) {
		this.concepto = concepto;
		this.fecha = fecha;
		this.importe = importe;
	}
	
	public void muestraFactura() {
		System.out.println("N� de factura: " + nFactura);
		System.out.println("Concepto: " + concepto);
		System.out.println("Fecha: " + fecha);
		System.out.println("Importe: " + importe);
		nFactura++;
	}
}