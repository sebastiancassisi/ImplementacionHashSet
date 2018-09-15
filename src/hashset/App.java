package hashset;

import java.util.HashSet;
import java.util.Set;

public class App {

	//HashSet No permite repetidos, no tiene criterio de ordenamiento.
	
	public static void main(String[] args) {
		
		/*Set<String> lista = new HashSet<>();
		lista.add("Sebastian");
		lista.add("Cassisi");
		lista.add("Hernandez");
		lista.add("Sebastian");

		for (String string : lista) {
			System.out.println(string);
		}*/
		
		Set<Persona> lista = new HashSet<>();
		
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(1, "Sebastian", 66));
		lista.add(new Persona(1, "Sebastian", 66));
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
	}

}
