package ejercicio02;

public class Ventas {

	private Producto[]listado;

	public Ventas(Producto[] listado) {
		this.listado = listado;
	}
	
	public int calcularSinVender(int tam) {
		boolean encontrado = false;
		int i = 0;
		int contador=0;
		while(i<tam&&!encontrado) {
			if(listado[i].isVendido()) {
				i++;
			}else {
				contador++;
				i++;
			}
		}
		return contador;
	}
	

	
	public double calcularTotalVentas(double porcentaje, double fijoDoble) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado +listado[i].calcularPVP(porcentaje, fijoDoble);
		}
		return resultado;
	}
	
	public double devolverCambio(double entregado, double porcentaje, double fijoDoble, int tam, int id) {
		if(entregado>calcularPVPProducto(porcentaje, fijoDoble, tam, id)) {
			return entregado-calcularPVPProducto(porcentaje, fijoDoble, tam, id);
		}else {
			return 0;
		}
	}
	
	public void verLista() {
		//id  precio  cantidad  nombre  vendido
		System.out.println("id\t\tPrecio\t\tCantidad\t\tVendido");
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].getId()+"\t\t"+listado[i].getPrecioBase()+"\t\t"+listado[i].getNombre()+"\t\t\t"+listado[i].isVendido());
		}
	}
	
	public Producto findById(int tam, int id) {
		boolean encontrado = false;
		int i = 0;
		while(i<tam && !encontrado) {
			if(listado[i].getId()==id) {
				encontrado=true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return listado[i];
		}else {
			return null;
		}
	}
	
	public double calcularPVPProducto(double porcentaje, double fijoDoble, int tam, int id) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			listado[i]=findById(tam, id);
		if(listado[i] instanceof EspadaLaser) {
			resultado = listado[i].calcularPVP(porcentaje, fijoDoble)+fijoDoble;
		}else {
			resultado = listado[i].calcularPVP(porcentaje, fijoDoble);
		}

		}
		return resultado;
	}
	
	public void verListaConAviso() {
		System.out.println("id\t\tPrecio\t\tCantidad\t\tVendido\t\tTipo");
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].getId()+"\t\t"+listado[i].getPrecioBase()+"\t\t"+listado[i].getNombre()+"\t\t"+listado[i].isVendido()+"\t\t"+((EspadaLaser)listado[i]).getTipo()+"\t\t");
			if(listado[i]instanceof EspadaLaser) {
				((EspadaLaser)listado[i]).avisoEspadaDoble();
			}
		}
	}
	
	/*public void verListaConAviso() {
		String tipo = "Doble";
		String tipoComparado;
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] instanceof EspadaLaser) {
				tipoComparado=((EspadaLaser)listado[i]).getTipo();
				if(tipoComparado==tipo) {
					System.out.println("id\t\tPrecio\t\tCantidad\t\tVendido");
					for (int j = 0; j < listado.length; j++) {
						System.out.println(listado[i].getId()+"\t\t"+listado[i].getPrecioBase()+"\t\t"+listado[i].getNombre()+"\t\t\t"+listado[i].isVendido()+((EspadaLaser)listado[i]).getTipo()+"\t\t");
						((EspadaLaser)listado[i]).avisoEspadaDoble();
					}
				}
			}else {
				System.out.println("id\t\tPrecio\t\tCantidad\t\tVendido");
				for (int i1 = 0; i1 < listado.length; i1++) {
					System.out.println(listado[i1].getId()+"\t\t"+listado[i1].getPrecioBase()+"\t\t"+listado[i1].getNombre()+"\t\t\t"+listado[i1].isVendido());
				}
			}
		}
	}*/
	
	
	
}


