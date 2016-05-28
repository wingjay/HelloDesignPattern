/**
* This class is able to provide 220 Volt.
*/
public class Adaptee220Volt implements IVolt {
	@Override
	public int provideVolt() {
		return 220;
	}
}