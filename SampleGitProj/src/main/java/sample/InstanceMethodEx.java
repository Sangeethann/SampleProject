package sample;

public class InstanceMethodEx {
	//Instance method

	public static void main(String[] args) {
		InstanceMethodEx obj=new InstanceMethodEx();
		obj.display(5);
	}
	public int factorial(int n)
	{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return (fact);
	}
	public void display(int num)
	{
		int result=this.factorial(num);
		System.out.println("Factorial of number="+result);
	}

}
