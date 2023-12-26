package mixture;

public class parent
{ 
	int abc;
	public void m1(int abc )
	{
		this.abc=abc;
}
	public static void main(String[] args)
	{
		parent ab=new parent ();
		ab.m1(12);
		System.out.println(ab.abc);
		
	}
}