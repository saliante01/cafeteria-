package org.example;
import org.example.cafeteria;
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Cafeteria
        cafeteria cafeteria = new cafeteria("Mi Cafetería", "Calle Principal 123", "@MiCafeteria");

        // Crear instancias de la clase Cafe
        cafe cafe1 = new cafe("Café Latte", 2.5, 10, 200, "Grande");
        cafe cafe2 = new cafe("Café Americano", 1.8, 8, 150, "Mediano");
        cafe cafe3 = new cafe("Café Cappuccino", 3.0, 12, 250, "Grande");

        // Agregar los cafés a la lista de cafés a la venta
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        cafeteria.agregarCafe(cafe3);

        //crear instancias de productos

        productos producto1 = new productos("Alfajores");
        productos producto2= new productos("té");

        //agregar productos a la lista en la cafeteria
         cafeteria.agregarProducto(producto1);
         cafeteria.agregarProducto(producto2);
        //agregar un nuevo producto
        productos producto3= new productos("berlines");
        cafeteria.agregarProducto(producto3);

        System.out.println("Productos disponibles despues de agregar uno nuevo");
        for(productos producto: cafeteria.getListaProductos()){
            System.out.println(producto.getNombre());
        }
        //eliminar un producto existente
        cafeteria.eliminarProducto(producto2);

        System.out.println("Productos disponibles después de eliminar uno:");
        for (productos producto : cafeteria.getListaProductos()) {
            System.out.println(producto.getNombre());
        }
        // Mostrar el menú de la cafetería
        System.out.println("Menú de la Cafetería " + cafeteria.getNombre() + ":");
        for (cafe cafe : cafeteria.getListaCafes()) {
            System.out.println(cafe.getNombre() + " - $" + cafe.getPrecio());
        }

        // Eliminar un café de la lista de cafés a la venta
        cafeteria.eliminarCafe(cafe2);

        // Mostrar el menú de la cafetería después de eliminar un café
        System.out.println("\nMenú de la Cafetería " + cafeteria.getNombre() + " después de eliminar un café:");
        for (cafe cafe : cafeteria.getListaCafes()) {
            System.out.println(cafe.getNombre() + " - $" + cafe.getPrecio());
        }

        // Buscar un café por su tamaño
        String tamañoBuscado = "Grande";
        cafe cafeBuscado = cafeteria.buscarCafePorTamaño(tamañoBuscado);

        if (cafeBuscado != null) {
            System.out.println("\nCafé encontrado de tamaño " + tamañoBuscado + ":");
            System.out.println(((cafe) cafeBuscado).toString());
        } else {
            System.out.println("\nNo se encontró ningún café de tamaño " + tamañoBuscado);
        }
        //mostar informacion de micafeteria
        System.out.println("Nombre de la cafetería: " + cafeteria.getNombre());
        System.out.println("Dirección: " + cafeteria.getDireccion());
        System.out.println("Redes sociales: " + cafeteria.getRedesSociales());
    }
}



