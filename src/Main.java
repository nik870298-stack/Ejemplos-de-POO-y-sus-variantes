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
        Al miMascota = new Dog();
        miMascota.hacerSonido(); // Llama al método del perro

        miMascota = new Gato();
        miMascota.hacerSonido(); // Llama al método del gato


        System.out.println("--------------------------Ejemplo para Abstracción-----------------------------");
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();


        System.out.println("---------------------------Ejemplo de Records----------------------------------");
        Persona persona = new Persona("Carlos", 30);
        System.out.println(persona.nombre()); // Carlos
        System.out.println(persona.edad());   // 30
        System.out.println(persona);          // Persona[nombre=Carlos, edad=30]
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
    public interface Al {
        void hacerSonido();
    }
    public static class Dog implements Al {
        public void hacerSonido() {
            System.out.println("El perro ladra.");
        }
    }
    public static class Gato implements Al {
        public void hacerSonido() {
            System.out.println("El gato maulla.");
        }
    }


    //Ejemplo de Abstracción
    interface Vehicle {
        void start();
        void stop();
    }

    static class Car implements Vehicle {
        public void start() {
            System.out.println("Car starting");
        }

        public void stop() {
            System.out.println("Car stopping");
        }
    }


    //Ejemplo de Records
    public record Persona(String nombre, int edad) {
    }
}