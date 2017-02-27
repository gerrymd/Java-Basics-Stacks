
interface IStack
{
	void push(int item) throws StackFullException;
	int pop() throws StackEmptyException;
	boolean is_empty();
	boolean is_full();
}