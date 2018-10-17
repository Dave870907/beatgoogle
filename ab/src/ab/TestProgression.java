package ab;

public class TestProgression {
	public static void main(String[] args) throws Exception{
		 Progression prog;
		 prog = new ArithmeticProgssion(1, 2);
		 prog.printProgression(100);
		 prog = new GeomProgression(1,3);
		try {
		 prog.printProgression(50);
		 
		}
		catch(Exception abc) {
			System.out.println("");
		System.out.println(abc);
		
		}
		 prog = new FiboProgression(1,2);
		 prog.printProgression(20);
		 }
}
