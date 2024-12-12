package oopsabstraction;



interface CarsDetails{
	
	
	public void acceleration();
	void speedlimit();
	public void torque();
	
}



class Benz implements CarsDetails{

	@Override
	public void acceleration() {
		System.out.println("Accelaration details of benz");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("speedlimit details of benz");
		
	}

	@Override
	public void torque() {
		System.out.println("torque details of benz");
		
	}
	
} 
public class InterfacePgm {

	public static void main(String[] args) {
		Benz obj=new Benz();
		obj.acceleration();
		obj.speedlimit();
		obj.torque();

	}

}
