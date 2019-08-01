package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path:");
		String path = sc.nextLine();
		System.out.println("Enter salary:");
		double salario = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Funcionarios> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionarios(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> salariosMaiores = list.stream()
					.filter(s -> s.getSalario() > salario)
					.map(s -> s.getEmail()).sorted(comp)
					.collect(Collectors.toList());
					
					salariosMaiores.forEach(System.out::println);
		
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
