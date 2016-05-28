/**
* This adapter will be used to tranform 220 Volt -> 5 Volt
*/
public class AdapterFrom220To5Volt extends Adaptee220Volt implements TargetI5Volt {

	@Override
	public int provide5Volt() {
		// get 220 volt
		int volt220 = provideVolt();
		// transform 220 -> 5
		int volt5 = volt220 / 44;
		// return back 5Volt
		return volt5;
	}

}