
public class Fase1 {
	
	public static void main (String args[]) {
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
	}

}
