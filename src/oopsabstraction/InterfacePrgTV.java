package oopsabstraction;

interface tvRemote{
	
	public void colours();
	public void design();
	public void shape();
	
}


interface smartTVremote extends tvRemote{
	public void netflix();
	public void mute();
	
	
}



class  TV implements smartTVremote {

	@Override
	public void colours() {
		System.out.println("colour details");
		
	}

	@Override
	public void design() {
		System.out.println("design details");
		
	}

	@Override
	public void shape() {
		System.out.println("shape details");
		
	}

	@Override
	public void netflix() {
		System.out.println("netflix details");
		
	}

	@Override
	public void mute() {
		System.out.println("mute details");
		
	}
	
}



public class InterfacePrgTV {

	public static void main(String[] args) {
		
		TV t=new TV();
		t.colours();
		t.design();
		t.netflix();
		t.mute();
		t.shape();
		

	}

}
