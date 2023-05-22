package org.example;
import org.example.cafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    // Clase Cafeteria
    public class cafeteria {
        private String nombre;
        private String direccion;
        private String redesSociales;
        private List<cafe> listaCafes;

        public cafeteria(String nombre, String direccion, String redesSociales) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.redesSociales = redesSociales;
            this.listaCafes = new ArrayList<>();
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getRedesSociales() {
            return redesSociales;
        }

        public void setRedesSociales(String redesSociales) {
            this.redesSociales = redesSociales;
        }

        public List<cafe> getListaCafes() {
            return listaCafes;
        }

        // Método para agregar un nuevo café a la lista de cafés a la venta
        public void agregarCafe(cafe cafe) {
            listaCafes.add(cafe);
        }

        // Método para eliminar un café de la lista de cafés a la venta
        public void eliminarCafe(cafe cafe) {
            Iterator<cafe> iterator = listaCafes.iterator();
            while (iterator.hasNext()) {
                cafe cafeActual = iterator.next();
                if (cafeActual.equals(cafe)) {
                    iterator.remove();
                    break;
                }
            }
        }

        // Método para buscar un café en la lista de cafés a la venta por su tamaño
        public cafe buscarCafePorTamaño(String tamaño) {
            for (cafe cafe : listaCafes) {
                if (cafe.getTamaño().equalsIgnoreCase(tamaño)) {
                    return cafe;
                }
            }
            return null;
        }
    }


