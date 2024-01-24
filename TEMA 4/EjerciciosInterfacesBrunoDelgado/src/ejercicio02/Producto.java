package ejercicio02;

public class Producto implements IImpuesto {

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		int cien = 100;
		return precio*iva/cien;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
