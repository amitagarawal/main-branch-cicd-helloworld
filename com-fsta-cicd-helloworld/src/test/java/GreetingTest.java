import org.junit.jupiter.api.*;

public class GreetingTest {

	@Test
	public void test() {
		Greeting obj = new Greeting();
		
		String greetingString = obj.giveGreeting();
		Assertions.assertEquals("Hello", greetingString);
	}

}
