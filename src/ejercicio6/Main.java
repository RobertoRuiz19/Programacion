package ejercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f1 = new Factura("Factura1", "12/2/20", 1200);
		FacturaSubvencion f2 = new FacturaSubvencion("Factura2", "12/3/20", 3000, "Subvencion");
		FacIngSub f3 = new FacIngSub("Factura3", "12/3/22", 12000, "Ingrso", "Ayuntamiento");
		Factura f4 = new Factura("Hola", "20/2/8", 1233);
		Factura f5 = new Factura("Concepto", "20/14/41", 43123);
		
		f1.muestraFactura();
		System.out.println("----------------");
		f2.muestraFSub();
		System.out.println("----------------");
		f3.muestraFacIngreso();
		System.out.println("----------------");
		f4.muestraFactura();
		System.out.println("----------------");
		f5.muestraFactura();
		System.out.println("----------------");
		f1.muestraFactura();
		System.out.println("----------------");
		f3.muestraFacIngreso();
		System.out.println("----------------");
	}

}
