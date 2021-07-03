public class Queue 
{
	int arr[];
	int front;
	int rear;
	Queue(int n)
	{
		arr=new int[n];
		front=-1;
		rear=-1;
	}
	boolean isFull()
	{
		return rear==arr.length-1;
	}
	boolean isEmpty()
	{
		return front==-1;
	}
	
	void enqueue(int n)
	{
		if(!isFull())
		{
			if(isEmpty())
			{
				front=0;
			}
			arr[++rear]=n;
		}
		else
		{
			System.out.println("Queue Full");
		}
	}
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty");
			return -1;
		}
		int temp=arr[front];
		front+=1;
		if(front>rear)//Clear memory
		{
			front=-1;
			rear=-1;
		}
		return temp;
	}
	
	int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty");
			return -1;
		}
		return arr[front];
	}
	void show()
	{
		if(isEmpty())
		{
			System.out.println("Queue Empty");
			return;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	int count()
	{
		if(isEmpty()) return 0;
		return rear-front+1;
	}
	
	int search(int elem)
	{
		if(isEmpty()) return -1;
		for(int i=front;i<=rear;i++)
		{
			if(arr[i]==elem)
			{
				return i-front+1;
			}
		}
		return -1;
	}
	
}
