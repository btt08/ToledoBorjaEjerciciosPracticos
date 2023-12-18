/**
 * <h1>Ejercicio N&ordm; 2 - Herencia y Polimorfismo - Individual</h1>
 * <p>
 *     Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).
 * </p>
 * <ul type = a>
 *     <li>
 *         <p>
 *             Crear las siguientes clases hijas que compartan sus atributos y métodos:
 *         </p>
 *         <ul>
 *             <li>Zapato: material, tipoCierre</li>
 *             <li>Pantalon: estilo, tipoTejido</li>
 *             <li>Camiseta: manga, cuello</li>
 *             <li>Sombrero: tipo, tamaño</li>
 *         </ul>
 *     </li>
 *     <li>Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).</li>
 *     <li>
 *         <p>
 *             Crear los siguientes métodos (en cada subclase correspondiente):
 *         </p>
 *         <ul>
 *             <li>Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).</li>
 *             <li>Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).</li>
 *             <li>Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).</li>
 *             <li>Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).</li>
 *         </ul>
 *     </li>
 *     <li>Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.</li>
 * </ul>
 */


public class Ejercicio2 {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("code1", "nombre1", 10,"marca1","talla1", "color1", "material1", "cordones1");
        Shoe shoe2 = new Shoe("code2", "nombre2", 20,"marca2","talla2", "color2", "material2", "cordones2");
        Shoe shoe3 = new Shoe("code3", "nombre3", 30,"marca3","talla3", "color3", "material3", "cordones3");

        Trousers trousers1 = new Trousers("code4", "nombre4", 40,"marca4","talla4", "color4", "estilo1", "material1");
        Trousers trousers2 = new Trousers("code5", "nombre5", 50,"marca5","talla5", "color5","estilo2", "material2");
        Trousers trousers3 = new Trousers("code6", "nombre6", 60,"marca6","talla6", "color6","estilo3", "material3");

        Tshirt tshirt1 = new Tshirt("code7", "nombre7", 70,"marca7","talla7", "color7","mangas1", "cuello1");
        Tshirt tshirt2 = new Tshirt("code8", "nombre8", 80,"marca8","talla8", "color8","mangas2", "cuello2");

        Hat hat1 = new Hat("code9", "nombre9", 90,"marca9","talla9", "color9","tipo1", "talla1");

        Outfit[] outfits = {shoe1, shoe2, shoe3, trousers1, trousers2, trousers3, tshirt1, tshirt2, hat1};

        for (Outfit outfit : outfits){
            outfit.showBrand();
        }

    }
}
