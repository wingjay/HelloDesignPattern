Transform a object to another interface.
For example, now we have 220 volt, but we need 5 volt. So our adapter will receive 220 volt and do some transformation, return back 5 volt.

1. Now we have 220 volt
```java
class Volt220 {
	public int provideVolt() {
		return 220;
	}
}
```

2. Create a IVolt5 interface and make our adapter implements this interface to make sure our adapter is able to provide 5 volt.
```java
interface IVolt5 {
	public int provideVolt5();
}
class Volt220To5Adapter implements IVolt5 {
	@Override
	public int provideVolt5() {
		// We must get 220 volt first.
	}
}
```

3. In order to get 5 volt, We must get 220 volt first.
We have two methods:
- Class Adapter : make Volt220To5Adapter extends Volt220;
- Object Adapter : Get a Volt220 instance in Volt220To5Adapter.
```java
class Volt220To5Adapter extends Volt220 implements IVolt5 {
	@Override
	public int provideVolt5() {
		int volt_220_value = `provideVolt()`;
		// transform 220 -> 5 and return back.
	}
}
```
```java
class Volt220To5Adapter implements IVolt5 {
	Volt220 volt220 = new Volt220();
	@Override
	public int provideVolt5() {
		int volt_220_value = `volt220.provideVolt()`;
		// transform 220 -> 5 and return back.
	}
}
```
