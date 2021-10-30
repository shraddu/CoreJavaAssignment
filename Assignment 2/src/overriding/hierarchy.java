package overriding;
class employee
{ 
	  int salary_manager=0;
     int salary_labour=0;
     int overtime=200;
     int incentives=5000;
	public void salary()
	{
		 salary_manager=salary_manager+incentives;
		 salary_labour=salary_labour+overtime;
		 System.out.println(salary_manager);
		 System.out.println(salary_labour);
		 
	}
}
	class manager extends employee
	{ 
		int salary_manager=0;
	    int incentives=5000;
		public void salary()
		{
			 salary_manager=salary_manager+incentives;
			 System.out.println(salary_manager);
		}
		
	}
	
	
	class labour extends employee
	{  
		int salary_labour=0;
	    int overtime=400;
		public void salary()
		{
			salary_labour=salary_labour+overtime;
			 System.out.println(salary_labour);
		}
	}
	



public class hierarchy {
	
public static void main(String args[])
{
	 manager ab=new manager();
	ab.salary();
	
}
}
