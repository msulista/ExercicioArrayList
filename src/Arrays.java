import java.util.ArrayList;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> teste = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		
		teste.add("Bernardo");
		teste.add("Pedro");
		teste.add("Tiago");
		teste.add("Lucas");
		teste.add("Cesar");
		
		// Exercicio 1
		System.out.println(teste.get(2));
		
		// Exercicio 2
		System.out.println(teste.remove(2));
		System.out.println(teste.size());
				
		// Exercicio 3
		for(int i = 0; i < teste.size(); i++){
			if (teste.get(i).equalsIgnoreCase("Lucas")){
				System.out.println(teste.get(i) + " está na Array!");
			}
		}
		
		// Exercicio 4
		System.out.println(teste.size());
	
		
		// Exercicio 5
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		somaElementos(numeros);
		
		System.out.println(somaElementos(numeros));
		
		
		// Exercicio 6
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Boolean> c = new ArrayList<Boolean>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		b.add(7);
		b.add(8);
		b.add(3);
		b.add(4);
		
		System.out.println(comparaArrays(a, b));
		
		
		// Exercicio 7
		System.out.println("Exercicio 7");
		System.out.println(intersecciona(a, b));
		
		// Exercicio 8
		System.out.println("Exercicio 8");
		System.out.println(uniao(a, b));
		
		//Exercicio 9
		System.out.println("Exercicio 9");
		System.out.println("Imprime A");
		for(int i = 0; i < a.size(); i++){
			
			System.out.print(a.get(i) + ", ");			
		}
		
		trocaPosicao(a);

		System.out.println("Imprime Trocado\n");
		for(int i = 0; i < a.size(); i++){
			
			System.out.print(a.get(i) + ", ");	
		}	
		
	}
	
	
	public static int somaElementos(ArrayList<Integer> numeros){
		int soma = 0;
		for(int i = 0; i < numeros.size(); i++){
			soma = soma + numeros.get(i);
		}
		return soma;
	}
	
	
	public static boolean comparaArrays(ArrayList<Integer> a, ArrayList<Integer> b){
		
		ArrayList<Boolean> c = new ArrayList<Boolean>();
		
		if (a.size() == b.size()){
			c.add(true);
		}else{
			c.add(false);
		}
		
		return c.get(0);
		

	}
	
	public static ArrayList<Integer> intersecciona(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		for (int i = 0; i < a.size(); i++){
			for (int j = 0; j < a.size(); j++) {
				if(a.get(i) == b.get(j)){
					c.add(a.get(i));
				}				
			}
		}
		
		return c;

	}
	
	public static ArrayList<Integer> uniao(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> listaUniao = new ArrayList<Integer>();
		
		for (int i = 0; i < a.size(); i++){
			
			listaUniao.add(a.get(i));
			listaUniao.add(b.get(i));						
		}
		
		return listaUniao;

	}
	
	public static ArrayList<Integer> trocaPosicao(ArrayList<Integer> a){
		
		ArrayList<Integer> listraTrocaPosicao = new ArrayList<Integer>();
		listraTrocaPosicao.add(a.get(0));
		listraTrocaPosicao.add(a.get(a.size() -1));
		
		int menor = 0;
		int maior = 0;
		int i;
		int j;
			
		
		for(i = 0; i < a.size(); i++){
			for (j = 0; j < a.size(); j++) {
				
				//Encontra o menos
				if(listraTrocaPosicao.get(0) < a.get(j) ){
					
					menor = j;					
				}
				//Encontra o maior
				if(listraTrocaPosicao.get(1) > a.get(j) ){
					
					maior = j;										
				}				
			}			
		}
		a.add(menor, a.get(maior));
		a.add(maior, a.get(menor));
		
		return a;		
	}



}
