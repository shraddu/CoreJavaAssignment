

  abstract class abstraction
 {
    void show()
   {
	System.out.println("Shraddha ");    
   }
    public abstract void call();
    
}
 class b extends abstraction
 {
	 public void call()
	 {
		 System.out.println("vaidya");
	 }
 }
class principle{
	public static void main(String args[])
	{
		abstraction obj =new b();
		obj.show();
		obj.call();
	}
}