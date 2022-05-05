class Stack
{
	private int max;
	private long[] S1;
	private int top;
	private int top2;
	Stack(int s)
	{
		top = -1;
		top2 = -1;
		max = s;
	 S1 = new long[max];
	}
	public void push(long x)
	{
		S1[++top] = x;
		
	}
	public void push1(long x)
	{
		
		S1[++top2] = x;
	}
	public long pop()
	{
		return S1[top--];
	}
	public long pop1()
	{
		return S1[top2--];
	}
	public long peak()
	{
		return S1[top];
	}
	public long peak1()
	{
		return S1[top2];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isEmpty1()
	{
		return (top2 == -1);
	}
	public boolean isFull()
	{
		return (top >= (max-1));
	}
	public boolean isFull1()
	{
		return (top2 >= (max-1));
	}
	public void display()
	{
		for(int i=0; i<=top; i++)
		{
			System.out.println(S1[i]);
		}
		for(int i=0; i<=top2; i++)
		{
			System.out.println(S1[i]);
		}
	}
}
class StackDriver
{
	public static void main(String args[])
	{
		Stack s1 = new Stack(6);
		
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.push(11);
		s1.push(7);
		s1.push(40);
		s1.display();
		System.out.println("============");
		System.out.println("element popped:");
		s1.pop();
		s1.display();
		
		Stack s2 = new Stack(5);
		s2.push(5);
		s2.push(10);
		s2.push(15);
		s2.push(11);
		s2.push(7);
		
		s2.display();
		System.out.println("============");
		System.out.println("element popped:");
		s2.pop();
		s2.display();
		s2.pop();
		s2.display();
		s2.pop()
		s2.display();
	}
}



		
