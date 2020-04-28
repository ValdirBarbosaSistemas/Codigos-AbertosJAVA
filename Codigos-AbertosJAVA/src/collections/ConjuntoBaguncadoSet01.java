package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncadoSet01 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('X'); // char -> Character
		// Lembrando que na collection não suporta tipos primitivos, ou seja, ele irá
		// converter para os do tipo WRAPPER que são para objetos

		// na collection para ver o tamanho não é length e sim size
		System.out.println("O tamanho do conjunto é: " + conjunto.size());

		conjunto.add("teste"); // Vimos que não pode colocar valores iguais na collection, ou seja,
		// Ele não vai dar erro, ele só não vai incluir na collection
		
		System.out.println("O tamanho do conjunto é: " + conjunto.size());
		
		//para remover um elemento da collection coloca-se a palavra 'remove'
		conjunto.remove("teste");
		
		//caso ele remover o item certo, ele irá retornar um true. Caso o item não exista ele retornará false
		System.out.println("O tamanho do conjunto é: " + conjunto.size());
		
		/* Na collection também existe um método chamado 'contains' que serve para ver se há um 
		 * determinado item na collection. Se houver ele retornará true, caso não retornará false
		 */
		
		System.out.println(conjunto.contains(1.2)); //True porque existe
		System.out.println(conjunto.contains("teste")); // False porque foi removido
		
		Set nums = new HashSet(); //Esse modo de criação de collection também é possível
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // Irá adicionar TUDO da collection (nums) para a collection (conjunto)
		System.out.println(conjunto);
		
		//conjunto.clear(); Serve para limpar TODO o conjunto da collection
	}
}
