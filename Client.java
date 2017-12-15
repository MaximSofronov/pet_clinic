public class Client {
	private String name;
	private Pet pet;

	public Client(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
	}

	public Client() {}

	public String info() {
		return("Clients name is " + this.name + ". Clients pets name is " + this.pet.getName() + ". Clients pet ages is " + this.pet.getAges() + ". " + this.pet.voice() + ".");
	}

	public void changeName(String newName) {
		this.name = newName;
		return;
	}

	public String getName() {
		return this.name;
	}

	public Pet getPet() {
		return this.pet;
	}
}