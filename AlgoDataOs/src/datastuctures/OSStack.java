package datastuctures;

public class OSStack<E> implements Stack<E> {

	@SuppressWarnings("unchecked")
	private E[] stor = (E[]) new Object [64]; // stack storage
	private int pointer = -1; // stack pointer
	
	@Override
	public void push(E o) throws NullPointerException{
		if (o == null) 
			throw new NullPointerException();			
		stor[++pointer] = o;		
	}

	@Override
	public E pop() {
		return stor[pointer--];
	}

	@Override
	public E top() {
		return null;
	}

	@Override
	public int size() {
		return pointer;
	}

	@Override
	public boolean isEmpty() {
		return pointer == 0;
	}

}
