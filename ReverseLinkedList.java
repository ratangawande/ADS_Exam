class ReverseLinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data =d;
			next = null;
		}
	}
	void reverse()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data);
			n=n.next;
		}
	}
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next= head;
		head = new_node;
	}
	void insertAfter(Node prev, int new_data)
	{
		if (prev == null)
		{
			System.out.println("Insertion is not possible");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;
	}

	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.next = null;
		Node n= head;
		while(n.next !=null)
		{
			n=n.next;
		}
		n.next = new_node;
		return;
	}
	
	public static void main(String arg[])
	{
		ReverseLinkedList l1 = new ReverseLinkedList();
		System.out.print("Sample Data:");
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.reverse();
		System.out.println();
		System.out.print("Test Case1 Data:");
		System.out.println();
		l1.insert(1);
		l1.insert(5);
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.reverse();
		System.out.println();
		System.out.print("Test Case2 Data:");
		System.out.println();
		l1.insert(2);
		l1.insert(4);
		l1.insert(3);
		l1.insert(4);
		l1.insert(2);
		l1.insert(5);
		
		l1.reverse();
		
		
	}
}

			
			
	
	


