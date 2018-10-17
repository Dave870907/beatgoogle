package ab;

public class GeomProgression extends Progression{
	protected long r;
	GeomProgression(){ //first =1, r =1 by default
	 this(1,1); //first = 1; r = 1;
	}
	GeomProgression(int a, int base) { //Set r to base
	 first = a;
	 r = base;
	}
	protected long nextValue() throws Exception{
	 cur *= r; //cur = cur*r;
	 if(cur<0) {
		throw new Exception("negative value") ;
	
	 } 
	
	 return cur;
	} 
}
