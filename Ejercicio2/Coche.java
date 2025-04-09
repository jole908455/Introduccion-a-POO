public class Coche {
    
    private String marca;
    private String modelo;
    private int velocidad;

    
    public Coche(String marca, String modelo) {
        this.setMarca(marca);
        this.modelo = modelo;
        this.velocidad = 0; 
    }

    
    public void acelerar() {
        this.velocidad += 10;
        System.out.println(getMarca() + " " + modelo + " aceleró. Velocidad actual: " + velocidad + " km/h");
    }

  
    public void frenar() {
        if (velocidad >= 5) {
            this.velocidad -= 5;
        } else {
            this.velocidad = 0;
        }
        System.out.println(getMarca() + " " + modelo + " frenó. Velocidad actual: " + velocidad + " km/h");
    }

    
    public int getVelocidad() {
        return velocidad;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
  }