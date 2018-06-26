package practice;

public class Worker extends Person {
	int contractNo;

	public int getContractNo() {
		return contractNo;
	}

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}

	public Worker(String name, String lastName, int id, String city, int contractNo) {
		super(name, lastName, id, city);
		this.contractNo = contractNo;
	}
	
	public Worker() {
		
	}

	@Override
	public void sayHello() {
		System.out.println("Hello worker!");
	}
	
}
