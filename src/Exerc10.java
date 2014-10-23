import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class Exerc10 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
		ArrayList<Integer> auxiliar = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
		
			listaInteiros.add(r.nextInt(30));
		}
		
		for (int i = 0; i < listaInteiros.size(); i++) {
			
			if(listaInteiros.get(i) % 2 != 0){
				
				auxiliar.add(listaInteiros.get(i));				
			}
		}
		for (int i = 0; i < listaInteiros.size(); i++) {
			
			if(listaInteiros.get(i) % 2 == 0){
				
				auxiliar.add(listaInteiros.get(i));
			}
		}
			
		System.out.println(auxiliar);
	}
}
