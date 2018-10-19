package aplicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		String caminho = "C:\\Users\\dsilva\\Documents\\nomes-valores.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String funcionarioCsv = br.readLine();
			while(funcionarioCsv != null) {
				String[] campos = funcionarioCsv.split(",");
				
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1]))); 
				funcionarioCsv = br.readLine();
			}
			
			Collections.sort(lista);
			for (Funcionario item : lista) {
				System.out.println(item.getNome() +" R$: "+ item.getSalario());
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
