package org.example;

import java.util.ArrayList;

public class cafe {
    // Clase Cafe

        private String nombre;
        private double precio;
        private double gramosCafe;
        private double mlAgua;
        private String tamaño;

        public cafe(String nombre, double precio, double gramosCafe, double mlAgua, String tamaño) {
            this.nombre = nombre;
            this.precio = precio;
            this.gramosCafe = gramosCafe;
            this.mlAgua = mlAgua;
            this.tamaño = tamaño;
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public double getGramosCafe() {
            return gramosCafe;
        }

        public void setGramosCafe(double gramosCafe) {
            this.gramosCafe = gramosCafe;
        }

        public double getMlAgua() {
            return mlAgua;
        }

        public void setMlAgua(double mlAgua) {
            this.mlAgua = mlAgua;
        }

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        // Método toString para mostrar información detallada del café
        @Override
        public String toString() {
            return "Café: " + nombre + "\n"
                    + "Precio: $" + precio + "\n"
                    + "Gramos de café: " + gramosCafe + "g\n"
                    + "Mililitros de agua: " + mlAgua + "ml\n"
                    + "Tamaño: " + tamaño;
        }
























































































}
