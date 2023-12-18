/**
 * <h1>Ejercicio N&ordm; 1 - Herencia, Polimorfismo y Encapsulamiento - Individual</h1>
 * <p>
 *     Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:
 * </p>
 * <ul type=a>
 *     <li>
 *         <p>
 *             Crear sus clases hijas que compartan sus atributos y métodos:
 *         </p>
 *         <ul>
 *             <li>"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat</li>
 *             <li>"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.</li>
 *             <li>"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.</li>
 *         </ul>
 *     </li>
 *     <li>
 *         <p>
 *             Una vez creadas las clases, crear los siguientes métodos:
 *         </p>
 *         <ul>
 *             <li>"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".</li>
 *             <li>"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".</li>
 *             <li>"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".</li>
 *         </ul>
 *     </li>
 *     <li>En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.</li>
 *     <li> Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?</li>
 *     <li>Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?</li>
 * </ul>
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Bird bird = new Bird();
        Reptile reptile = new Reptile();

        mammal.speak();
        bird.speak();
        reptile.speak();

        // Si creamos un objeto de la clase padre y le asignamos un objeto de un tipo hijo
        // este se asigna y se castea al tipo hijo gracias al polimorfismo
        Animal animalMammal = mammal;
        animalMammal.speak();

        /*
            Si se cambia el acceso del método speak de public a private, no se puede ejecutar en el método main por falta de acceso
         */
    }
}
