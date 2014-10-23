import java.util.ArrayList;
import java.util.Random;



public class Exerc12 {
	
	public static void main(String[] args) {
		

		
		Random r = new Random();
		
		ArrayList<Integer> listaInteiros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
		
			listaInteiros.add(r.nextInt(30));
		}
		
		System.out.println(listaInteiros);
		
		boolean ordenado = false;
		
		while(ordenado == false){
			
			ordenado = true;
			
			for (int i = 0; i < listaInteiros.size()-1; i++) {
				
				if(listaInteiros.get(i) > listaInteiros.get(i+1)){
					
					int variavelAuxiliar = listaInteiros.get(i+1);
					listaInteiros.set(i+1, listaInteiros.get(i));
					listaInteiros.set(i, variavelAuxiliar);
					
					ordenado = false;
				}
			}
		}
		System.out.println(listaInteiros);	
	}
}
