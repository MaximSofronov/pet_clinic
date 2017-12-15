public class Dog extends Pet {
	
	public Dog(String name, int ages) {
		this.name = name;
		this.ages = ages;
	}

	@Override
	public String voice() {
		return ("Haw");
	}
}