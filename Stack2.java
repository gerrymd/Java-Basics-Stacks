

public class Stack2 implements IStack
{
	private Node sp_ = null;
	public Stack2() 
	{
	}
	public void push(int item) throws StackFullException
	{
		Node temp = new Node(item);
		temp.link_ = sp_;
		sp_ = temp;
			
	} 
	public int pop() throws StackEmptyException
	{
		if(sp_ == null)
			throw new StackEmptyException("stack empty");
		else
		{
			Node temp = sp_;
			int key = temp.key_;
			sp_ = temp.link_;
			temp = null;
			return key;
		}
	}
	public boolean is_empty()
	{
		return sp_ == null;
	}
	public boolean is_full()
	{
		return false;
	}
}

class Node
{
	Node(int key) { key_ = key; }
	int key_;
	Node link_ = null;
}