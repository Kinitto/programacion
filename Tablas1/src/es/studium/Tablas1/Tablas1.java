package es.studium.Tablas1;

public class Tablas1 {

	public static void main(String[] args) {
		final int TAM = 20;
		int [] Pares = new int [TAM];
		int i;
		
		for (i=0;i<TAM;i++) {
			Pares[i]=i*2;
		}
		
		for (i=0;i<TAM;i++) {
			System.out.println(Pares[i]);
		}
				
	}

}
