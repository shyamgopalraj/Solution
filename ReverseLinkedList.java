import java.util.Scanner;

public class ReverseLinkedList 
{
	
	public static Node createList(int data,Node head)
	{
		if(head==null)
		{
			head = new Node(data);
			return head;
		}
		Node cur = head;
		while(cur.next!=null)
		{
			cur = cur.next;
		}
		cur.next = new Node(data);
		return head;
		
	}
	
	public static void display(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.value+",");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node reverseList(Node head)
	{
		Node prev = head;		
		
		while(prev.next!=null)
		{
			Node cur = prev.next;
			prev.next = cur.next;
			cur.next = head;
			head = cur;
		}
		return head;
	}
	
	public static void main(String[] args) 
	{
		Node head = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values to create LinkedList : ");
		while(input.hasNext())
		{
			int val = input.nextInt();
			head = createList(val, head);
		}
		System.out.println("contents of the linked list before reversing : ");
		display(head);
		head = reverseList(head);
		System.out.println("contents of the linked list after reversing : ");
		display(head);
		input.close();
	}

}
