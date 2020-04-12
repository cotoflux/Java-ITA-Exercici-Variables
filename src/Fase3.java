
public class Fase3 {

	public static void main(String args[]) {
		int anyTraspas = 1948;
		byte anysIntermedis = 4;
		int aniversari = 1990;
		int anysTraspasAniversari = (aniversari - anyTraspas) /4;
		
		for(int i = 0; i <= anysTraspasAniversari; i++) {
			
			anyTraspas = anyTraspas + anysIntermedis;
			System.out.println(anyTraspas);
		}
	}
	
}
