import java.util.*;
class LinkList
{
	Node head=null;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String args[])
	{
		int ch,x,loc;
		Scanner sc=new Scanner(System.in);
		LinkList ls=new LinkList();
		do{
		System.out.println("\n \tSelect Your Choice: ");
		System.out.println("1. Insert at begging");
		System.out.println("2. Insert at end");
		System.out.println("3. Insert at desired Location ");
		System.out.println("4. Deletion of desired Location ");
		System.out.println("5. Deletion of Last Node ");
		System.out.println("6. Update desired Location ");	
		System.out.println("7. Search");
		System.out.println("8. Display");
		System.out.println("0. Exit");
	
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter value to insert");
				x=sc.nextInt();
				ls=insert_first(ls,x);
				display(ls);
				break;
			case 2:							
	 			System.out.println("Enter value to insert");
				x=sc.nextInt();
				
				ls=insert_last(ls,x);
				display(ls);
				break;
			case 3:
				System.out.println("Enter value to insert");
				x=sc.nextInt();
				System.out.println("Enter Location");
				loc=sc.nextInt();
				ls=insert(ls,x,loc);
				display(ls);
				break;
			case 4:
				System.out.println("Enter Location for deletion");
				loc=sc.nextInt();
				ls=delete_node(ls,loc);
				display(ls);
				break;
			case 5:
				ls=delete_last(ls);
				display(ls);
				break;
			case 6:
				System.out.println("Enter Location");
				loc=sc.nextInt();
				System.out.println("Enter value to update");
				x=sc.nextInt();
				
				ls=update_node(ls,x,loc);
				display(ls);
				break;
			case 7:
				System.out.println("Enter value to be searched");
				x=sc.nextInt();
				search_node(ls,x);
			case 8:
				display(ls);
				break;
			case 0:
				break;
			default:
				System.out.println("invalid choice:");
				break;
		}
	}while(ch!=0);
	}
	public static void search_node(LinkList ls,int x)
	{
		Node curr=ls.head;
		int i=1;
		while(curr!=null)
		{
			if(curr.data==x)
			{
				System.out.println("Key Found at locaton : "+i);
				return;
			}
			else
			{
				curr=curr.next;
				i++;
			}
		}
		System.out.println("Value not found");
	}
	public static LinkList insert_first(LinkList ls,int x)
	{
		Node node=new Node(x);
		node.next=ls.head;
		ls.head=node;
		return ls;
	}
	public static LinkList update_node(LinkList ls,int x,int loc)
	{
		if(ls.head==null)
		{
			System.out.println("List Underflow");
		}
		else{
			Node curr=ls.head;
			if(loc==1)
			{
				curr.data=x;
			}
			else{
				int i=1;
				while(curr!=null)
				{
					
					System.out.println(i);
					if(loc==i)
					{
						curr.data=x;
					}
					else{
						curr=curr.next;
						
					}
					i++;
				}
				System.out.println("Position not found");
			}
		}
		return ls;
	}
	public static LinkList delete_last(LinkList ls)
	{
		Node curr=ls.head,temp=null;
		if(ls.head==null)
		{
			System.out.println("List Underflow");
			return ls;
		}
		if(ls.head.next==null)
		{
			ls.head=null;
			return ls;
		}
		else
		{
			while(curr.next.next!=null)
			{
				curr=curr.next;
			}
			curr.next=null;
			return ls;
		}
	}
	public static LinkList delete_node(LinkList ls,int loc)
	{
		Node curr=ls.head,temp=null;
		if(ls.head==null)
		{
			System.out.println("List Underflow");
			return ls;
		}
		else
		{
			if(loc==1)
			{
				ls.head=curr.next;
				curr.next=null;
				return ls;
			}
			else{
				int i=1;
				while(curr.next!=null)
				{
					if(i==loc-1)
					{
						temp=curr.next;
						curr.next=temp.next;
						temp=null;
						return ls;
					}
					else{
					curr=curr.next;
					i++;
					}
				}
				System.out.println("Position not found");
				return ls;
			}
		}
	}
	public static void display(LinkList ls)
	{
		Node temp=ls.head;
		if(ls.head==null)
		{
			System.out.println("List Underflow");
		}
		else{
		System.out.println("Linked List:  ");
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
		}
	}
	public static LinkList insert_last(LinkList ls,int x)
	{
		Node node=new Node(x);
		if(ls.head==null)
		{
			ls.head=node;
		}
		else
		{
			Node temp=ls.head;
			while(temp.next!=null)
			{
			temp=temp.next;
			}
			temp.next=node;
		}
		return ls;
	}
	public static LinkList insert(LinkList ls,int x,int loc)
	{
		Node node=new Node(x);
		if(loc==1)
		{
			node.next=ls.head;
			ls.head=node;
			return ls;
		}
		else
		{
			Node temp=ls.head;
			int i=1;
			while(temp!=null)
			{
				if(i==loc-1)
				{
					node.next=temp.next;
					temp.next=node;
					return ls;
				}
				i++;
				temp=temp.next;
			}
			System.out.println("Location not found");
			return ls;
		}
	}
}