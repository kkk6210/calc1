package calculatorN;

public class calculatorN {
	
	private int result = 0;
	
	public void add(int a, int b)
	{
		result = a+b;
	}
	public void sub(int a, int b)
	{
		result = a-b;
	}
	public void multi(int a, int b)
	{
		result = a*b;
	}
	
	public void div(int a, int b)
	{
		if(b != 0) // �и� 0�ΰ��
			result = a/b;
	}
	
	public int getResult()
	{
		return result;
	}

}
