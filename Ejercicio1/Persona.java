public class Persona {
    
    private String nombre;
    private int edad;
    private String ciudad;

    
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad + ".");
    }

    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }
}