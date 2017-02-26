

public class Stack1 implements IStack
{
	private int size_;
	private int[] array_;
	private int pos_;

	public Stack1(int size) 
	{
		size_ = size;
		array_ = new int[size];
		pos_ = 0;
	}
	public void push(int item) throws StackFullException
	{
		if(pos_ == size_)
			throw new StackFullException("stack full");
		else
		{
			array_[pos_] = item;
			pos_++;
		}	
	} 
	public int pop() throws StackEmptyException
	{
		if(pos_ == 0)
			throw new StackEmptyException("stack empty");
		else
		{
			pos_--;
			return array_[pos_];
		}
	}
	public boolean is_empty()
	{
		return pos_ == 0;
	}
	public boolean is_full()
	{
		return pos_ == size_;
	}
}