package aplicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		String caminho = "C:\\Users\\dsilva\\Documents\\nomes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String nome = br.readLine();
			while(nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			
			Collections.sort(lista);
			for (String item : lista) {
				System.out.println(item);
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
