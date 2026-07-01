import controller.PersonaController;
import model.Persona;
import java.util.*;

public class App {
    public static void main(String[] args) {
       List<Persona> personas = new ArrayList<>();

    personas.add(new Persona("Juan Pérez", 25));
    personas.add(new Persona("Ana López", 15));
    personas.add(new Persona("Juan Morales", 25));
    personas.add(new Persona("María García", 30));
    personas.add(new Persona("Carlos Sánchez", 22));
    personas.add(new Persona("Laura Fernández", 18));
    personas.add(new Persona("Pedro Ramírez", 40));
    personas.add(new Persona("Sofía Torres", 27));
    personas.add(new Persona("Diego Herrera", 35));
    personas.add(new Persona("Valentina Cruz", 20));

    PersonaController pc = new PersonaController();
        System.out.println("filtrar y ordenar");
        System.out.println(pc.filtrarYOrdenar(personas, 25));
        System.out.println();

        System.out.println("agrupar");
        System.out.println(pc.agruparPorRangoDeEdad(personas));
    }
}