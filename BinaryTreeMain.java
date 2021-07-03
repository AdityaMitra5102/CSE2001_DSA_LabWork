import java.util.*;
public class BinaryTreeMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers?");
		int k=sc.nextInt();
		BinaryTree ob=new BinaryTree();
		for(int i=0;i<k;i++)
		{
			ob.add(sc.nextInt());
		}
		System.out.println("Showing preorder");
		ob.preorder();
		System.out.println("Showing inorder");
		ob.inorder();
		System.out.println("Showing postorder");
		ob.postorder();
	}
}
