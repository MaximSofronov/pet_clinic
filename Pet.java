public abstract class Pet {
	protected String name;
	protected int ages;

	public void changeName(String newName) {
		this.name = newName;
		return;
	}


	public String getName() {
		return this.name;
	}

	public int getAges() {
		return this.ages;
	}

	public abstract String voice();
}