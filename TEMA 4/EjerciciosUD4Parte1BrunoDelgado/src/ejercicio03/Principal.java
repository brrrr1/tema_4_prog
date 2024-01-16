package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fijo = 100;
		double fijoTransporte = 300;
		double porcentajeMoto = 60;
		double porcentajeCoche = 25;
		
		VehiculosAMotor vm = new VehiculosAMotor(100, 100, 1);
		
		Motocicleta m = new Motocicleta(100, 100, 2);
		
		Coche c = new Coche (100, 100, 4);
		
		Furgoneta f = new Furgoneta (100,100,4, fijoTransporte);
		
		System.out.println(vm.calcularImpuesto(fijo, porcentajeMoto, porcentajeCoche));
		
		System.out.println(m.calcularImpuesto(fijo, porcentajeMoto, porcentajeCoche));
		
		System.out.println(c.calcularImpuesto(fijo, porcentajeMoto, porcentajeCoche));
		
		System.out.println(f.calcularImpuesto(fijo, porcentajeMoto, porcentajeCoche));
		
	}

}
