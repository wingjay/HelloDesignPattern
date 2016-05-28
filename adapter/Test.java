/**
* Now we have 220Volt, but we need 5 volt. We can use our adapter to transform.
*/
public class Test {

	public static void main(String[] args) {
		AdapterFrom220To5Volt adapter = new AdapterFrom220To5Volt();
		System.out.println("adapter will provide " + adapter.provide5Volt() + " Volt!");
	}

}