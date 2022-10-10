
public class TestaFormaGeometricaemgrupo {
	
	public static void main(String[] args) {
		
		//Estanciou o objeto para chamar o método
		//Formageometrica, aqui é um círculo e é uma forma geométrica
		FormaGeometrica circulo = new Circulo(4);
		
		//chamar a área do círculo
		circulo.area();
		System.out.println(" O valor da área do círculo é: " + circulo.area());
		
		circulo.comprimento();
		System.out.println(" O valor do comprimento do círculo é: " + circulo.comprimento() + "\n");
		System.out.println(" ");
		
				
		// O exercício pede FormaGeométrica
		FormaGeometrica quadrado = new Quadrado(4);
		
		quadrado.area();
		System.out.println(" O valor da área do quadrado é: " + quadrado.area());
		System.out.println(" O valor de comprimento do quadrado é: " + quadrado.comprimento());
		
		
	}

}
