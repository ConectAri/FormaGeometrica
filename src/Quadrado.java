


public class Quadrado implements FormaGeometrica {
	
	
	private double lado;
	
	
	// Construtor sempre é o nome da classe
	
	public Quadrado(double lado) {
	
		this.lado = lado;
		
		
	}
	
	

	@Override
	public double area() {
		
			
		return (lado*lado);
	}

	@Override
	public double comprimento() {
		//Perímetro é a soma dos lados
		
		return (lado);
	}
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
