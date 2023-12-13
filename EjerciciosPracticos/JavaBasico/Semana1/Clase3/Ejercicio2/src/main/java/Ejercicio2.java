/**
 * <h1>Ejercicio N&ordm; 2 - POO - Individual</h1>
 *
 * <p>
 *     Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad,
 *     dirección y número de teléfono (tener en cuenta todos sus atributos,
 *     constructores y métodos getters y setters).
 * </p>
 * <ol type="a">
 *     <li>Crear un vector de tipo Persona cinco posiciones.
 *     Crear cinco personas y guardarlas en él.</li>
 *     <li>Recorrer el vector creado y mostrar por pantalla el nombre y edad
 *     de cada persona almacenada.</li>
 *     <li>c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes,
 *     realizar el cambio y luego mostrar el después de los datos de las dos personas
 *     cuyos nombres fueron cambiados.</li>
 *     <li>d) Recorrer el vector y mostrar por pantalla únicamente a las personas
 *     cuya edad sea mayor de 30 años.</li>
 * </ol>
 */

public class Ejercicio2 {
    public static void main (String[] args){
        Person person1 = new Person("1", "Pepe", 75, "Calle la mota", "78954213");
        Person person2 = new Person("2", "Pepita", 69, "Avenida falsa", "6667898451");
        Person person3 = new Person("3", "Manolo", 26, "Al fondo a la derecha", "3213646");
        Person person4 = new Person("4", "Juanito", 16, "Ahi al lado", "14578943547");
        Person person5 = new Person("5", "Josefina", 55, "Ni idea", "54786168476");

        Person[] people = {person1, person2, person3, person4, person5};

        for(Person person : people){
            System.out.printf("Nombre: %s\nEdad: %d\n\n", person.getName(), person.getAge());
        }

        System.out.println("Antes del cambio de nombres");
        System.out.println(person1.toString());
        System.out.println();
        System.out.println(person2.toString());

        person1.setName("Pepito");
        person2.setName("Manolita");

        System.out.println("Despues del cambio de nombres");
        System.out.println(person1.toString());
        System.out.println();
        System.out.println(person2.toString());


        System.out.println("Mostrando personas mayores de 30 años\n\n");
        for(Person person : people){
            if (person.getAge() > 30)
                System.out.println(person.toString());
        }
    }
}
