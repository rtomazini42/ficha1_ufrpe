package questao03;

import java.util.Scanner;

public class gameLoop {
	Scanner sc = new Scanner(System.in);
	Jogador jogador = new Jogador();

	
	
	


	
	
	public gameLoop() {
		while(true) {
		int escolha = 1;
		System.out.println("Continuar jogo? 1 - sim, outros numeros para não");
		escolha = Integer.parseInt(sc.nextLine());
		if (escolha != 1) {
			System.out.println("Adeus!");
			System.exit(0);
		}
			
		boolean jogando = true;
		boolean vitoria = true;
		jogador.setPontos(0);
		jogador.mesa.setPontosBanca(0);
		
		System.out.println("Fichas = "+ jogador.getFichas());
		jogador.apostar();
		jogador.inicio();
		while(jogando) {
			jogando = (jogador.jogada());
			if (jogador.getPontos() > 21) {
				System.out.println("Ultrapassou 21!!!");
				vitoria = false;
			}
		
		}
		if (vitoria == true){
			jogador.mesa.bancaJoga();
			if (jogador.mesa.getPontosBanca() > 21 ){
				vitoria = true;
			}
			if (jogador.mesa.getPontosBanca() > jogador.getPontos()){
				vitoria = false;
			}
			if (jogador.mesa.getPontosBanca() == jogador.getPontos()){
				vitoria = false;
			}
			if (jogador.mesa.getPontosBanca() < jogador.getPontos()){
				vitoria = true;
			}
		}
		
		if (vitoria == true){
			System.out.println("+++++++\nVocê ganhou a rodada\n+++++++");
			System.out.println("Ganhou: "+ jogador.mesa.getValorAposta());
			jogador.ganhaFichas(jogador.mesa.getValorAposta());
			System.out.println("Fichas: "+ jogador.getFichas());
		}
		else {
			System.out.println("+++++++\nVocê perdeu a rodada\n+++++++");
			System.out.println("Perdeu: "+ jogador.mesa.getValorAposta()/2);
			jogador.perdeFichas(jogador.mesa.getValorAposta()/2);
			System.out.println("Fichas: "+ jogador.getFichas());
		}
		if(jogador.getFichas() < 1) {
			System.out.println("impossivel jogar mais");
			System.exit(0);
		}
		
		
	}
	}

	
}
