package curso_programacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Exercicio_40 {

	public static void main(String[] args) {

		File path = new File("c:\\temp\\produtos.csv");
		
		String sourceFolderStr = path.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String vendas = sourceFolderStr + "\\out\\summary.csv";


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Produto> prd = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] list = line.split(",");
				String name = list[0];
				double price = Double.parseDouble(list[1]);
				int quantity = Integer.parseInt(list[2]);
				prd.add(new Produto(name, price, quantity));
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(vendas))) {
				for (Produto pd : prd) {
					bw.write(pd.getName()+","+pd.TotalValueInStock());
					bw.newLine();
				}

			}

			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}

		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}

}
