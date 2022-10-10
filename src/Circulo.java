
public class Circulo implements FormaGeometrica {
	
	//Testando este comentário
	
	private  double raio; 
	// final porque o número não pode ser alterado, algo taxado
	
	//Uma vez que já temos o valor não precisa colocar no construtor pois já é determinado
	private static final  double PI = 3.14;
	
	
	//Construtor
	public Circulo(double raio) {
		super();
		this.raio = raio;
		
		
	}
	
	// Métodos da Interface
	

	@Override
	public double area() {
		
		return (PI * raio * raio);
		
		
	}
	
	

	public double getRaio() {
		return ( 2 * PI * raio);
	}

	public static double getPi() {
		return PI;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	// Não tem set para o PI, visto que ele é statico e finalmente é ele

	@Override
	public double comprimento() {
		
		return ( 2 * PI * raio);
		
		
	}

}
