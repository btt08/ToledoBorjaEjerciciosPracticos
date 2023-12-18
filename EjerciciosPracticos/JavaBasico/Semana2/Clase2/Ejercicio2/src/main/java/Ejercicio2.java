import java.util.ArrayList;

/**
 * <h1>Ejercicio N&ordm; 2 - Collections - Individual (Extra/Opcional)</h1>
 * <p>
 * Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario. Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.
 * </p>
 * <p>
 * A partir de esto, realizar las siguientes acciones en el programa desarrollado:
 * </p>
 * <ul type=a>
 *     <li>Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).</li>
 *     <li>Guardar estos objetos creados en un ArrayList.</li>
 *     <li>Recorrer el ArrayList y determinar el producto con el mayor precio de venta.</li>
 *     <li>Recorrer el ArrayList y determinar el producto con el menor precio de costo.</li>
 *     <li>Borrar el producto que se encuentre en la posición 5 del ArrayList.</li>
 *     <li>Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.</li>
 *     <li>Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.</li>
 * </ul>
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Product object1 = new Product("id1", "object1", "marca1", "type1", 750, 1000, 25);
        Product object2 = new Product("id2", "object2", "marca2", "type2", 300, 450, 15);
        Product object3 = new Product("id3", "object3", "marca3", "type3", 17, 25, 50);
        Product object4 = new Product("id4", "object4", "marca4", "type4", 70, 105, 19);
        Product object5 = new Product("id5", "object5", "marca5", "type5", 1350, 1999, 4);
        Product object6 = new Product("id6", "object6", "marca6", "type6", 4, 6, 150);
        Product object7 = new Product("id7", "object7", "marca7", "type7", 42, 60, 74);
        Product object8 = new Product("id8", "object8", "marca8", "type8", 219, 316, 24);
        Product object9 = new Product("id9", "object9", "marca9", "type9", 115, 137, 42);
        Product object10 = new Product("id10", "object10", "marca10", "type10", 99, 175, 57);

        ArrayList<Product> products = new ArrayList<>();
        products.add((object1));
        products.add((object2));
        products.add((object3));
        products.add((object4));
        products.add((object5));
        products.add((object6));
        products.add((object7));
        products.add((object8));
        products.add((object9));
        products.add((object10));

        // Recorrer el ArrayList y determinar el producto con el mayor precio de venta
        Product aux = object1;
        for (Product product : products) {
            if (aux.getSellPrice() < product.getSellPrice()) {
                aux = product;
            }
        }

        System.out.println("El producto con el mayor precio de venta es: ");
        System.out.println(aux.toString());

        // Recorrer el ArrayList y determinar el producto con el menor precio de costo
        aux = object1;
        for (Product product : products) {
            if (aux.getBuyPrice() > product.getBuyPrice()) {
                aux = product;
            }
        }

        System.out.println("El producto con el menor precio de costo es: ");
        System.out.println(aux.toString());

        // Borrar el producto que se encuentre en la posición 5 del ArrayList.
        System.out.println("\nSe elimina el index 5: ");
        System.out.println(products.remove(5));



        // Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
        aux = object1;
        for (Product product : products) {
            if (product.getStock() > aux.getStock()) {
                aux = product;
            }
        }
        System.out.println("El producto con más stock es: ");
        System.out.println(aux.toString());


        System.out.println("\nSe restan 3 al stock");
        aux.setStock(aux.getStock() - 3);

        System.out.println("El nuevo stock es: " + aux.getStock());

        // Imprimir lista completa
        for(Product product : products)
            System.out.println(product.toString());


    }
}
