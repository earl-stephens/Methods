package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.sayHello();
		person1.sayMyName("Jack");
		person1.sayMyName(person1.name);
		
	}

}
