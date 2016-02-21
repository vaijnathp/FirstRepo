package helloWorld;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hw=new HelloWorld("Hello World");
		hw.print();
	}

}
