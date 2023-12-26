package mixture;

public class child 
{
	float  a;
	public void m1(int abc)
	{
		this.a=abc;
	}
	
public static void main(String[] args) 
{
	child obj=new child();
	obj.m1(123);
	System.out.println("the value local of abc"+obj.abc); 
	
	
}
}
