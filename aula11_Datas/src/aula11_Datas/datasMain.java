package aula11_Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

	//Fazer um programa para ler uma data no formato dd/MM/yyyy e apresentar ela no formato yyyyMMdd.

public class datasMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorArquivo = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		LocalDate dataLd = LocalDate.parse(data, formatadorBarra);
		System.out.println(dataLd.format(formatadorArquivo));
		sc.close();
	}

}
