package questao02;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	
	
	public MyPoint getCenter() {
		return center;
	}
	
	public MyCircle(){
		this.radius = 0;
		MyPoint c = new MyPoint(0,0);
		this.center = c;
	}
	
	public MyCircle(int x,int y, int rad){
		this.radius = rad;
		MyPoint c = new MyPoint(x,y);
		//System.out.println("criado em ponto "+ c.toString());
		this.center = c;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	
	public String toString() {
		String resultado = "Raio : "+ getRadius()  + " || Ponto : " + center.toString();
		return resultado;
	}
	
	public double getArea() {
		double resultado = 3.14 * (getRadius()*getRadius());
		return resultado;
	}
	
	public boolean equals(MyCircle c2) {
		if(c2.radius == radius && c2.center.equals(center.getX(), center.getY())) {
			
			return true;
		}
		else {
			return false;
		}
	}
}
