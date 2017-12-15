/**
* Realizes clinic with clients which have pets.
* There are funcrions: addition new client, deletion client, searching by clients name, searching by pets name, showing all datebase.
* Tests are in main().
*/

public class Clinic {
	private final Client[] clients;
	private static int lastId;

	public Clinic(final int size) {
		this.clients = new Client[size];
	}

	public static void main(String[] arg) {
		final Clinic clinic = new Clinic(10);

		clinic.addClient(new Client("Max", new Cat("Markiz", 9)));
		clinic.addClient(new Client("Sanya", new Dog("Vasya", 2)));
		clinic.addClient(new Client("Andrey", new Cat("Sharik", 4)));
		clinic.addClient(new Client("Mephistophel", new Dog("Svyatoslav", 8)));
		clinic.showAllDatebase();


		System.out.println("Serching and changing tests");
		clinic.clients[clinic.searchByClientsNameReturnId("Sanya")].changeName("Petya");
		clinic.showAllDatebase();

		clinic.clients[clinic.searchByClientsNameReturnId("Petya")].changeName("Sanya");
		clinic.showAllDatebase();


		clinic.clients[clinic.searchByPetsNameReturnId("Sharik")].getPet().changeName("Smesharik");
		clinic.showAllDatebase();

		clinic.clients[clinic.searchByPetsNameReturnId("Smesharik")].getPet().changeName("Sharik");
		clinic.showAllDatebase();


		System.out.println("Deletion and addition tests");
		clinic.deleteClient(1);
		clinic.showAllDatebase();

		clinic.addClient(new Client("Andrey", new Cat("Sharik", 4)));
		clinic.showAllDatebase();

		return;
	}


	public void addClient(final Client client) {
		this.clients[lastId++] = client;
	}


	public Client searchByClientsName(String name) {
		int foundId = -1;
		for (int i = 0; i < lastId; i++) {
			if (this.clients[i].getName().equals(name)) {
				foundId = i;
				break;
			}
		}

		Client found;

		if (foundId == -1) {
			found = new Client();
		} else {
			found = new Client(this.clients[foundId].getName(), this.clients[foundId].getPet());
		}

		return found;
	}

	public int searchByClientsNameReturnId(String name) {
		int foundId = -1;
		for (int i = 0; i < lastId; i++) {
			if (this.clients[i].getName().equals(name)) {
				foundId = i;
				break;
			}
		}

		return foundId;
	}


	public Client searchByPetsName(String name) {
		int foundId = -1;
		for (int i = 0; i < lastId; i++) {
			if (this.clients[i].getPet().getName().equals(name)) {
				foundId = i;
				break;
			}
		}

		Client found;

		if (foundId == -1) {
			found = new Client();
		} else {
			found = new Client(this.clients[foundId].getName(), this.clients[foundId].getPet());
		}

		return found;
	}

	public int searchByPetsNameReturnId(String name) {
		int foundId = -1;
		for (int i = 0; i < lastId; i++) {
			if (this.clients[i].getPet().getName().equals(name)) {
				foundId = i;
				break;
			}
		}

		return foundId;
	}


	public void deleteClient(int id) {
		for (int i = id; i < lastId - 1; i++) {
			this.clients[i] = this.clients[i + 1];
		}
		this.clients[lastId] = new Client();
		lastId--;
		return;
	}


	public void showAllDatebase() {
		System.out.println("All datebase:");
		for (int i = 0; i < lastId; i++) {
			System.out.println((i + 1) + ") "+ this.clients[i].info());
		}
		System.out.println();
	}
}