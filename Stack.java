public class Stack {
	int arr[];
	int top;
	Stack(int size)
	{
		arr=new int[size];
		top=-1;
	}
	
	void push(int data)
	{
		if(!isFull())
		{
			arr[++top]=data;
		}
		else
		{
			//System.out.println("Error: Stack full");
		}
	}
	int pop()
	{
		if(!isEmpty())
		{
			return arr[top--];
		}
		else
		{
			//System.out.println("Error: Stack Empty");
			return -1;
		}
	}
	int peek()
	{

		if(!isEmpty())
		{
			return arr[top];
		}
		else
		{
			//System.out.println("Error: Stack Empty");
			return -1;
		}
	}
	int count()
	{
		return top+1;
	}
	void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	boolean isFull()
	{
		return top==arr.length-1;
	}
	boolean isEmpty()
	{
		return top==-1;
	}

}

