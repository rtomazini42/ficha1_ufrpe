package questao03;

import java.util.ArrayList;

public class aBanca {
	private static ArrayList<Carta> banca;
	Baralho baralho = new Baralho();
	private int valorAposta = 0;
	private int pontosBanca = 0;
	
	public aBanca() {
		banca = new ArrayList<>();
		//baralho.embaralha();
	}
	


	public int getPontosBanca() {
		return pontosBanca;
	}
	
	public int getValorAposta() {
		return valorAposta;
	}
	


	public Carta Sacador() {
		//sacador.add(0, baralho.sacar());
		//sacador.add(baralho.sacar());
		Carta carta = baralho.sacar();
		//sacada.add(0, carta);;
		//Carta carta = sacador.get(sacador.size());
		//System.out.println(carta.toString());
		return carta;
	}
	
	
	public void mostrarBanca() {
		System.out.println("---------------");
		System.out.println("Cartas da banca:");
		for(int i = 0; i < banca.size(); i++) {
			System.out.print(banca.get(i));
		}
		System.out.println("____________");
		System.out.println("Pontos da Banca:  "+ pontosBanca);
	}
	

	
	public void monte(int aposta) {
		System.out.println("A mesa aposta:"+ aposta);
		valorAposta = aposta * 2;
	}
	


	public static void setBanca(ArrayList<Carta> banca) {
		aBanca.banca = banca;
	}



	public void bancaJoga() {
		int n = Jogador.emJogo.size();
		for(int i = 0; i < n; i++) {
			Carta carta = Sacador();
			banca.add(i,carta);
			pontosBanca = pontosBanca + carta.getValor();
			
		}
		mostrarBanca();
	}



	public void setPontosBanca(int pontosBanca) {
		this.pontosBanca = pontosBanca;
	}


	







	

}
