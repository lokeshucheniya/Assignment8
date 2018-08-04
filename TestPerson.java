//Class test person to check functioning of class person
public class TestPerson {

	public static void main(String[] args) {
		Person ram = new Person("Sample1",23,7,2010);		//Passing inputs to class Person
		Person shyam = new Person("Sample2",12,2,2018);		//Passing inputs to class Person
		//Calling method display
		ram.display();						
		shyam.display();	
		shyam.olderOne(ram);
	}

}  
