package questao03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baralho {
	private static ArrayList<Carta> cartas;
	Scanner sc = new Scanner(System.in);
	//private static ArrayList<Carta> emJogo;
	
    public Baralho() {
    	int mult;
        cartas = new ArrayList<>();
        while(true) {
        System.out.println("Digite o numero de Baralhos: \nSe maior que 10 ele fará com 10");
        mult = Integer.parseInt(sc.nextLine());
        if(mult < 1) {
        	System.out.println("Não permitido negativos");
        	}
        else {
        	if(mult > 10) {
            	mult = 10;
            	break;
            	}
        	break;
        }
        

        }
        for (int n = 0; n<mult;n++){
    		criarCartas();
    		 //System.out.println("baralho criado");
    	}
        //criarCartas();
        embaralha();
        //System.out.println("baralho criado");
    }
    


	private void criarCartas() {
		String naipe[] = {"Copas","Paus", "Espadas", "Ouros"};
		
		for(int n = 0; n < 4; n++) {
			for(int v =1; v < 14;v++) {
				criaCarta(naipe[n], v);
			}
		}
		
		
	}
	
	private void criaCarta(String naipe, int valor) {
		Carta nova = new Carta(naipe, valor);
		cartas.add(nova);
	}
    
	public void embaralha() {
		Collections.shuffle(cartas);
		//emJogo = new ArrayList<>();
		//System.out.println(cartas.toString());
	}
	
	

	
	public Carta sacar() {
		//System.out.println("teste");
		Carta sacada = cartas.get(0);
		//System.out.println("Carta sacada: "+ cartas.get(0));
		cartas.remove(0);
		//System.out.println("Carta topo: "+ cartas.get(0));
		return(sacada);
		
	}
	
    
    
}
