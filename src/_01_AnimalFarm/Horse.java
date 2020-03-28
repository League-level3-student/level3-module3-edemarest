package _01_AnimalFarm;

public class Horse extends Animal{
	String noise = "";
	public Horse(){
		
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("NEIGH!");
	}
	@Override
	void doTrick() {
		// TODO Auto-generated method stub
		System.out.println("The horse stands on two legs");
	}
}