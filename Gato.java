package Animales;
class Gato extends Animal {
    private boolean esInterior;
    private String color;
    private boolean tienePelajeLargo;

    public Gato(String nombre, int edad, double peso, boolean esInterior, String color, boolean tienePelajeLargo) {
        super(nombre, edad, peso);
        this.esInterior = esInterior;
        this.color = color;
        this.tienePelajeLargo = tienePelajeLargo;
    }
            
    public void maullar() {
        System.out.println(getNombre() + " dice: ¡Miau miau!");
    }

    public void arañar(){
        System.out.println(getNombre() + "esta arañando...");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando...");
    }

    public void cazar() {
        System.out.println(getNombre() + " está cazando...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs interior: " + (esInterior ? "Sí" : "No") + "\nColor: " + color + "\nTiene pelaje largo: " + (tienePelajeLargo ? "Sí" : "No");
    }
}