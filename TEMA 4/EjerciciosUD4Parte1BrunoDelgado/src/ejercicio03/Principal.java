package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cilindrada = 333;
		double caballos = 333;
		int categoriaECO = 2;
		double fijo = 2000;
		double fijoTransporte = 3333;
		
		VehiculosAMotor vm = new VehiculosAMotor(333, 333, 3);
		
		Motocicleta m = new Motocicleta(111, 111, 1);
		
		Coche c = new Coche (222, 222, 2);
		
		Furgoneta f = new Furgoneta (444,444,4, fijoTransporte);
		
		System.out.println(vm.calcularImpuesto(fijo));
		
		System.out.println(m.calcularImpuesto(fijo));
		
		System.out.println(c.calcularImpuesto(fijo));
		
		System.out.println(f.calcularImpuesto(fijo));
		
	}

}
