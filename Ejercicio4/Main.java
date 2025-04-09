public static void main(String[] args) {
        Celular miCelular = new Celular();
        
        
        miCelular.instalarAplicacion("WhatsApp", 50);
        miCelular.instalarAplicacion("Instagram", 120);
        miCelular.instalarAplicacion("Juego Pesado", 300);
        
        
        miCelular.mostrarEstado();
        
        
        miCelular.usarAplicacion("WhatsApp", 30);  // 3% (1% x 3 ciclos)
        miCelular.usarAplicacion("Instagram", 50); // 10% (2% x 5 ciclos)
        miCelular.usarAplicacion("Juego Pesado", 40); // 20% (5% x 4 ciclos)
        
        
        miCelular.usarAplicacion("WhatsApp", 10);
    }
