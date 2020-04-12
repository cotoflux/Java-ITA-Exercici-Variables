
public class Fase4 {

	public static void main(String[] args) {

			String nom = "Nuria ";
			String cognom1 = "Puig ";
			String cognom2 = "Riera";
			String totalNom = nom + cognom1 + cognom2;
			
			byte dia = 13;
			byte mes = 04;
			short any = 1990;
			String barra = "/";
			
			String diaBarra = dia + barra + mes + barra + any;
			
			System.out.println(totalNom);
			System.out.println(diaBarra);
			
			int anyTraspas = 1948;
			byte anysIntermedis = 4;
			int aniversari = 1990;
			int anysTraspasAniversari = (aniversari - anyTraspas) /4;
			Boolean esDeTraspas;
			
			for(int i = 0; i <= anysTraspasAniversari; i++) {
				
				anyTraspas = anyTraspas + anysIntermedis;

			}
		
				
			if(aniversari %4 == 0){
				System.out.println("Es un any de traspas");
			} else {
				System.out.println("No es un año de traspas");
			}

	}

}
