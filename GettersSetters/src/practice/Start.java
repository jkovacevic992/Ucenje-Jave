package practice;

public class Start {
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		for(int i=0; i<persons.length;i++) {
			persons[i] = Person.createPerson();
		}
		
		System.out.println(persons[2].getName());
		
		Person personOne = new Person();
		personOne.setName("John");
		personOne.setLastName("Smith");
		personOne.setId(192);
		personOne.setCity("New York");
		
		System.out.println(personOne.getName() + " " + personOne.getLastName() + " lives in " + personOne.getCity() + " and his ID is " + personOne.getId() + "." );
		
		personOne.sayHello();
		
		Boss bossOne = new Boss("John", "Doe", 324567, "Osijek", 7654);
		
		bossOne.sayHello();
		
		Worker workerOne = new Worker("Adam", "Last Name", 1333, "Donji Miholjac", 666);
		
		workerOne.sayHello();
	}
}
