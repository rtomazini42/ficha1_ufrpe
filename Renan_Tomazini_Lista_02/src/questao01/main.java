package questao01;
import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		int dia;
		int mes; 
		int ano;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia");
		dia  = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o mês");
		mes  = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o ano");
		ano  = Integer.parseInt(sc.nextLine());
		
		DataUser data =new DataUser(dia,mes,ano);
		
		System.out.println("Dias passados: "+data.getDiasPraHoje()); // a & b do exercicio
		
		System.out.println("Nova data: "+ data.soma()); // c do exercicio
		System.out.println("Em agosto "+ data.agosto()); // d & e do exercicio
		
		System.out.println("----Contar dias úteis----"); // f do exercicio
		System.out.println("Primeira data");
		System.out.println("Digite o dia");
		dia  = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o mês");
		mes  = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o ano");
		ano  = Integer.parseInt(sc.nextLine());
		DataUser inicio =new DataUser(dia,mes,ano);
		System.out.println("Segunda data");
		System.out.println("Digite o dia");
		dia  = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o mês");
		mes  = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o ano");
		ano  = Integer.parseInt(sc.nextLine());
		DataUser fim =new DataUser(dia,mes,ano);
		
		System.out.println("Dias úteis entre as datas "+ inicio.qtdDiaUtil(inicio, fim));
	}
		
}
