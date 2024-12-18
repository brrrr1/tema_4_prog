package ejercicio01;

public class Libreria implements IInterfaz {
	
	public Libreria() {
		//listado como atributo
	}

	@Override
	public int publicacionesAnterioresA(Publicaciones[] listado, int anio) {
		// TODO Auto-generated method stub
		int contador = 0;
		for (int i = 0; i < listado.length; i++) {
			if(anio>listado[i].getAnioPublicacion()) {
				contador++;
			}
		}
		return contador;
	}

	@Override
	public int cuentaPrestados(Publicaciones[] listado) {
		// TODO Auto-generated method stub
		int contador = 0;
		for (int i = 0; i < listado.length; i++) {
			if(listado[i].isPrestado()) {
				contador++;
			}
		}	
		return contador;
	}
	
	public void verPublicaciones(Publicaciones[] listado, int objetivoFelicitaciones) {
		for (int i = 0; i < listado.length; i++) {
			System.out.println("Autor: ");
			System.out.print(listado[i].getAutor());
			
			System.out.println();
			
			System.out.println("Nombre: ");
			System.out.print(listado[i].getNombre());
			
			
			System.out.println();
			
			System.out.println("Año: ");
			System.out.print(listado[i].getAnioPublicacion());
			
			System.out.println();
			
			System.out.println("Prestado: ");
			if(listado[i].isPrestado()) {
				System.out.print("SI");
			}else {
				System.out.print("NO");
			}
			
			System.out.println();
			
			System.out.println("Número de Ediciones: ");
			
			System.out.print(objetivoFelicitaciones);		
			
			contarRevistas(listado, objetivoFelicitaciones);
			
			System.out.println("\n");
		}

	}
	
	public void contarRevistas(Publicaciones[] listado, int objetivoFelicitaciones) {
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] != null) {
				if(listado[i] instanceof Revista) {
					((Revista) listado [i]).felicitarEdiciones(objetivoFelicitaciones);
				}
			}
		}
		
	}

}
