package org.example;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        cafeteria cafeteria = new cafeteria("Mi Cafetería", "Calle Principal 123", "@mi_cafeteria");

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("----- Menú de la Cafetería -----");
            System.out.println("1. Agregar Café");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Buscar Café");
            System.out.println("4. Buscar Producto");
            System.out.println("5. Salir");
            System.out.println("---------------------------------");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); //

            switch (opcion) {
                case 1:
                    System.out.println("----- Agregar Café -----");
                    System.out.print("Nombre: ");
                    String nombreCafe = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioCafe = scanner.nextDouble();
                    System.out.print("Gramos de café: ");
                    int gramosCafe = scanner.nextInt();
                    System.out.print("Mililitros de agua: ");
                    int mlAgua = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer mlAgua
                    System.out.print("Tamaño: ");
                    String tamañoCafe = scanner.nextLine();

                    cafe cafe = new cafe(nombreCafe, precioCafe, gramosCafe, mlAgua, tamañoCafe);
                    cafeteria.agregarCafe(cafe);
                    System.out.println("Café agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("----- Agregar Producto -----");
                    System.out.print("Nombre: ");
                    String nombreProducto = scanner.nextLine();

                    productos producto = new productos(nombreProducto);
                    cafeteria.agregarProducto(producto);
                    System.out.println("Producto agregado exitosamente.");
                    break;

              case 3:
                    System.out.println("----- Buscar Café -----");
                    System.out.print("Buscar por (tamaño/gramos): ");
                    String atributoCafe = scanner.nextLine();
                    System.out.print("Valor a buscar: ");
                    String valorCafe = scanner.nextLine();

                    cafe cafeEncontrado = cafeteria.buscarCafePorTamaño(atributoCafe, valorCafe);
                    if (cafeEncontrado != null) {
                        System.out.println("Café encontrado: " + cafeEncontrado.toString());
                    } else {
                        System.out.println("No se encontró ningún café.");
                    }
                    break;

                case 4:
                    System.out.println("----- Buscar Producto -----");
                    System.out.print("Nombre del producto: ");
                    String nombreProductoBusqueda = scanner.nextLine();

                    productos productoEncontrado = cafeteria.buscarProducto(nombreProductoBusqueda);
                    if (productoEncontrado != null) {
                        System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
                    } else {
                        System.out.println("No se encontró ningún producto.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }


}
