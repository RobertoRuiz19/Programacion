package ejercicio6;

public class Factura {
	private int nFactura = 1;
	private String concepto;
	private String fecha;
	private int importe;
	private static int sec = 1;

	public Factura(String concepto, String fecha, int importe) {
		this.concepto = concepto;
		this.fecha = fecha;
		this.importe = importe;
		nFactura = sec;
		sec++;
	}
	
	public void muestraFactura() {
		System.out.println("Nº de factura: " + nFactura);
		System.out.println("Concepto: " + concepto);
		System.out.println("Fecha: " + fecha);
		System.out.println("Importe: " + importe);
	}
}
