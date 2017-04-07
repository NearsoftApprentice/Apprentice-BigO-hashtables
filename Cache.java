import java.util.*;
import java.io.*;

public class Cache{
 private static int CACHE_SIZE = 10;

	public static void main(String[] args){
		try(BufferedReader insertions = new BufferedReader(new FileReader("insertions"));
			BufferedReader data = new BufferedReader(new FileReader("data.csv"))){
			// Primer línea de encabezados
			data.readLine();
			
			// Primero leer todos los datos.
			String registro;
			ArrayList<Persona> personas = new ArrayList<>();
 			while ((registro = data.readLine()) != null) {
 			ArrayList<String> campos = new ArrayList<>(Arrays.asList(registro.split(",")));
			personas.add(new Persona(
				Integer.parseInt(campos.get(0)), 
				campos.get(1), campos.get(2), campos.get(3)));
    		}
    		// Después las inserciones
    		String insercion; 
    		ArrayList<Integer> inserciones = new ArrayList<>();
    		while ((insercion = insertions.readLine()) != null) {
 				inserciones.add(Integer.valueOf(insercion));
    		}			

    		// Preparar el caché
    		LRUCacheHash<Integer, Persona> cache = new LRUCacheHash<>(CACHE_SIZE);

    		// Inserciones
    		for(Integer idInsercion: inserciones){
    			cache.put(idInsercion, personas.get(idInsercion.intValue()));
    		}

    		// Número de borrados
    		System.out.println(cache.getBorrados());

    		}catch (NumberFormatException nfe) {
		        System.err.println(" Entrada no formateada");
		        System.exit(1);
		    }catch (IOException ioe) {
		        System.err.println("Error de escritura");
		        System.exit(1);
		    }
		}	
}
