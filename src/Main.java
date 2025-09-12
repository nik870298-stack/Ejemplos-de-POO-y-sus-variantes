public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------Ejemplo para Encapsulamiento publico y privado--------------");
        Factura factura = new Factura(1000);
        System.out.println("Total con impuesto: " + factura.calcularTotalConImpuesto());

        System.out.println("-----------------------Ejemplo para Encapsulamiento protegido-------------------");
        Automovil automovil = new Automovil();
        automovil.mostrarInfoAutomovil();

        System.out.println("-----------------------Ejemplo para Herencia----------------------------------");
        Perro miPerro = new Perro();
        miPerro.nombre = "Bobby";
        miPerro.comer();  // Método de la clase base
        miPerro.ladrar(); // Método de la clase derivada

        System.out.println("--------------------------Ejemplo para Polimorfismo----------------------------");
        animal miMascota = new perro();
        miMascota.hacerSonido(); // Llama al método del perro

        miMascota = new Gato();
        miMascota.hacerSonido(); // Llama al método del gato

    }

    //Ejemplo uno para encapsulamiento publico y privado
        public record Factura(double total) {

        public double calcularTotalConImpuesto() {
                double impuesto = calcularImpuestoInterno();  // Llamada al método privado
                return total + impuesto;
            }

            private double calcularImpuestoInterno() {
                // Supongamos que el impuesto interno es el 15% del total
                return 0.15 * total;
            }
        }
    //Ejemplo dos para encapsulamiento protegido
    static class Vehiculo {
        protected void obtenerInfoVehiculo() {
            System.out.println("Este es un vehículo.");
        }
    }

    static class Automovil extends Vehiculo {
        public void mostrarInfoAutomovil() {
            obtenerInfoVehiculo();  // Llamada al método protegido de la superclase
        }
    }
    // Ejemplo de Herencia
    public static class Animal {
        String nombre;
        public void comer() {
            System.out.println("El animal está comiendo.");
        }
    }
    public static class Perro extends Animal {
        public void ladrar() {
            System.out.println("El perro está ladrando.");
        }
    }
    //Ejemplo de polimorfismo
    public interface animal {
        void hacerSonido();
    }
    public static class perro implements animal {
        public void hacerSonido() {
            System.out.println("El perro ladra.");
        }
    }

    public static class Gato implements animal {
        public void hacerSonido() {
            System.out.println("El gato maulla.");
        }
    }

}