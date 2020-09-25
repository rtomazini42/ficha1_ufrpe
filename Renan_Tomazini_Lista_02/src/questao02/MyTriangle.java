package questao02;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3) {
		MyPoint v1 = new MyPoint(x1, y1);
		MyPoint v2 = new MyPoint(x2, y2);
		MyPoint v3 = new MyPoint(x3, y3);
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		
	}
	
	public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	

	
	public String tipo() {
		double d1 = v1.distance(v2);
		double d2 = v2.distance(v3);
		double d3 = v3.distance(v1);
		
		if(d1 == d2 || d2 == d3 || d3 == d1) {
			if(d1 == d3 && d2 == d3 && d3 ==d1) {
				return "Equilatero";
			}
			else {
				return "Isoceles";
			}
		}
		else {
			return "escaleno";
		}
		
	}
	
	
	public String toString() {
		String result = "MyTriangle "+ tipo() + "  vertices: " + v1.toString() + v2.toString() + v3.toString();
		return result;
		 
		
	}
	
	public boolean equals(MyTriangle t2) {
		
		if(v1.equals(t2.v1.getX(),t2.v1.getY()) && v2.equals(t2.v2.getX(),t2.v2.getY()) && v3.equals(t2.v3.getX(),t2.v3.getY()) ) {
					return true;
				}
		else {
			return false;
		}	
	}
	
	public double petimetro() {
		double d1 = v1.distance(v2);
		double d2 = v2.distance(v3);
		double d3 = v3.distance(v1);
		return d1 + d2 + d3;
	}
		
		
	
}
