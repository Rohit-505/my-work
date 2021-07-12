package NonLinear;

class node{
	int data;
	node left;
	node right;
	node(int v){
		data=v;
		left=null;
		right=null;
	}
}
public class BST {
	node head;
	
	
	BST(){
		head=null;
	}
	void insert(int v) {
		node temp=new node(v);
		  node ptr=temp;
		if(head==null) {
			head=ptr;
			System.out.println("key added in root");
			
		}
		else {
			ptr=head;
			while(ptr!=null) {
				if(v>ptr.data) {
					if(ptr.right==null) {
						ptr.right=temp;
						System.out.println("key added in right");
						break;
					}
					else {
						ptr=ptr.right;
					}
				}
				else if(v<ptr.data) {
					if(ptr.left==null) {
						ptr.left=temp;
						System.out.println("key added in left");
						break;
					}
					else {
						ptr=ptr.left;
					}
				}
			}
			ptr=head;
		}
	}
	

	public void inorder() {
		node temp=head;
		NodeStack s=new NodeStack();
		while(temp!=null || s.top!=-1) {
			if(temp!=null) {
				s.push(temp);
				temp=temp.left;
				continue;
			}
			else {
				temp=s.top();
				System.out.print(temp.data+" ");
				s.pop();
				temp=temp.right;
			}
		}
		
	}
	
	
}// class closed
