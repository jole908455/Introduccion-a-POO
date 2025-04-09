import java.util.ArrayList;
import java.util.List;

public class Celular {
    
    private static final int MAX_APPS = 20;
    private static final int MAX_ESPACIO_MB = 1024;
    
    
    private int espacioDisponibleMb;
    private int bateria; 
    private List<Aplicacion> aplicaciones;
    
    
    private static class Aplicacion {
        String nombre;
        int tamanioMb;
        
        public Aplicacion(String nombre, int tamanioMb) {
            this.nombre = nombre;
            this.tamanioMb = tamanioMb;
        }
    }
    
    
    public Celular() {
        this.espacioDisponibleMb = MAX_ESPACIO_MB;
        this.bateria = 100;
        this.aplicaciones = new ArrayList<>();
    }
    
  
    public boolean instalarAplicacion(String nombre, int tamanioMb) {
        if (aplicaciones.size() >= MAX_APPS) {
            System.out.println("No se puede instalar. Límite de aplicaciones alcanzado (20).");
            return false;
        }
        
        if (tamanioMb > espacioDisponibleMb) {
            System.out.println("No hay suficiente espacio. Espacio disponible: " + espacioDisponibleMb + "MB");
            return false;
        }
        
        aplicaciones.add(new Aplicacion(nombre, tamanioMb));
        espacioDisponibleMb -= tamanioMb;
        System.out.println("Aplicación '" + nombre + "' instalada. Espacio restante: " + espacioDisponibleMb + "MB");
        return true;
    }
    
   
    public void usarAplicacion(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. Batería agotada.");
            return;
        }
        
        Aplicacion app = buscarAplicacion(nombre);
        if (app == null) {
            System.out.println("Aplicación '" + nombre + "' no encontrada.");
            return;
        }
        
        int consumoPorcentaje = calcularConsumoBateria(app.tamanioMb, minutos);
        bateria = Math.max(0, bateria - consumoPorcentaje);
        
        System.out.println("Usando '" + nombre + "' por " + minutos + " minutos.");
        System.out.println("Batería consumida: " + consumoPorcentaje + "%");
        System.out.println("Batería restante: " + bateria + "%");
        
        if (bateria <= 0) {
            System.out.println("¡Batería agotada! Celular apagado.");
        }
    }
    
    
    private int calcularConsumoBateria(int tamanioMb, int minutos) {
        int ciclos10Min = minutos / 10;
        if (tamanioMb > 250) {
            return 5 * ciclos10Min;
        } else if (tamanioMb > 100) {
            return 2 * ciclos10Min;
        } else {
            return 1 * ciclos10Min;
        }
    }
    
    
    private Aplicacion buscarAplicacion(String nombre) {
        for (Aplicacion app : aplicaciones) {
            if (app.nombre.equals(nombre)) {
                return app;
            }
        }
        return null;
    }
    
   
    public void mostrarEstado() {
        System.out.println("\n--- Estado del Celular ---");
        System.out.println("Batería: " + bateria + "%");
        System.out.println("Espacio disponible: " + espacioDisponibleMb + "MB/" + MAX_ESPACIO_MB + "MB");
        System.out.println("Aplicaciones instaladas: " + aplicaciones.size() + "/" + MAX_APPS);
        System.out.println("--------------------------");
    }
}