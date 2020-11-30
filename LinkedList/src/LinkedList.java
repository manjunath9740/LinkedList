
public class LinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;
	Node tail;
	int size = 0;
	public void add(int data) {
		Node n = new Node(data);
		if(head==null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
		size++;
		System.out.println(this);
	}
	public void add(int data,int index) {
		if(index<0||index>(size-1)) {
			System.out.println("Index out of range");
			return;
		}
		Node cur = head;
		Node prev = null;
		int i=0;
		while(cur != null && i != index) {
			prev = cur;
			cur = cur.next;
			i++;
		}
		Node newNode = new Node(data);
		if(prev==null) {
			newNode.next = head;
			head = newNode;
			
		}
		else {
			prev.next = newNode;
			newNode.next = cur;
		}
		size++;
		System.out.println(this);
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node cur = head;
		
		while(cur!=null) {
			sb.append(cur.data).append(",");
			cur = cur.next;
		}
		if(sb.length()>1) {
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList ls = new LinkedList();
       ls.add(100);
       ls.add(200);
       ls.add(300);
       ls.add(50,0);
       //System.out.println(ls);
	}

}
