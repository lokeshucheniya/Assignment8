//Class test person to check functioning of class person
public class TestPerson {

	public static void main(String[] args) {
		Person ram = new Person("Sample1",23,7,2010);
		Person shyam = new Person("Sample2",12,2,2018);
		ram.display();
		shyam.display();
		shyam.olderOne(ram);
	}

}  