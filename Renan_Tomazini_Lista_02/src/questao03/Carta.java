package questao03;

public class Carta {
	private int valor;
	private String naipe;
	

    public Carta(String naipe,int valor) {
        this.valor = valor;
        this.naipe = naipe;
    }


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getNaipe() {
		return naipe;
	}


	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	public String toString() {
		return "Carta: "+ getNaipe() + " " + getValor() + "\n";
	}
	
	
}
