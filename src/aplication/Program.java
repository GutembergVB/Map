package aplication;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> cookies = new TreeMap<>();  // TreeMap<>() ordena 
		// Map<>() não admite repetição do objeto chave
		
		cookies.put("username","Maria"); // chave e valor "username"," Maria"
		cookies.put("email","maria@gmail.com");
		cookies.put("phone","987654323");
		cookies.remove("email");// removeu a chave "email"
		cookies.put("phone", "91234567");// .put irá sobescrever o novo valor a chave "phone"
		
		System.out.println("ALL COOKIES: ");
		for(String key: cookies.keySet()){ // KeySet(), retorna um Set<K> com as chaves do Map.
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // irá retonar true/false
		System.out.println("Contains value de 'phone key: " + cookies.values());// mostra todos os valores contido na lista
		System.out.println("phone number: " + cookies.get("phone"));// retorna o valor da chave
		System.out.println("Email: " + cookies.get("email"));// chamar um valor que não existe o Map retorna: null
		System.out.println("Size: " + cookies.size()); // tamanho do Map
		System.out.println("-----------------------------------------------------------------------------");
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		stock.put(p1, 10000.0);// quantidades no estoque
		stock.put(p2, 20000.0);// quantidade no estoque
		stock.put(p3, 15000.0); // quantidade no estoque
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));// no Map contain a chave igual o prduto ps?
		/* ira retorna false pois está comparando se estar no mesmo espaço da mémoria, implementar o equals e hashCode
		 na classe Product para comparar o valor da chave "Tv".
		 */
		for(Double quantidade: stock.values()){ // retorna a quantidade no estoque
			System.out.println( quantidade);
		}
	}
}