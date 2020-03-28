package _01_AnimalFarm;

class Pig extends Animal{
	String noise = "";
	Pig(){
		
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("OINK!");
	}
	@Override
	void doTrick() {
		// TODO Auto-generated method stub
		System.out.println("The pig rolls in the mud");
	}
}