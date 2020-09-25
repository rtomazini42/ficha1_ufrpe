package questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
	private int fichas = 100;
	int pontos;
	public static ArrayList<Carta> emJogo; //cartas do jogador
	//emJogo = new ArrayList<>();
	
	aBanca mesa = new aBanca();
	Scanner sc = new Scanner(System.in);
	
	
	public int getFichas() {
		return fichas;
	}
	
	public int getPontos() {
		return pontos;
	}

	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void ganhaFichas(int ganho) {
		this.fichas = fichas + ganho;
	}
	
	public void perdeFichas(int perda) {
		this.fichas = fichas - perda;
	}
	
	public void mostrarMesa() {
		System.out.println("____________");
		System.out.println("Cartas na mesa:");
		for(int i = 0; i < emJogo.size(); i++) {
			System.out.print(emJogo.get(i));
		}
		System.out.println("Pontos jogador: " + pontos);
		System.out.println("____________");
	}
	
	public void apostar() {
		System.out.println("Digite a aposta");
		int  aposta = Integer.parseInt(sc.nextLine());
		if (aposta > 1 && aposta <= fichas){
			if(aposta == fichas) {
				System.out.println("ALL IN");
				fichas = 0;
			}
			mesa.monte(aposta);
			fichas = fichas - aposta;
		}
		else {
			System.out.println("Aposta não pode ser menor que 2 ou maior que suas fichas");
			apostar();
		}
		
		
	}
	
	public boolean emJogo() {
		if(fichas > 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void inicio() {
		emJogo = new ArrayList<>();
		Carta carta = mesa.Sacador();
		emJogo.add(0,carta);
		pontos = pontos + carta.getValor();
		System.out.println("Primeira carta:");
		mostrarMesa();
		
	}
	
	public boolean jogada() {
		
		System.out.println("Digite a jogada:");
		System.out.println("1- pedir");
		System.out.println("2- segurar");
		int  escolha = Integer.parseInt(sc.nextLine());
		if (escolha == 1){
			Carta carta = mesa.Sacador();
			emJogo.add(emJogo.size(),carta);
			pontos = pontos + carta.getValor();
			mostrarMesa();
			return true;
			
		}
		if (escolha == 2) {
			return false;
		}
		else {
			System.out.println("Digite valor válido");
			return true;
		}
		
	}
}
