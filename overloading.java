
public class overloading {

	static int add(int a,int b)
		{
			return a+b;	
		}
	static int add(int a,int b, int c)
		{
			return a+b+c;
		}
	
 
	public static void main(String[] args)
	{
		
	System.out.println(overloading.add(12, 10));
	System.out.println(overloading.add(20, 25,25));
	}

}
