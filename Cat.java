public class Cat extends Pet {

	public Cat(String name, int ages) {
		this.name = name;
		this.ages = ages;
	}

	@Override
	public String voice() {
		return ("Meow");
	}
}