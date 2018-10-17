package ab;

	

public class Progression {
	
	protected long first;
	protected long cur;
	Progression(){ //Constructor
	 first = cur = 1;
	}
	protected long firstValue(){ //Reset cur
	 cur = first;
	 return cur;
	}
	protected long nextValue() throws Exception{ //cur = cur+1; return cur;
	 return ++cur;
	}
	protected void printProgression(int n) throws Exception{
		System.out.print(firstValue());
	for(int i =2; i<=n; i++)
		 System.out.print(" "+ nextValue());
		System.out.println();
		
		}
	


}
