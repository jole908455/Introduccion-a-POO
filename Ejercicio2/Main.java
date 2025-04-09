public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");

        
        coche1.acelerar(); 
        coche1.acelerar(); 
        coche1.frenar();  

        
        coche2.acelerar(); 
        coche2.frenar();  
        coche2.frenar();  
        coche2.frenar();  

        
        System.out.println("\nVelocidad final " + coche1.getMarca() + ": " + coche1.getVelocidad() + " km/h");
        System.out.println("Velocidad final " + coche2.getMarca() + ": " + coche2.getVelocidad() + " km/h");
    }
