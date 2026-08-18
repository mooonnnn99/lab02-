package Animales;
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Asher", 3, 8, "Labrador", true);
        Gato miGato = new Gato("Michi", 2, 4.5, true, "Siames", true);
        Canario miCanario = new Canario("Piolín", 1, 0.2, "Amarillo", true, 15);

        System.out.println(miPerro);
        miPerro.comer();
        miPerro.ladrar();
        miPerro.buscarPelota();
        miPerro.dormir();

        System.out.println("\n" + miGato);
        miGato.comer();
        miGato.maullar();
        miGato.arañar();
        miGato.ronronear();
        miGato.cazar();

        System.out.println("\n" + miCanario);
        miCanario.comer();
        miCanario.cantar();
        miCanario.volar();
        miCanario.picar();
        miCanario.dormir();
    }
    
    /*
¿Por qué declaramos los atributos como private y no como public?
porque nos permite controlar el acceso a los datos y mantener la integridad de los objetos.

¿Qué pasaría si quitaras el super() del constructor de Perro?
pasaria que no se inicializarian los atributos heredados de la clase Animal, lo que podría causar errores en tiempo de ejecución.


¿Qué ventaja tiene sobreescribir toString() en lugar de crear un método con otro nombre?
que permite una representación más legible y útil de los objetos al imprimirlos, ya que toString() es llamado automáticamente cuando se imprime un objeto.

*/
}
