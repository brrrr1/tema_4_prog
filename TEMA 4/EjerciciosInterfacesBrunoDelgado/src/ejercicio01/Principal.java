package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Publicaciones l1 = new Libro (false, "Luismi", "Aprende SQL", 2009);
		
		Publicaciones l2 = new Libro (true, "Rafa", "Aprende HTML", 2017);
		
		Publicaciones r1 = new Revista (false, "Miguel", "Revista IP: Todo sobre redes", 2020);
		
		Publicaciones r2 = new Revista (false,"'Angel", "Revista Java", 2016);
		
		int tam = 4;
		
		int anio;
		
		Publicaciones [] listado = new Publicaciones [tam];
		
		listado[0] = l1;
		
		listado[1] = l2;
		
		listado[2] = r1;
		
		listado[3] = r2;
		
		Libreria lib = new Libreria ();
		
		System.out.println("Diga año");
		
		anio = Leer.datoInt();
		
		System.out.println("Hay "+lib.publicacionesAnterioresA(listado, anio)+" anteriores al año "+anio);
		
		System.out.println("Hay "+lib.cuentaPrestados(listado)+" libros prestados");
		
		lib.verPublicaciones(listado);

	}

}
