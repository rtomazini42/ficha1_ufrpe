package questao02;

public class TestMyCircle {
	public static void TestMyCircle() {
		System.out.println("Aqui o circulo");
		MyCircle circ = new MyCircle(1,1,1);
		MyCircle circ2 = new MyCircle(1,1,1);
		System.out.println(circ.equals(circ2));
		circ.setCenterXY(1, 0);
		//System.out.println(circ.toString());
		//System.out.println(circ2.toString());
		System.out.println(circ.equals(circ2));
		circ.setCenterXY(3, 1);
		circ.setRadius(2);
		
		System.out.println("Função de area :"+ circ.getArea());
		System.out.println("Função de achar centro :"+ circ.getCenter());
		System.out.println(circ.toString());
		System.out.println(circ2.toString());
		
	}
}
