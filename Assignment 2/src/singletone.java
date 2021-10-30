
class Singleton {
	private static Singleton single_instance = null;

	public String a;

	private Singleton()
	{
		a = "Hello I am a string ";
	}
	public static Singleton Singleton()
	{
		if (single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
}

class singletone {
	public static void main(String args[])
	{
		Singleton x = Singleton.Singleton();
		Singleton y = Singleton.Singleton();
		Singleton z = Singleton.Singleton();
		x.a = (x.a).toUpperCase();

		System.out.println("String from x is " + x.a);
		System.out.println("String from y is " + y.a);
		System.out.println("String from z is " + z.a);
		System.out.println("\n");

		z.a = (z.a).toLowerCase();

		System.out.println("String from x is " + x.a);
		System.out.println("String from y is " + y.a);
		System.out.println("String from z is " + z.a);
	}
}