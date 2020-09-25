package questao02;


public class TestMyPoint {
	
	public static void TestMyPoint() {
		
		MyPoint p1 = new MyPoint(0,0);
		MyPoint p2 = new MyPoint(0,0);
		System.out.println(p1.equals(p2.getX(),p2.getY()));
		p2.setX(3);
		System.out.println(p1.equals(p2.getX(),p2.getY()));
		
		//para o "Desafio"
		
		MyPoint[] Pontos;
		Pontos = new MyPoint[10];
		for(int i = 0; i < 10; i++) {
			MyPoint p = new MyPoint(i+1,i+1);
			Pontos[i] = p;
			//System.out.println("adicionado");
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(Pontos[i].toString());
		}
		
	}

}
