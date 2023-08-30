package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio_22 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add(2,"Marco");
		list.add("Marta");
		list.add("Bob");
		list.add("Beth");
		
		
		System.out.println(list.size());
		for(String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------");
		
		list.remove("Maria");
		list.remove(1);
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'B');
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------------");
		System.out.println("Index of Marta: " + list.indexOf("Marta"));
		System.out.println("Index of Marcia: " + list.indexOf("Marcia"));
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String obj : result) {
			System.out.println(obj);
		}
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println( name);
		System.out.println("------------------------");
		String nulo = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println( nulo);		
		
	}
}
