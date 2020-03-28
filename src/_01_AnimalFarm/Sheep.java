package _01_AnimalFarm;

class Sheep extends Animal{
	String noise = "";
	Sheep(){
		
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("BAAAAH!");
	}
	@Override
	void doTrick() {
		// TODO Auto-generated method stub
		System.out.println("The sheep jumps over a fence");
	}
}
