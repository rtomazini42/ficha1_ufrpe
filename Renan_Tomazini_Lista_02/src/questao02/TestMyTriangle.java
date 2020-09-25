package questao02;

public class TestMyTriangle {
	public static void TestMyTriangle() {
		MyTriangle t1 = new MyTriangle(0,0,4,0,2,3);
		MyTriangle t2 = new MyTriangle(0,0,4,0,2,3);
		System.out.println(t1.equals(t2));
		MyTriangle t3 = new MyTriangle(3,1,4,5,2,3);
		System.out.println(t1.equals(t3));
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		
		System.out.println(t1.petimetro());
		
	}
}
