package practice;

public class Boss extends Person {

	
	int bossId;
	
	@Override
	public void sayHello() {
		System.out.println("Hello boss!");
	}

	public int getBossId() {
		return bossId;
	}

	public void setBossId(int bossId) {
		this.bossId = bossId;
	}

	public Boss(String name, String lastName, int id, String city, int bossId) {
		super(name, lastName, id, city);
		this.bossId = bossId;
	}

	public Boss() {
		
	}
	
}
