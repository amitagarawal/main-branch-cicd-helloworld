import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GreetingTest {

	@Test
	public void test() {
		Greeting obj = new Greeting();
		
		String greetingString = obj.giveGreeting();
		Assert.assertEquals("Hello", greetingString);
	}

}
