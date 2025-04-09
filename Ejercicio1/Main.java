public static void main(String[] args) {
        
        Persona persona1 = new Persona("Joel", 25, "La Paz");
        Persona persona2 = new Persona("Naomi", 17, "Beni");
        Persona persona3 = new Persona("Gabriel", 30, "Pando");

       
        persona1.saludar();
        persona2.saludar();
        persona3.saludar();

     
        System.out.println("\n¿Son mayores de edad?");
        System.out.println(persona1.getNombre() + ": " + persona1.esMayorDeEdad());
        System.out.println(persona2.getNombre() + ": " + persona2.esMayorDeEdad());
        System.out.println(persona3.getNombre() + ": " + persona3.esMayorDeEdad());
    }
