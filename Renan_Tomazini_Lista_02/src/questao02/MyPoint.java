package questao02;

public class MyPoint {
	
	private int x;
	private int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.y = y;
		this.x = x;
	}
	
	public String toString() {
		String resultado = "[X : "+ getX() + " | Y : " + getY() + "]  ";
		return resultado;
	}
	
	public double distance(int x, int y) {
		int d1 = x - getX();
		int d2 = y - getY();
		if(d1 < 0) {
			d1 = d1 * -1;
		}
		if(d2 < 0) {
			d2 = d2 * -1;
		}
		d1 = d1 * d1;
		d2 = d2 * d2;
		double res = d1 + d2;
		res = Math.sqrt(res);
		return res;
	}
	
	public double distance(MyPoint Ponto) {
		double res = this.distance(Ponto.getX(), Ponto.getY());
		return res;
	}
	
	public boolean equals(int x,int y) {
		if(getX() == x && getY() == y) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}

	
	

