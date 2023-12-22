package Linked_List;
class Node{
	Node next;
	int data;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class Linked_List1 {
	public Node start=null;
	public  void insert_at_beginning(int data) {
		Node a=new Node(data);
		a.next=start;
		a=start;
	}
	public void insert_at_end(int data) {
		Node a=new Node(data);
		Node temp=start;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=a;
		a.next=null;
	}
	public void delete_at_beginning() {
	if(start==null) {System.out.println("List is Empty");}
	else {start=start.next;}	
	}
	public void delete_at_end() {
		if(start==null) {System.out.println("List is Empty");}
		else {
			Node temp=start;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		}
	}
	public int count() {
		Node temp=start;
		int count=0;
		while(temp.next!=null) {
			count++;
		}
		return count;
	}
	public void insert_at_any_position(int data,int pos) {
		if (pos==1) {insert_at_beginning(data);}
		if (pos==count()+1) {insert_at_end(data);}
		else {
			Node c=new Node(data);
			Node temp1=start;
			for(int i=0;i<=count();i++) {
			while(i+2!=pos) {
				temp1=temp1.next;
				}
			c.next=temp1.next;
			temp1.next=c;
			}
		}
	}
	public void delete_at_any_position(int pos) {
		if(start!=null) {
			System.out.println("Empty List");
		}
		else if(pos==1) {
			delete_at_beginning();
		}
		else if(pos==count()+1) {
			delete_at_end();
		}
		else {
			
		}
				
	}
}



















