package proyecto.model;
import java.util.ArrayList;

public class Catalogo {
	ArrayList<Pelicula> miArrayList = new ArrayList<>();
	
	 public void agregarPeli(Pelicula movie) {
	        miArrayList.add(movie);
	    }
	 public Pelicula buscarPeli(String nombre) {
	        for (Pelicula pelicula : miArrayList) {
	            if (pelicula.getNombre().equals(nombre)) {
	            	  System.out.println("-------------------------");
	                  System.out.println("Título: " + pelicula.getNombre());
	                  System.out.println("Director: " + pelicula.getDirector());
	                  System.out.println("Año: " + pelicula.getAnio());
	                  System.out.println("Género: " + pelicula.getGenero());
	                  System.out.println("-------------------------");
	                return pelicula;
	            }
	        }
	        return null; 
	    }
	public void mostrarCatalogo() {
		System.out.println("Catálogo de películas:");
		for (Pelicula pelicula : miArrayList) {
            System.out.println("-------------------------");
            System.out.println("Título: " + pelicula.getNombre());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Año: " + pelicula.getAnio());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("-------------------------");
	
	}
	 
	 }
	}

	
	
