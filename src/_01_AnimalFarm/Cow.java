package _01_AnimalFarm;

class Cow extends Animal{
	String noise = "";
	Cow(){
		
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("MOOOO!");
	}
	@Override
	void doTrick() {
		// TODO Auto-generated method stub
		System.out.println("The cow rings its cowbell");
	}
}