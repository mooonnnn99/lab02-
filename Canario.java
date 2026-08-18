package Animales;
class Canario extends Animal{
    private String colorPlumaje;
    private boolean cantaEnJaula;
                private int envergaduraAlas;

    public Canario(String nombre, int edad, double peso, String colorPlumaje, boolean cantaEnJaula, int envergaduraAlas) {
        super(nombre, edad, peso);
            this.colorPlumaje = colorPlumaje;
            this.cantaEnJaula = cantaEnJaula;
            this.envergaduraAlas = envergaduraAlas;
    }

    public void cantar() {
        System.out.println(getNombre() + " está cantando...");
    }

    public void volar() {
        System.out.println(getNombre() + " está volando...");
    }

    public void picar(){
    System.out.println(getNombre() + " está picando...");
    }

    public void dormir() {
        System.out.println(getNombre() + " está durmiendo...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor del plumaje: " + colorPlumaje + "\nCanta en jaula: " + (cantaEnJaula ? "Sí" : "No") + "\nEnvergadura de alas: " + envergaduraAlas;
    }
}
