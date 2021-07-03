
import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		int choice;
		int data1, data2;
		Scanner input = new Scanner(System.in);
		
			System.out.println("\n Enter your choice: ");
			System.out.println("1. Print or Treverse the current state of Linked List");
			System.out.println("2. Insert at End ");
			System.out.println("3. Insert at start ");
			System.out.println("4. Insert after Specified node ");
			
			System.out.println("5. Delete from start element ");		
			System.out.println("6. Delete at End ");
			System.out.println("7. Delete after specied node");
			
			System.out.println("8. Find if specied node present or not ");
			System.out.println("9. Count number of nodes in current state of Linked list");
			System.out.println("10. Find and replace the value of at a specified node");
			System.out.println("11. Exit");
			while(true)//Intentionally moved the menu out of loop for easier screenshot
			{
				System.out.println("Enter choice");
			int number = input.nextInt();
			
			switch(number) {
			  case 1:
			    // code block
				  LL.show();
			    break;
			  case 2:
			    // code block
				  System.out.println("Enter the data for the node that you want to insert at end");
				  data1 = input.nextInt();
				  LL.insertAtEnd(data1);
			    break;
			    
			  case 3:
				    // code block
				  System.out.println("Enter the data for the node that you want to insert at start");
				  data1 = input.nextInt();
				  LL.insertAtStart(data1);
				    break;
			  case 4:
				    // code block
				  System.out.println("Enter the data for the node after which you want to insert and data what to insert");
				  data1 = input.nextInt();
				  data2 = input.nextInt();
				  if(LL.insertAfterNode(data1,data2))
				  {
					  System.out.println("Operation successful");
				  }
				  else
				  {
					  System.out.println("Operation failed");
				  }
			        break;
			  case 5:
				  if(LL.deleteAtStart())
				  {
					  System.out.println("Operation successful");
				  }
				  else
				  {
					  System.out.println("Operation failed");
				  }
				    // code block
			        break;
			  case 6:
				  if(LL.deleteAtEnd())
				  {
					  System.out.println("Operation successful");
				  }
				  else
				  {
					  System.out.println("Operation failed");
				  }	
				    // code block
			        break;
			  case 7:
				  System.out.println("Enter the data for the node after which you want delete");
				  data1 = input.nextInt();
				  if(LL.deleteAfterNode(data1))
				  {
					  System.out.println("Operation successful");
				  }
				  else
				  {
					  System.out.println("Operation failed");
				  }
				    // code block
			        break;
			  case 8:
				  System.out.println("Enter the data for the node after which you want to find");
				  data1 = input.nextInt();
				  if(LL.findNode(data1)!=null)
				  {
					  System.out.println("Search successful");
				  }
				  else
				  {
					  System.out.println("Search failed");
				  }
				   
				    // code block
			        break;
			  case 9:
				    // code block
				  System.out.println(LL.countNodes()+" nodes");
			        break;
			  case 10:
				  System.out.println("Enter the data to find and replace");
				  data1 = input.nextInt();
				  data2 = input.nextInt();
				  if(LL.findAndReplace(data1,data2))
				  {
					  System.out.println("Operation successful");
				  }
				  else
				  {
					  System.out.println("Operation failed");
				  }
				    // code block
			        break;
			  case 11:
				  System.exit(0);
			        break;
			  default:
				  System.out.println("Invalid input");
			    // code block
			}
			
		}
	}

}
